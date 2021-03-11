package com.bookstore.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.demo.entity.IssueBook;

public interface IssueBookDao extends JpaRepository<IssueBook, Long>{

}
