package com.book.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.entities.Book;
import com.book.repositories.BookRepository;

@RestController
public class RestBookController {
	
@Autowired
private BookRepository repo;

@RequestMapping("/book/{id}")
	public Book getOneBook(@PathVariable("id")Long id) {
	Optional<Book> f = repo.findById(id);
	Book book = f.get();
	return book;
}
	
}
