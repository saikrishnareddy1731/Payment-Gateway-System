package com.in.Payment.Gateway.entity;


import com.in.Payment.Gateway.model.InstrumentType;

public class InstrumentEntity {
    private int instrumentId;
    private int userId;
    private InstrumentType type;

    public InstrumentEntity(int instrumentId, int userId, InstrumentType type) {
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
}