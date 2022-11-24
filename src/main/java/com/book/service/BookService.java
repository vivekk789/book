package com.book.service;

import java.util.List;

import com.book.entities.Book;

public interface BookService {
	public void saveBook(Book b);
	public List<Book> getBooks();
	public void delete(long id);
	public Book update(long id);
}
