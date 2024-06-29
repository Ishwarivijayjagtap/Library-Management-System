package com.bookSystem;
public class Book {
    private int bookId;
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private boolean availability;

    public Book(int bookId, String title, String author, String publisher, String isbn, boolean availability) 
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.availability = availability;
    }

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + " title=" + title + " author=" + author + " publisher=" + publisher
				+ " isbn=" + isbn + " availability=" + availability + "]";
	}

    }


