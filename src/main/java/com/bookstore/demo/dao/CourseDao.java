package com.bookstore.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.demo.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long>{
	
}
