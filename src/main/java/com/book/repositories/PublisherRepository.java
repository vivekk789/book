package com.book.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.entities.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher,Long>{
	
	

}
