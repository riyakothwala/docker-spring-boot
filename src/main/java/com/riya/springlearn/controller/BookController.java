package com.riya.springlearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.riya.springlearn.entity.Book;
import com.riya.springlearn.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/book")
	public List<Book> getAllBook() {
		return bookService.getAllBook();
	}

	@GetMapping("/book/{id}")
	public Book getBook(@PathVariable String id) {
		return bookService.getBook(id);
	}
	
	@PostMapping("/book")
	public Book SetBook(@RequestBody Book Bk) {
		return this.bookService.SetBook(Bk);
	}

}
