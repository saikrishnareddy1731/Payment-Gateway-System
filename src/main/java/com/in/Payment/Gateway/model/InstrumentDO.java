package com.in.Payment.Gateway.model;

public class InstrumentDO {
    private int instrumentId;
    private int userId;
    private InstrumentType type;
    private String bankAccountNo;
    private String ifscCode;
    private String cardNumber;
    private String cvvNumber;

    public InstrumentDO(int instrumentId, int userId, InstrumentType type) {
        this.instrumentId = instrumentId;
        this.userId = userId;
        this.type = type;
    }

    // Getters and setters
    public int getInstrumentId() { return instrumentId; }
    public void setInstrumentId(int instrumentId) { this.instrumentId = instrumentId; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public InstrumentType getType() { return type; }
    public void setType(InstrumentType type) { this.type = type; }
    public String getBankAccountNo() { return bankAccountNo; }
    public void setBankAccountNo(String bankAccountNo) { this.bankAccountNo = bankAccountNo; }
    public String getIfscCode() { return ifscCode; }
    public void setIfscCode(String ifscCode) { this.ifscCode = ifscCode; }
    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }
    public String getCvvNumber() { return cvvNumber; }
    public void setCvvNumber(String cvvNumber) { this.cvvNumber = cvvNumber; }
}