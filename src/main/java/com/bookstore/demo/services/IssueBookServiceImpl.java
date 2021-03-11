package com.bookstore.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.demo.dao.IssueBookDao;
import com.bookstore.demo.entity.IssueBook;

@Service
public class IssueBookServiceImpl implements IssueBookService{
	
	@Autowired
	private IssueBookDao issueBookDao;

	@Override
	public IssueBook issueBook(IssueBook book) {
		issueBookDao.save(book);
		return book;
	}

	@Override
	public IssueBook updateIssuedBook(IssueBook book) {
		issueBookDao.save(book);
		return book;
	}

	@Override
	public List<IssueBook> getAllIssuedBooks() {
		return issueBookDao.findAll();
	}


}
