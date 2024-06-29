package com.bookSystem;
import java.util.*;

public class TransactionOpration {
    private Map<Integer, Transaction> transactions = new HashMap<>();

    public void addTransaction(Transaction transaction) {
        transactions.put(transaction.getTransactionId(), transaction);
    }

    public List<Transaction> getAllTransactions() {
        return new ArrayList<>(transactions.values());
    }

    public Transaction getTransactionById(int transactionId) {
        return transactions.get(transactionId);
    }
}




