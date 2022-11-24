package com.book.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="publisher")
public class Publisher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long publisher_id;
	@Column(name="publisher_name",length=100,nullable=true)
	private String publisherName;
	
	public Long getPublisher_id() {
		return publisher_id;
	}
	public void setPublisher_id(Long publisher_id) {
		this.publisher_id = publisher_id;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	

}
