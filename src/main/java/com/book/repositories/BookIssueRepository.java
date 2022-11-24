package com.book.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.entities.BookIssue;

public interface BookIssueRepository extends JpaRepository<BookIssue,Long>{

}
