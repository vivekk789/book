package com.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entities.BookIssue;
import com.book.repositories.BookIssueRepository;

@Service
public class BookIssueImpl {
	@Autowired
	private BookIssueRepository repo;
	public void saveIssueBook(BookIssue b) {
		repo.save(b);
		
	}
	
	

}
