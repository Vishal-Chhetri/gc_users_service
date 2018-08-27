package com.computer.genuine.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		return userServices.getAllUsers();
	}
	@GetMapping("/users/{userId}")
	public Optional<User> getUserById(@PathVariable Long userId) {	
		return userServices.getById(userId);
	}
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		System.out.println(user.getUserName());
		return userServices.createUser(user);		
	}
	

}
