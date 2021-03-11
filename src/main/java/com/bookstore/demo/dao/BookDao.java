package com.bookstore.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.demo.entity.Book;

public interface BookDao extends JpaRepository<Book, Long>{

}
