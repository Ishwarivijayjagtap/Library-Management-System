package com.bookSystem;
import java.util.*;

public class LibraryService {
    private BookOperations bookDao;
    private UserDataOperation userDao;
    private TransactionOpration transactionDao;
    private int bookIdCounter = 1;
    private int userIdCounter = 1;
    private int transactionIdCounter = 1;

    public LibraryService(BookOperations bookDao, UserDataOperation userDao, TransactionOpration transactionDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
        this.transactionDao = transactionDao;
    }

    public void addBook(String title, String author, String publisher, String isbn) {
        Book book = new Book(bookIdCounter++, title, author, publisher, isbn, true);
        bookDao.addBook(book);
    }

    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    public void addUser(String name, String email) {
        User user = new User(userIdCounter++, name, email);
        userDao.addUser(user);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void borrowBook(int userId, int bookId) {
        Book book = bookDao.getBookById(bookId);
        if (book != null && book.isAvailability()) {
            book.setAvailability(false);
            bookDao.updateBook(book);
            Transaction transaction = new Transaction(transactionIdCounter++, userId, bookId, "borrow", new Date());
            transactionDao.addTransaction(transaction);
        }
    }

    public void returnBook(int userId, int bookId) {
        Book book = bookDao.getBookById(bookId);
        if (book != null && !book.isAvailability()) {
            book.setAvailability(true);
            bookDao.updateBook(book);
            Transaction transaction = new Transaction(transactionIdCounter++, userId, bookId, "return", new Date());
            transactionDao.addTransaction(transaction);
        }
    }

    public List<Transaction> getAllTransactions() {
        return transactionDao.getAllTransactions();
    }
}
