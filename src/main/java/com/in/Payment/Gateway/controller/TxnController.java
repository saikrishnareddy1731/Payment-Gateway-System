package com.in.Payment.Gateway.controller;

import com.in.Payment.Gateway.model.Transaction;
import com.in.Payment.Gateway.service.TxnService;

import java.util.List;

public class TxnController {
    private TxnService txnService;

    public TxnController() {
        this.txnService = new TxnService();
    }

    public void makePayment(Transaction transaction) {
        txnService.makePayment(transaction);
    }

    public List<Transaction> getHistory(int userId) {
        return txnService.getHistory(userId);
    }
}
