package com.in.Payment.Gateway.service;

import com.in.Payment.Gateway.model.InstrumentDO;

import java.util.*;

public abstract class InstrumentService {
    protected static Map<Integer, List<InstrumentDO>> userInstruments = new HashMap<>();

    public abstract void addInstrument(InstrumentDO instrument);

    public abstract InstrumentDO getInstrument(int userId, int instrumentId);
}
