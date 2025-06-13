package com.aareal.bankingapp;

import java.math.BigDecimal;

/**
 * A service that encapsulates the logic for money transfers.
 */
public class TransactionService {
    /**
     * Executes a money transfer from a source account to a destination account.
     *
     * @param fromAccount The account to debit.
     * @param toAccount   The account to credit.
     * @param amount      The amount to transfer. Must be positive.
     * @return true if the transfer was successful, otherwise false.
     */
    public boolean executeTransfer(Account fromAccount, Account toAccount, BigDecimal amount) {
        //TODO: YOUR IMPLEMENTATION GOES HERE
        throw new UnsupportedOperationException("Feature not implemented yet.");
    }
}
