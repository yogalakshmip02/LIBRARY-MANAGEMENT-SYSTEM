package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbo.BookStatusdbo;
import com.example.dbo.Registrationdbo;
import com.example.exception.LibrarianException;
import com.example.service.BookStatusService;
import com.example.service.RegisterService;

@RestController
@RequestMapping(value = "/library")
public class BookStatusAPI {
	@Autowired
	private BookStatusService bookStatus;
	@Autowired
	private Environment environment;
	
	@GetMapping(value = "/book")
	public ResponseEntity<List<BookStatusdbo>> getAllBook() throws LibrarianException {
		List<BookStatusdbo> customerList = bookStatus.getAllBooksStatus();
		return new ResponseEntity<>(customerList, HttpStatus.OK);
	}

	@GetMapping(value = "/books/{bookCode}")
	public ResponseEntity<BookStatusdbo> getCustomer(@PathVariable Integer bookCode) throws LibrarianException {
		BookStatusdbo book = bookStatus.getBookStatus(bookCode);
		return new ResponseEntity<>(book, HttpStatus.OK);
	}
	

	@PutMapping(value = "/update/{bookCode}")
	public ResponseEntity<String> updateMember(@PathVariable Integer bookCode, @RequestBody BookStatusdbo member)
			throws LibrarianException {
		bookStatus.updateMember(bookCode, member);
	//bookStatus.updateMember(bookCode, member);
		String successMessage = environment.getProperty("API.UPDATE_SUCCESS");
		return new ResponseEntity<>(successMessage, HttpStatus.OK);
	}
}
