package com.riya.springlearn.service;

import java.util.List;

import com.riya.springlearn.entity.Book;

public interface BookService {

	List<Book> getAllBook();
	Book getBook(String id);
	Book SetBook(Book bk);

}
