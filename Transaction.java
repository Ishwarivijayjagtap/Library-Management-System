package com.bookSystem;
import java.util.Date;

public class Transaction {
    private int transactionId;
    private int userId;
    private int bookId;
    private String transactionType;
    private Date date;

    public Transaction(int transactionId, int userId, int bookId, String transactionType, Date date) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.bookId = bookId;
        this.transactionType = transactionType;
        this.date = date;
    }

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", userId=" + userId + ", bookId=" + bookId
				+ ", transactionType=" + transactionType + ", date=" + date + "]";
	}

    
    // Getters and Setters
    // toString() method for display
}
