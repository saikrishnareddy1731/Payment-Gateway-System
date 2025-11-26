package com.in.Payment.Gateway.processor;


import com.in.Payment.Gateway.model.Transaction;
import com.in.Payment.Gateway.model.TransactionStatus;

public class Processor {

    public void processPayment(Transaction transaction) {
        // Process payment logic
        System.out.println("Processing payment...");

        // Simulate payment processing
        boolean success = performPaymentProcessing(transaction);

        if (success) {
            transaction.setStatus(TransactionStatus.SUCCESS);
            System.out.println("Payment successful for transaction: " + transaction.getTxnId());
        } else {
            transaction.setStatus(TransactionStatus.DENIED);
            System.out.println("Payment denied for transaction: " + transaction.getTxnId());
        }
    }

    private boolean performPaymentProcessing(Transaction transaction) {
        // Actual payment processing logic
        // This would involve calling external payment APIs, validating instruments, etc.
        return true; // Simplified for example
    }
}