package com.bookstore.demo.services;

import java.util.List;

import com.bookstore.demo.entity.IssueBook;

public interface IssueBookService {
	
	public List<IssueBook> getAllIssuedBooks();
	
	public IssueBook issueBook(IssueBook issueBook);
	
	public IssueBook updateIssuedBook(IssueBook book);

}
