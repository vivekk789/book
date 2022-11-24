package com.book.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="book_title",length=120,nullable=true)
	private String bookTitle;
	@Column(name="isbn",length=100,nullable=true)
	private String isbn;
	private Long publisherId;
	@Column(name="book_file_name",length=100,nullable=true)
	private String bookFileName;
	@Column(name="borrow_duration",length=100,nullable=true)
	private String borrowDuration;
	private long borrowPrice;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Long getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(Long publisherId) {
		this.publisherId = publisherId;
	}
	public String getBookFileName() {
		return bookFileName;
	}
	public void setBookFileName(String bookFileName) {
		this.bookFileName = bookFileName;
	}
	public String getBorrowDuration() {
		return borrowDuration;
	}
	public void setBorrowDuration(String borrowDuration) {
		this.borrowDuration = borrowDuration;
	}
	public long getBorrowPrice() {
		return borrowPrice;
	}
	public void setBorrowPrice(long borrowPrice) {
		this.borrowPrice = borrowPrice;
	}

}
