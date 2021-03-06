package com.paritytrading.philadelphia.fix42;

/*
 * This file has been automatically generated using Philadelphia Code
 * Generator. For more information on Philadelphia Code Generator, see:
 *
 *   https://github.com/paritytrading/philadelphia
 */

/**
 * Message types for FIX 4.2.
 */
public class FIX42MsgTypes {

    public static final char Heartbeat                     = '0';
    public static final char TestRequest                   = '1';
    public static final char ResendRequest                 = '2';
    public static final char Reject                        = '3';
    public static final char SequenceReset                 = '4';
    public static final char Logout                        = '5';
    public static final char IOI                           = '6';
    public static final char Advertisement                 = '7';
    public static final char ExecutionReport               = '8';
    public static final char OrderCancelReject             = '9';
    public static final char Logon                         = 'A';
    public static final char News                          = 'B';
    public static final char Email                         = 'C';
    public static final char OrderSingle                   = 'D';
    public static final char OrderList                     = 'E';
    public static final char OrderCancelRequest            = 'F';
    public static final char OrderCancelReplaceRequest     = 'G';
    public static final char OrderStatusRequest            = 'H';
    public static final char Allocation                    = 'J';
    public static final char ListCancelRequest             = 'K';
    public static final char ListExecute                   = 'L';
    public static final char ListStatusRequest             = 'M';
    public static final char ListStatus                    = 'N';
    public static final char AllocationInstructionAck      = 'P';
    public static final char DontKnowTrade                 = 'Q';
    public static final char QuoteRequest                  = 'R';
    public static final char Quote                         = 'S';
    public static final char SettlementInstructions        = 'T';
    public static final char MarketDataRequest             = 'V';
    public static final char MarketDataSnapshotFullRefresh = 'W';
    public static final char MarketDataIncrementalRefresh  = 'X';
    public static final char MarketDataRequestReject       = 'Y';
    public static final char QuoteCancel                   = 'Z';
    public static final char QuoteStatusRequest            = 'a';
    public static final char QuoteAcknowledgement          = 'b';
    public static final char SecurityDefinitionRequest     = 'c';
    public static final char SecurityDefinition            = 'd';
    public static final char SecurityStatusRequest         = 'e';
    public static final char SecurityStatus                = 'f';
    public static final char TradingSessionStatusRequest   = 'g';
    public static final char TradingSessionStatus          = 'h';
    public static final char MassQuote                     = 'i';
    public static final char BusinessMessageReject         = 'j';
    public static final char BidRequest                    = 'k';
    public static final char BidResponse                   = 'l';
    public static final char ListStrikePrice               = 'm';

    private FIX42MsgTypes() {
    }

}
