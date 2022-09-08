package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbo.BookIssuedbo;
import com.example.dbo.Registrationdbo;
import com.example.exception.LibrarianException;
import com.example.service.BookIssueService;

@RestController
@RequestMapping(value = "/library")
public class BookIssueAPI {
	
	@Autowired
	private BookIssueService bookIssueService;
	@Autowired
	private Environment environment;
	
	@PostMapping(value = "/issue")
	public ResponseEntity<String> addMember(@RequestBody BookIssuedbo regdbo) throws LibrarianException {
		Integer memberCode = bookIssueService.addBooks(regdbo);
		String successMessage = environment.getProperty("API.BOOK_ISSUE") + memberCode;
		return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
	}
}
