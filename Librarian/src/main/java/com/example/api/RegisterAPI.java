package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbo.Registrationdbo;
import com.example.entity.Registration;
import com.example.exception.LibrarianException;
import com.example.service.RegisterService;

@RestController
@RequestMapping(value = "/library")
public class RegisterAPI {
	@Autowired
	private RegisterService registerService;
	@Autowired
	private Environment environment;
	
	@PostMapping(value = "/member")
	public ResponseEntity<String> addMember(@RequestBody Registrationdbo regdbo) throws LibrarianException {
		Integer memberId = registerService.addMember(regdbo);
		String successMessage = environment.getProperty("API.REGISTER_MEMBER") + memberId;
		return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/members/{MemberCode}")
	public ResponseEntity<String> updateMember(@PathVariable Integer MemberCode, @RequestBody Registrationdbo member)
			throws LibrarianException {
		registerService.updateMember(MemberCode, member);
		String successMessage = environment.getProperty("API.UPDATE_SUCCESS");
		return new ResponseEntity<>(successMessage, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/memberdelete/{MemberCode}")
	public ResponseEntity<String> deleteMember(@PathVariable Integer MemberCode ) throws LibrarianException {
		registerService.deleteMember(MemberCode);
		String successMessage = environment.getProperty("API.DELETE_SUCCESS");
		return new ResponseEntity<>(successMessage, HttpStatus.OK);
	}
}
