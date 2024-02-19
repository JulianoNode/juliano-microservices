package com.docker.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.model.Book;

@RestController
@RequestMapping("book-service")
public class BookController {
	
	@Autowired
	private Environment environment;
	
	// http://localhost:8100/book-service/1/BRL
	// http://localhost:8100/book-service/{id}/{currency}
	@GetMapping(value = "/{id}/{currency}")	
	public Book findBook(
			@PathVariable("id") Long id,
			@PathVariable("currency") String currency ) {
		
		var port = environment.getProperty("local.server.port");
		
		return new Book(1L, "Hillary Rocha", "Docker Deep Dive", new Date(),
				Double.valueOf(13.4), currency, port); 
	}

}
