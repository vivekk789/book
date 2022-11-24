package com.book.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BookIssue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookIssueId;
	private long bookId;
	private long memberId;
	private Date issuedate; 
	private Date returnDate; 
	private Date dateReturned;
	private long borrowAmount;
	private long lateReturnFeeAmount;
	private long orderId;
	public long getBookIssueId() {
		return bookIssueId;
	}
	public void setBookIssueId(long bookIssueId) {
		this.bookIssueId = bookIssueId;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public long getMemberId() {
		return memberId;
	}
	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}
	public Date getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public Date getDateReturned() {
		return dateReturned;
	}
	public void setDateReturned(Date dateReturned) {
		this.dateReturned = dateReturned;
	}
	public long getBorrowAmount() {
		return borrowAmount;
	}
	public void setBorrowAmount(long borrowAmount) {
		this.borrowAmount = borrowAmount;
	}
	public long getLateReturnFeeAmount() {
		return lateReturnFeeAmount;
	}
	public void setLateReturnFeeAmount(long lateReturnFeeAmount) {
		this.lateReturnFeeAmount = lateReturnFeeAmount;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	
}
