package com.bookstore.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IssueBook {
	
	@Id
	private long borrowerId;
	private long bookId;
	private String bookName;
	private String borrowerName;
	private String borrowDate;
	private String returnDate;
	private String returnedDate;
	
	public IssueBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public IssueBook(long borrowerId, long bookId, String bookName, String borrowerName, String borrowDate,
			String returnDate, String returnedDate) {
		super();
		this.borrowerId = borrowerId;
		this.bookId = bookId;
		this.bookName = bookName;
		this.borrowerName = borrowerName;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
		this.returnedDate = returnedDate;
	}

	public long getBorrowerId() {
		return borrowerId;
	}
	public void setBorrowerId(long borrowerId) {
		this.borrowerId = borrowerId;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBorrowerName() {
		return borrowerName;
	}
	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}
	public String getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDatet(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getReturnedDate() {
		return returnedDate;
	}
	public void setReturnedDate(String returnedDate) {
		this.returnedDate = returnedDate;
	}
	

}
