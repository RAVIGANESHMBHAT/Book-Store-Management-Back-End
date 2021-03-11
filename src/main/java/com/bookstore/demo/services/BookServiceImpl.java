package com.bookstore.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.demo.dao.BookDao;
import com.bookstore.demo.entity.Book;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookDao.findAll();
	}

	@Override
	public Book getBook(long bookId) {
		// TODO Auto-generated method stub
		return bookDao.findById(bookId).get();
	}

	@Override
	public Book addBook(Book book) {
		bookDao.save(book);
		return book;
	}

	@Override
	public Book updateBook(Book book) {
		bookDao.save(book);
		return book;
	}

	@Override
	public void deleteBook(long bookId) {
		Book entity = bookDao.getOne(bookId);
		bookDao.delete(entity);
	}

}
