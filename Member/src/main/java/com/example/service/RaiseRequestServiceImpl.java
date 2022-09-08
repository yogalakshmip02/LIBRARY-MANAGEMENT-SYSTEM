package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.dbo.RaiseRequestdbo;
import com.example.entity.RaiseRequest;
import com.example.exception.LibrarianException;
import com.example.repository.RaiseRequestRepository;

@Service(value="RaiseRequestService")
public class RaiseRequestServiceImpl implements RaiseRequestService{
	
@Autowired
private RaiseRequestRepository raiseRequestRepository;

@Override

public Integer raiseRequest(RaiseRequestdbo raise)throws LibrarianException
{
	RaiseRequest ra=new RaiseRequest();
	ra.setMemberCode(raise.getMemberCode());
	ra.setCategory(raise.getCategory());
	ra.setBookName(raise.getBookName());
	ra.setDescription(raise.getDescription());
	RaiseRequest raisereq=raiseRequestRepository.save(ra);
	return raisereq.getMemberCode();
}
}
