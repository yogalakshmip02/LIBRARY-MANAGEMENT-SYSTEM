package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbo.Historydbo;
import com.example.entity.History;
import com.example.exception.LibrarianException;
import com.example.repository.HistoryRepository;

@Service(value="HistoryService")
public class HisotryServiceImpl implements HistoryService {
@Autowired
private HistoryRepository historyRepository;

public List<Historydbo> getAllBooksStatus() throws LibrarianException {
	Iterable<History> customers = historyRepository.findAll();
List<Historydbo> bookstatus= new ArrayList<>();
	customers.forEach(customer -> {
		Historydbo cust = new Historydbo();
	cust.setBookCode(customer.getBookCode());
	cust.setBookName(customer.getBookName());
	cust.setCategoryName(customer.getCategoryName());
	
		
		bookstatus.add(cust);
	});
	if (bookstatus.isEmpty())
		throw new LibrarianException("Service.HISTORY_NOT_FOUND");
	return bookstatus;
}
}
