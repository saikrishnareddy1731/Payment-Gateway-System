package com.in.Payment.Gateway;

import com.in.Payment.Gateway.controller.*;
import com.in.Payment.Gateway.model.InstrumentDO;
import com.in.Payment.Gateway.model.InstrumentType;
import com.in.Payment.Gateway.model.Transaction;
import com.in.Payment.Gateway.model.UserDO;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Payment System Demo ===\n");

        // Initialize controllers
        UserController userController = new UserController();
        InstrumentController instrumentController = new InstrumentController();
        TxnController txnController = new TxnController();

        // Step 1: Create two users
        System.out.println("Step 1: Creating users...");
        UserDO user1 = new UserDO(1, "Alice Smith", "alice@example.com");
        UserDO user2 = new UserDO(2, "Bob Johnson", "bob@example.com");

        userController.addUser(user1);
        userController.addUser(user2);
        System.out.println("Users created successfully!\n");

        // Step 2: Add instruments for User 1 (Alice)
        System.out.println("Step 2: Adding instruments...");

        // Add bank account for Alice
        InstrumentDO aliceBank = new InstrumentDO(101, 1, InstrumentType.BANK);
        aliceBank.setBankAccountNo("1234567890");
        aliceBank.setIfscCode("HDFC0001234");
        instrumentController.addInstrument(aliceBank);

        // Add credit card for Alice
        InstrumentDO aliceCard = new InstrumentDO(102, 1, InstrumentType.CARD);
        aliceCard.setCardNumber("4111111111111111");
        aliceCard.setCvvNumber("123");
        instrumentController.addInstrument(aliceCard);

        // Step 3: Add instruments for User 2 (Bob)
        // Add bank account for Bob
        InstrumentDO bobBank = new InstrumentDO(201, 2, InstrumentType.BANK);
        bobBank.setBankAccountNo("9876543210");
        bobBank.setIfscCode("ICIC0005678");
        instrumentController.addInstrument(bobBank);

        // Add credit card for Bob
        InstrumentDO bobCard = new InstrumentDO(202, 2, InstrumentType.CARD);
        bobCard.setCardNumber("5500000000000004");
        bobCard.setCvvNumber("456");
        instrumentController.addInstrument(bobCard);

        System.out.println("Instruments added successfully!\n");

        // Step 4: Make payment from Alice to Bob
        System.out.println("Step 3: Processing payment...");
        System.out.println("Alice is sending $500 to Bob\n");

        Transaction transaction = new Transaction(1001, 500);
        transaction.setSenderUserId(1);  // Alice
        transaction.setReceiverUserId(2);  // Bob
        transaction.setSenderInstrumentId(101);  // Alice's bank account
        transaction.setCreditInstrumentId(201);  // Bob's bank account

        txnController.makePayment(transaction);

        System.out.println("\nTransaction Status: " + transaction.getStatus());
        System.out.println("Transaction ID: " + transaction.getTxnId());
        System.out.println("Amount: $" + transaction.getAmount());

        // Step 5: Check transaction history
        System.out.println("\n=== Transaction History for Alice ===");
        var history = txnController.getHistory(1);
        for (Transaction txn : history) {
            System.out.println("Transaction #" + txn.getTxnId() +
                    " - Amount: $" + txn.getAmount() +
                    " - Status: " + txn.getStatus());
        }

        System.out.println("\n=== Payment System Demo Complete ===");
    }
}