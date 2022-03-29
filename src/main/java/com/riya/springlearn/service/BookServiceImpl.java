package com.riya.springlearn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.riya.springlearn.entity.Book;

@Service
public class BookServiceImpl implements BookService {

	private List<Book> bookList;

	@Override
	public Book getBook(String id) {
		Book b = null;
		for (Book book : bookList) {
			if (book.getId().equals(id)) {
				b = book;
			}
		}
		return b;
	}

	public BookServiceImpl() {
		bookList = new ArrayList<>();
		bookList.add(new Book("123", "xyz"));
		bookList.add(new Book("234", "pqr"));

	}

	@Override
	public List<Book> getAllBook() {
		return bookList;
	}

	@Override
	public Book SetBook(Book bk) {
		bookList.add(bk);
		return bk;

	}

}
