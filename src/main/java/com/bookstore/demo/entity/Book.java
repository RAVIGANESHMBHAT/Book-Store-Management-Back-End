package com.bookstore.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	private long bookId;
	private String isbn;
	private String bookTitle;
	private String author;
	private String publisher;
	private String genre;
	private long price;
	private long quantity;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(long bookId, String isbn, String bookTitle, String author, String publisher, String genre, long price,
			long quantity) {
		super();
		this.bookId = bookId;
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.author = author;
		this.publisher = publisher;
		this.genre = genre;
		this.price = price;
		this.quantity = quantity;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

}
