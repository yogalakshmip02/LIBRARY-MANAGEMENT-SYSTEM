package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dbo.BooksAssigneddbo;
import com.example.entity.BookAssigned;
import com.example.exception.LibrarianException;
import com.example.repository.BooksAssignedRepository;

public class BookAssignedServiceImpl {

	@Autowired
	private BooksAssignedRepository bookAssignedRepository;
	
	public BooksAssigneddbo getBookAssigned(Integer memberCode) throws LibrarianException {
		Optional<BookAssigned> optional = bookAssignedRepository.findById(memberCode);
		BookAssigned book = optional.orElseThrow(() -> new LibrarianException("Service.CUSTOMER_NOT_FOUND"));
		BooksAssigneddbo book2 = new BooksAssigneddbo();
	book2.setBookCode(book.getBookCode());
	book2.setMemberCode(book.getMemberCode());
	book2.setBookName(book.getBookName());
	book2.setCategory(book.getCategory());
	book2.setBookIssueOrNot(book.getBookIssueOrNot());
		return book2;
	}
}
