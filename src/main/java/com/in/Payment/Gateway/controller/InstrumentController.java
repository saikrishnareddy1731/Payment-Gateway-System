package com.in.Payment.Gateway.controller;

import com.in.Payment.Gateway.factory.InstrumentServiceFactory;
import com.in.Payment.Gateway.model.InstrumentDO;
import com.in.Payment.Gateway.service.InstrumentService;

public class InstrumentController {

    public InstrumentController() {
        // Constructor
    }

    public void addInstrument(InstrumentDO instrument) {
        InstrumentService service = InstrumentServiceFactory.getInstrumentService(instrument.getType());
        service.addInstrument(instrument);
    }

    public InstrumentDO getInstrument(InstrumentDO instrument, int userId, int instrumentId) {
        InstrumentService service = InstrumentServiceFactory.getInstrumentService(instrument.getType());
        return service.getInstrument(userId, instrumentId);
    }
}
