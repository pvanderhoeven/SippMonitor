package com.broadsoft.sipp.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SippMonitorParser}.
 */
public interface SippMonitorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SippMonitorParser#sippLog}.
	 * @param ctx the parse tree
	 */
	void enterSippMonitor(@NotNull SippMonitorParser.SippMonitorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SippMonitorParser#sippLog}.
	 * @param ctx the parse tree
	 */
	void exitSippMonitor(@NotNull SippMonitorParser.SippMonitorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SippMonitorParser#sippItem}.
	 * @param ctx the parse tree
	 */
	void enterSippItem(@NotNull SippMonitorParser.SippItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SippMonitorParser#sippItem}.
	 * @param ctx the parse tree
	 */
	void exitSippItem(@NotNull SippMonitorParser.SippItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SippMonitorParser#directionLine}.
	 * @param ctx the parse tree
	 */
	void enterDirectionLine(@NotNull SippMonitorParser.DirectionLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SippMonitorParser#directionLine}.
	 * @param ctx the parse tree
	 */
	void exitDirectionLine(@NotNull SippMonitorParser.DirectionLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SippMonitorParser#timeStamp}.
	 * @param ctx the parse tree
	 */
	void enterTimeStamp(@NotNull SippMonitorParser.TimeStampContext ctx);
	/**
	 * Exit a parse tree produced by {@link SippMonitorParser#timeStamp}.
	 * @param ctx the parse tree
	 */
	void exitTimeStamp(@NotNull SippMonitorParser.TimeStampContext ctx);
	/**
	 * Enter a parse tree produced by {@link SippMonitorParser#sipMessage}.
	 * @param ctx the parse tree
	 */
	void enterSipMessage(@NotNull SippMonitorParser.SipMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SippMonitorParser#sipMessage}.
	 * @param ctx the parse tree
	 */
	void exitSipMessage(@NotNull SippMonitorParser.SipMessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SippMonitorParser#sipResponse}.
	 * @param ctx the parse tree
	 */
	void enterSipResponse(@NotNull SippMonitorParser.SipResponseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SippMonitorParser#sipResponse}.
	 * @param ctx the parse tree
	 */
	void exitSipResponse(@NotNull SippMonitorParser.SipResponseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SippMonitorParser#responseLine}.
	 * @param ctx the parse tree
	 */
	void enterResponseLine(@NotNull SippMonitorParser.ResponseLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SippMonitorParser#responseLine}.
	 * @param ctx the parse tree
	 */
	void exitResponseLine(@NotNull SippMonitorParser.ResponseLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SippMonitorParser#sipRequest}.
	 * @param ctx the parse tree
	 */
	void enterSipRequest(@NotNull SippMonitorParser.SipRequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SippMonitorParser#sipRequest}.
	 * @param ctx the parse tree
	 */
	void exitSipRequest(@NotNull SippMonitorParser.SipRequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link SippMonitorParser#requestLine}.
	 * @param ctx the parse tree
	 */
	void enterRequestLine(@NotNull SippMonitorParser.RequestLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SippMonitorParser#requestLine}.
	 * @param ctx the parse tree
	 */
	void exitRequestLine(@NotNull SippMonitorParser.RequestLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SippMonitorParser#sipHeader}.
	 * @param ctx the parse tree
	 */
	void enterSipHeader(@NotNull SippMonitorParser.SipHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SippMonitorParser#sipHeader}.
	 * @param ctx the parse tree
	 */
	void exitSipHeader(@NotNull SippMonitorParser.SipHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SippMonitorParser#sdp}.
	 * @param ctx the parse tree
	 */
	void enterSdp(@NotNull SippMonitorParser.SdpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SippMonitorParser#sdp}.
	 * @param ctx the parse tree
	 */
	void exitSdp(@NotNull SippMonitorParser.SdpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SippMonitorParser#sdpLine}.
	 * @param ctx the parse tree
	 */
	void enterSdpLine(@NotNull SippMonitorParser.SdpLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SippMonitorParser#sdpLine}.
	 * @param ctx the parse tree
	 */
	void exitSdpLine(@NotNull SippMonitorParser.SdpLineContext ctx);
}
