package com.in.Payment.Gateway.service;

import com.in.Payment.Gateway.controller.InstrumentController;
import com.in.Payment.Gateway.model.Transaction;
import com.in.Payment.Gateway.processor.Processor;

import java.util.*;

public class TxnService {
    private InstrumentController instCtrlObj;
    private Map<Integer, List<Transaction>> userTransactions = new HashMap<>();
    private Processor processorObj;

    public TxnService() {
        this.processorObj = new Processor();
        this.userTransactions = new HashMap<>();
    }

    public void makePayment(Transaction transaction) {
        // Process payment transaction
        System.out.println("Processing payment for transaction: " + transaction.getTxnId());
        processorObj.processPayment(transaction);

        int userId = transaction.getSenderUserId();
        userTransactions.putIfAbsent(userId, new ArrayList<>());
        userTransactions.get(userId).add(transaction);
    }

    public List<Transaction> getHistory(int userId) {
        return userTransactions.getOrDefault(userId, new ArrayList<>());
    }
}