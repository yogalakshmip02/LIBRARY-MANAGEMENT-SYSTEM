package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbo.Registrationdbo;
import com.example.entity.Registration;
import com.example.exception.LibrarianException;
import com.example.repository.RegisterRepository;

@Service(value = "RegisterService")
public class RegisterServiceImpl implements RegisterService{
	@Autowired
	private RegisterRepository registerRepository;
	
	@Override
	public Integer addMember(Registrationdbo regdbo) throws LibrarianException {
		Registration customerEntity = new Registration();
	customerEntity.setMemberCode(regdbo.getMemberCode());
	customerEntity.setName(regdbo.getName());
	customerEntity.setEmailId(regdbo.getEmailId());
	customerEntity.setMobileNo(regdbo.getMobileNo());
	customerEntity.setDOB(regdbo.getDOB());
		Registration customerEntity2 = registerRepository.save(customerEntity);
		return customerEntity2.getMemberCode();
	}
	
	@Override
	public void updateMember(Integer MemberCode, Registrationdbo regdbo) throws LibrarianException {
		Optional<Registration> customer = registerRepository.findById(MemberCode);
		Registration c = customer.orElseThrow(() -> new LibrarianException("Service.MEMBER_NOT_FOUND"));
		       registerRepository.save(c);
	}
	
	@Override
	public void deleteMember(Integer MemberCode) throws LibrarianException {
		Optional<Registration> customer = registerRepository.findById(MemberCode);
		customer.orElseThrow(() -> new LibrarianException("Service.MEMBER_NOT_FOUND"));
		registerRepository.deleteById(MemberCode);
	}
	
	
}