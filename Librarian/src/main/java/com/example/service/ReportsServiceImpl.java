package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbo.Reportsdbo;
import com.example.entity.Reports;
import com.example.exception.LibrarianException;
import com.example.repository.ReportsRepository;

@Service(value="ReportsService")
public class ReportsServiceImpl implements ReportsService{
@Autowired
private ReportsRepository reportsRepository;

@Override
public Integer addMember(Reportsdbo regdbo) throws LibrarianException {
Reports entity = new Reports();
entity.setMemberCode(regdbo.getMemberCode());
entity.setBookCode(regdbo.getBookCode());
entity.setIssueDate(regdbo.getIssueDate());
entity.setReturnDate(regdbo.getReturnDate());
entity.setName(regdbo.getName());
entity.setBookName(regdbo.getBookName());
	Reports Entity2 = reportsRepository.save(entity);
	return Entity2.getMemberCode();
}
}
