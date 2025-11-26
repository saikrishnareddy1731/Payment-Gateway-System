package com.in.Payment.Gateway.model;

public class Transaction {
    private int txnId;
    private int amount;
    private int senderUserId;
    private int receiverUserId;
    private int senderInstrumentId;
    private int creditInstrumentId;
    private TransactionStatus status;

    public Transaction(int txnId, int amount) {
        this.txnId = txnId;
        this.amount = amount;
        this.status = TransactionStatus.PENDING;
    }

    // Getters and setters
    public int getTxnId() { return txnId; }
    public void setTxnId(int txnId) { this.txnId = txnId; }
    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }
    public int getSenderUserId() { return senderUserId; }
    public void setSenderUserId(int senderUserId) { this.senderUserId = senderUserId; }
    public int getReceiverUserId() { return receiverUserId; }
    public void setReceiverUserId(int receiverUserId) { this.receiverUserId = receiverUserId; }
    public int getSenderInstrumentId() { return senderInstrumentId; }
    public void setSenderInstrumentId(int senderInstrumentId) { this.senderInstrumentId = senderInstrumentId; }
    public int getCreditInstrumentId() { return creditInstrumentId; }
    public void setCreditInstrumentId(int creditInstrumentId) { this.creditInstrumentId = creditInstrumentId; }
    public TransactionStatus getStatus() { return status; }
    public void setStatus(TransactionStatus status) { this.status = status; }
}
