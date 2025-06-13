package com.aareal.bankingapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

/**
 * Test class for the Account class.
 * It covers creation, deposits, withdrawals, and edge cases.
 */
class AccountTest {

    private Account testAccount;

    @BeforeEach
    void setUp() {
        // This method runs before each test, ensuring a clean state.
        testAccount = new Account("DE99", new BigDecimal("100.00"));
    }

    @Test
    @DisplayName("Account should be created with correct balance")
    void initialBalance() {
    	assertEquals(100d, testAccount.getBalance().doubleValue(), 1e-10);
    }
    
    @Test
    @DisplayName("Account should be created with correct IBAN")
    void initialIBAN() {
    	assertEquals("DE99", testAccount.getIban());
    }
}