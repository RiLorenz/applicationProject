package com.aareal.bankingapp;

import java.math.BigDecimal;

/**
 * Represents a simple bank account.
 * Use BigDecimal for monetary values to avoid rounding errors.
 */
public class Account {
	private final String iban;
    private BigDecimal balance;

    public Account(String iban, BigDecimal initialBalance) {
        this.iban = iban;
        this.balance = initialBalance;
    }

    public String getIban() {
        return iban;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    // You are allowed to extend this class if needed (e.g., with methods for deposit/withdrawal)
    // e.g., public void deposit(BigDecimal amount) { ... }
    // e.g., public void withdraw(BigDecimal amount) { ... }

}
