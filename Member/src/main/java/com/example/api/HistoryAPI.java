package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbo.BookStatusdbo;
import com.example.dbo.Historydbo;
import com.example.exception.LibrarianException;
import com.example.service.HisotryServiceImpl;
@RestController
@RequestMapping(value="/member")
public class HistoryAPI {
@Autowired
private HisotryServiceImpl history;
	@GetMapping(value = "/history")
	public ResponseEntity<List<Historydbo>> getAllBook() throws LibrarianException {
		List<Historydbo> customerList = history.getAllBooksStatus();
		return new ResponseEntity<>(customerList, HttpStatus.OK);
	}
}
