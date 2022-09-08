package com.example.service;

import java.util.List;

import com.example.dbo.BookStatusdbo;
import com.example.dbo.Registrationdbo;
import com.example.exception.LibrarianException;

public interface BookStatusService {

	List<BookStatusdbo> getAllBooksStatus() throws LibrarianException;

	BookStatusdbo getBookStatus(Integer bookCode) throws LibrarianException;

	//void updateMember(Integer MemberCode, Registrationdbo regdbo) throws LibrarianException;

	void updateMember(Integer bookCode, BookStatusdbo regdbo) throws LibrarianException;

}
