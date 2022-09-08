package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbo.BookIssuedbo;
import com.example.dbo.BookStatusdbo;
import com.example.dbo.Bookdbo;
import com.example.dbo.Categorydbo;
import com.example.exception.LibrarianException;
import com.example.service.BookCatelogServiceImpl;

@RestController
@RequestMapping(value="/library")
public class CategoryBookAPI {
@Autowired
private BookCatelogServiceImpl bookCat;

@GetMapping(value = "/bookscategory/{CategoryName}")
public ResponseEntity<Categorydbo> getCustomer(@PathVariable String CategoryName) throws LibrarianException {
Categorydbo book= bookCat.getCategorydetails(CategoryName);
	return new ResponseEntity<>(book, HttpStatus.OK);
}
}
