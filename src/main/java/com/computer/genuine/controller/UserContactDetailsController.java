package com.computer.genuine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/userContactdetails")
	public List<UserContactDetails> getAllUserContactDetails(){
		return userContactDetailsService.getAllUserContactDetails();
	}
}
