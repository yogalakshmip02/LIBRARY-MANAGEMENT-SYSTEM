package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dbo.BookStatusdbo;
import com.example.entity.BookStatus;
import com.example.exception.LibrarianException;
import com.example.repository.BookStatusRepository;

public class BookStatusServiceImpl implements BookStatusService{
	
	@Autowired
     private BookStatusRepository bookStatusRepository;
	@Override
	
	
	public List<BookStatusdbo> getAllBooksStatus() throws LibrarianException {
		Iterable<BookStatus> customers = bookStatusRepository.findAll();
List<BookStatusdbo> bookstatus= new ArrayList<>();
		customers.forEach(customer -> {
			BookStatusdbo cust = new BookStatusdbo();
			cust.setBookCode(customer.getBookCode());
			cust.setCategory(customer.getCategory());
			cust.setName(customer.getName());
			cust.setDescription(customer.getDescription());
			cust.setTotal(customer.getTotal());
			cust.setAvailability(customer.getAvailability());
			
			bookstatus.add(cust);
		});
		if (bookstatus.isEmpty())
			throw new LibrarianException("Service.BOOK_NOT_FOUND");
		return bookstatus;
	}
	
	@Override
	public BookStatusdbo getBookStatus(Integer bookCode) throws LibrarianException {
		Optional<BookStatus> optional = bookStatusRepository.findById(bookCode);
		BookStatus book = optional.orElseThrow(() -> new LibrarianException("Service.CUSTOMER_NOT_FOUND"));
		BookStatusdbo book2 = new BookStatusdbo();
		book2.setBookCode(book.getBookCode());
		book2.setCategory(book.getCategory());
		book2.setName(book.getName());
		book2.setDescription(book.getDescription());
		book2.setTotal(book.getTotal());
		book2.setAvailability(book.getAvailability());
		return book2;
	}
}
