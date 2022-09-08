package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbo.BookStatusdbo;
import com.example.dbo.BooksAssigneddbo;
import com.example.entity.BookAssigned;
import com.example.exception.LibrarianException;
import com.example.service.BookAssignedService;
import com.example.service.BookStatusService;

@RestController
@RequestMapping(value = "/member")
public class BookAssignedAPI {
	@Autowired
	private BookAssignedService bookStatus;
	@Autowired
	private Environment environment;
	
	@GetMapping(value = "/books/{memberCode}")
	public ResponseEntity<BooksAssigneddbo> getAssigned(@PathVariable Integer memberCode) throws LibrarianException {
		BooksAssigneddbo book = bookStatus.getBookAssigned(memberCode);
		return new ResponseEntity<>(book, HttpStatus.OK);
	}
}
