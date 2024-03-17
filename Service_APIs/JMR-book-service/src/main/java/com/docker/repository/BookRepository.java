package com.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
}
