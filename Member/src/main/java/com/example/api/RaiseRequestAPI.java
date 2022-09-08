package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbo.RaiseRequestdbo;
import com.example.exception.LibrarianException;
import com.example.service.HisotryServiceImpl;
import com.example.service.RaiseRequestServiceImpl;

@RestController
@RequestMapping(value="/member")
public class RaiseRequestAPI {
	@Autowired
	private RaiseRequestServiceImpl history;
	@Autowired
	private Environment environment;
	@PostMapping(value = "/raise")
	public ResponseEntity<String> addMember(@RequestBody RaiseRequestdbo regdbo) throws LibrarianException {
		Integer memberCode = history.raiseRequest(regdbo);
		String successMessage = environment.getProperty("API.INSERT_MEMBER") + memberCode;
		return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
	}
}
