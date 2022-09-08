package com.example.service;

import com.example.dbo.BookIssuedbo;
import com.example.exception.LibrarianException;

public interface BookIssueService {

	Integer addBooks(BookIssuedbo regdbo) throws LibrarianException;

	

}
