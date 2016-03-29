package com.broadsoft.sipp.parser;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.PriorityQueue;

public class SippMonitorMscPrinter {
    public static void main(String[] args) throws IOException {
        // ignore standard error
        System.err.close();

        PriorityQueue<SipMessage> messages = new PriorityQueue<>();

        parseSippMonitor(args[0], SippMonitorMscListener.ListenerType.ORIG, messages);
        parseSippMonitor(args[1], SippMonitorMscListener.ListenerType.TERM, messages);

        System.out.println("@startuml");
        System.out.println("participant ORIG");
        System.out.println("participant XS");
        System.out.println("participant TERM");
        for ( SipMessage msg : messages ) {
            MscMessage msc = MscMessage.from(msg);
            System.out.println( msc );
        }
        System.out.println("@enduml");
    }

    private static void parseSippMonitor(String filePath, SippMonitorMscListener.ListenerType type,
                                     PriorityQueue<SipMessage> messages) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream( new FileInputStream( new File(filePath) ) );

        SippMonitorLexer lexer = new SippMonitorLexer( input );

        CommonTokenStream tokens = new CommonTokenStream( lexer );

        SippMonitorParser parser = new SippMonitorParser( tokens );

        ParseTree tree = parser.sippLog();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SippMonitorMscListener(messages,  type), tree);
    }
}
