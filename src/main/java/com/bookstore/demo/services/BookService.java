package com.bookstore.demo.services;

import java.util.List;

import com.bookstore.demo.entity.Book;



public interface BookService {
	
	public List<Book> getBooks();
	
	public Book getBook(long bookId);
	
	public Book addBook(Book book);
	
	public Book updateBook(Book book);
	
	public void deleteBook(long bookId);

}
