package com.in.Payment.Gateway.service;

import com.in.Payment.Gateway.model.InstrumentDO;

import java.util.*;

public class CardService extends InstrumentService {

    @Override
    public void addInstrument(InstrumentDO instrument) {
        // Card specific logic to create bank
        int userId = instrument.getUserId();
        userInstruments.putIfAbsent(userId, new ArrayList<>());
        userInstruments.get(userId).add(instrument);
        System.out.println("Card instrument added for user: " + userId);
    }

    @Override
    public InstrumentDO getInstrument(int userId, int instrumentId) {
        // Card specific logic to fetch instrument
        List<InstrumentDO> instruments = userInstruments.get(userId);
        if (instruments != null) {
            for (InstrumentDO inst : instruments) {
                if (inst.getInstrumentId() == instrumentId) {
                    return inst;
                }
            }
        }
        return null;
    }
}
