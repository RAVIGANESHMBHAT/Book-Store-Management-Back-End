package com.bookstore.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.demo.entity.Book;
import com.bookstore.demo.entity.IssueBook;
import com.bookstore.demo.services.BookService;
import com.bookstore.demo.services.IssueBookService;

@RestController
public class BookStoreController {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private IssueBookService issueBookService;
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return this.bookService.getBooks();
	}
	
	@GetMapping("/books/{bookId}")
	public Book getBook(@PathVariable long bookId) {	
		return this.bookService.getBook(bookId);
	}
	
	@PostMapping(path="/books", consumes="application/json")
	public Book addBook(@RequestBody Book book) {
		return this.bookService.addBook(book);
	}
	
	@PutMapping(path="/books")
	public Book updateBook(@RequestBody Book book) {
		return this.bookService.updateBook(book);
	}
	
	@DeleteMapping(path="/books/{bookId}")
	public ResponseEntity<HttpStatus> deleteBook(@PathVariable long bookId) {
		try {
			this.bookService.deleteBook(bookId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	//Issue books
	
	@GetMapping(path="/getIssuedBooks")
	public List<IssueBook> getAllIssuedBooks() {
		return this.issueBookService.getAllIssuedBooks();
	}
	
	@PostMapping(path="/issuebook")
	public IssueBook issueBook(@RequestBody IssueBook book) {
		Book oldBook = this.bookService.getBook(book.getBookId());
		oldBook.setQuantity(oldBook.getQuantity()-1);
		this.bookService.updateBook(oldBook);
		return this.issueBookService.issueBook(book);
	}
	
	@PutMapping(path="/issuebook")
	public IssueBook updateIssuedBook(@RequestBody IssueBook book) {
		String returnedDate = book.getReturnedDate();
		if(returnedDate != null) {
			Book oldBook = this.bookService.getBook(book.getBookId());
			oldBook.setQuantity(oldBook.getQuantity()+1);
			this.bookService.updateBook(oldBook);
		}
		return this.issueBookService.updateIssuedBook(book);
	}

}
