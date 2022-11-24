package com.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entities.Publisher;
import com.book.repositories.PublisherRepository;

@Service
public class PublisherServiceImpl implements PublisherService {
	@Autowired
	private PublisherRepository repo;

	@Override
	public void savePublisher(Publisher p) {
		repo.save(p);
		
	}
	
	
}
