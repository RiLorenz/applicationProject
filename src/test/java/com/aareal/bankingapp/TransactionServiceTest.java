package com.aareal.bankingapp;

import static org.junit.Assert.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TransactionServiceTest {
	private TransactionService transactionService;
	private Account fromAccount;
	private Account toAccount;


	@BeforeEach
	void setUp() throws Exception {
		transactionService = new TransactionService();
		fromAccount = new Account("DE99", new BigDecimal("100.00"));
		toAccount = new Account("AT00", new BigDecimal("50"));
	}

    @Test
    @DisplayName("Initial Transaction should throw exception")
    void testInitialExecuteTransaction() {
    	assertThrows(UnsupportedOperationException.class, () -> transactionService.executeTransfer(fromAccount, toAccount, BigDecimal.valueOf(5)));
    }

}
