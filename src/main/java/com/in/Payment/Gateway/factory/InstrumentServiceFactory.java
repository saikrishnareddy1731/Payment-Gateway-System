package com.in.Payment.Gateway.factory;

import com.in.Payment.Gateway.model.InstrumentType;
import com.in.Payment.Gateway.service.BankService;
import com.in.Payment.Gateway.service.CardService;
import com.in.Payment.Gateway.service.InstrumentService;

public class InstrumentServiceFactory {

    public static InstrumentService getInstrumentService(InstrumentType type) {
        switch (type) {
            case BANK:
                return new BankService();
            case CARD:
                return new CardService();
            default:
                throw new IllegalArgumentException("Invalid instrument type");
        }
    }
}
