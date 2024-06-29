package com.bookSystem;
import java.util.*;
public class BookOperations {
    private Map<Integer, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public Book getBookById(int bookId) {
        return books.get(bookId);
    }

    public void updateBook(Book book) {
        books.put(book.getBookId(), book);
    }

    public void deleteBook(int bookId) {
        books.remove(bookId);
    }
}



