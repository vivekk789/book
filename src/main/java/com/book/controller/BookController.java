package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.book.entities.Book;
import com.book.entities.BookIssue;
import com.book.entities.Publisher;
import com.book.service.BookIssueImpl;
import com.book.service.BookServiceImpl;
import com.book.service.PublisherServiceImpl;

@Controller
public class BookController {
	
	@Autowired
	private PublisherServiceImpl pub;
	
	@Autowired
	private BookServiceImpl bookService;
	
	@Autowired
	private BookIssueImpl issuerepo;
	
	@RequestMapping("/book")
	public String publisher(){
		return "bookdetails";
	}

	@RequestMapping("/saveBook")
	public String saveBook(@ModelAttribute("book") Book b , Model model) {
		bookService.saveBook(b);
		List<Book> books = bookService.getBooks();
		model.addAttribute("books",books);
		return "BookTable";
		
	}
	@RequestMapping("/getBooks")
	public String getBooks(Model model) {
		List<Book> books = bookService.getBooks();
		model.addAttribute("books",books);
		return "BookTable";
	}
	
	@RequestMapping("/delete")
	public String deleteBook(@RequestParam("id")long id , Model model) {
	bookService.delete(id);
	List<Book> books = bookService.getBooks();
	model.addAttribute("books",books);
	return "BookTable";
}
	@RequestMapping("/update")
	public String updateBook(@RequestParam("id")long id , Model model) {
	Book book = bookService.update(id);
	model.addAttribute("book",book);
	bookService.delete(id);
	return "updateBook";
	}
	
	@RequestMapping("/updatedBook")
	public String updateBook(@ModelAttribute("book") Book b , Model model) {
		bookService.saveBook(b);
		List<Book> books = bookService.getBooks();
		model.addAttribute("books",books);
		return "BookTable";
	}
	
	
	
	@RequestMapping("/issueBook")
	public String issueBook(){
		return "bookIssue";
	}
	
	@RequestMapping("/saveBookIssue")
	public String bookIssue(@ModelAttribute("book") BookIssue b , Model model) {
		issuerepo.saveIssueBook(b);
		return "bookIssue";
		
	}
	@RequestMapping("/addpublisher")
	public String savePublisher(@RequestParam("name")Publisher p) {
		pub.savePublisher(p);
		return "bookdetails";
	}
	
	
}
