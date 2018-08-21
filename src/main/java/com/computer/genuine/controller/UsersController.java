package com.computer.genuine.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.computer.genuine.model.User;
import com.computer.genuine.service.UserServices;
/**
 * @author Vishal Chhetri
 */
@RestController
public class UsersController {
	
	
	UserServices userServices;
	@Autowired
	public UsersController(UserServices userServices) {
	this.userServices = userServices;	
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers() {	
		System.out.println(userServices.getAllPersons());
		return userServices.getAllPersons();
	}
	@GetMapping("/users/{userId}")
	public Optional<User> getUserById(@PathVariable Long userId) {	
		System.out.println(userServices.getAllPersons());
		return userServices.getById(userId);
	}
	

}
