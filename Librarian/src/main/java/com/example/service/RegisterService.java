package com.example.service;

import com.example.dbo.Registrationdbo;
import com.example.entity.Registration;
import com.example.exception.LibrarianException;

public interface RegisterService {

	Integer addMember(Registrationdbo regdbo) throws LibrarianException;

	void updateMember(Integer MemberCode, Registrationdbo regdbo) throws LibrarianException;

	void deleteMember(Integer MemberCode) throws LibrarianException;


}
