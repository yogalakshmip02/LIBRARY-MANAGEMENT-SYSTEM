package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbo.BookIssuedbo;
import com.example.dbo.Registrationdbo;
import com.example.entity.BookIssue;
import com.example.entity.Registration;
import com.example.exception.LibrarianException;
import com.example.repository.BookIssueRepository;

@Service(value="BookIssueService")
public class BookIssueServiceImpl implements BookIssueService {

	@Autowired
	private BookIssueRepository bookIssueRepository;
	
	@Override
	public Integer addBooks(BookIssuedbo regdbo) throws LibrarianException {
		BookIssue customerEntity = new BookIssue();
	    customerEntity.setMemberCode(regdbo.getMemberCode());
	    customerEntity.setBookCode(regdbo.getBookCode());
	    customerEntity.setCategory(regdbo.getCategory());
	    customerEntity.setBookName(regdbo.getBookName());
	    customerEntity.setBookIssueOrNot(regdbo.getBookIssueOrNot());
		BookIssue customerEntity2 = bookIssueRepository.save(customerEntity);
		return customerEntity2.getMemberCode();
	}
}
