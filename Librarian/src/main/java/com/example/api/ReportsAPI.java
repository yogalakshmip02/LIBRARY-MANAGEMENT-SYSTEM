package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbo.Reportsdbo;
import com.example.exception.LibrarianException;
import com.example.service.ReportsService;

@RestController
@RequestMapping(value = "/library")
public class ReportsAPI {

	@Autowired
	private ReportsService bookIssueService;
	@Autowired
	private Environment environment;
	
	@PostMapping(value = "/code")
	public ResponseEntity<String> addMember(@RequestBody Reportsdbo regdbo) throws LibrarianException {
		Integer memberCode = bookIssueService.addMember(regdbo);
		String successMessage = environment.getProperty("API.REPORTS") + memberCode;
		return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
	}
}
