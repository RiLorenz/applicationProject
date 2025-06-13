package com.aareal.bankingapp;

import java.math.BigDecimal;

public class BankingApp {

    public static void main(String[] args) {
        Account accountA = new Account("DE01", new BigDecimal("1000.00"));
        Account accountB = new Account("DE02", new BigDecimal("500.00"));

        TransactionService service = new TransactionService();

        System.out.println("Before transfer:");
        System.out.println("Balance Account A: " + accountA.getBalance());
        System.out.println("Balance Account B: " + accountB.getBalance());

        boolean success = service.executeTransfer(accountA, accountB, new BigDecimal("200.00"));

        System.out.println("\nTransfer successful: " + success);
        System.out.println("\nAfter transfer:");
        System.out.println("Balance Account A: " + accountA.getBalance());
        System.out.println("Balance Account B: " + accountB.getBalance());
    }
}
