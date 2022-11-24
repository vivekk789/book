package com.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entities.Book;
import com.book.repositories.BookRepository;
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookrepo;
	
	public void saveBook(Book b) {
		bookrepo.save(b);
		
	}

	public List<Book> getBooks() {
		List<Book> books = bookrepo.findAll();
		return books;
	}

	public void delete(long id) {
		bookrepo.deleteById(id);
		
	}

	public Book update(long id) {
		Optional<Book> f = bookrepo.findById(id);
		Book book = f.get();
		return book;
	}

}
