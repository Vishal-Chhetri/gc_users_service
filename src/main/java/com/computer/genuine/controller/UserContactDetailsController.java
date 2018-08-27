package com.computer.genuine.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.computer.genuine.model.UserContactDetails;
import com.computer.genuine.service.UserContactDetailsService;

/**
 * @author Vishal Chhetri
 *
 */
@RestController
public class UserContactDetailsController {
	
	UserContactDetailsService userContactDetailsService;
	@Autowired
	public UserContactDetailsController(UserContactDetailsService userContactDetailsService) {
	this.userContactDetailsService = userContactDetailsService;	
	}
	
	@PostMapping("/createUserContactDetails")
	public UserContactDetails createUserContactDetails(@RequestBody UserContactDetails userContactDetails) {
		return userContactDetailsService.createUserContactDetails(userContactDetails);
	}
	
	@GetMapping("/userContactDetails")
	public List<UserContactDetails> getAllUserContactDetails(){
		return userContactDetailsService.getAllUserContactDetails();
	}
	@GetMapping("/getUserContactDetailsById/{id}")
	public Optional<UserContactDetails> getUserContactDetailsById(@PathVariable Long id ){
		return userContactDetailsService.getById(id);
	}
	@DeleteMapping("/deleteUserContactById/{userContactId}")
	public void deleteUserContactById(@PathVariable Long userContactId) {
		userContactDetailsService.deleteUserContactById(userContactId);
	}
}
