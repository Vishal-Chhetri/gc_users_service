package com.computer.genuine.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.computer.genuine.model.User;
import com.computer.genuine.service.UserServices;
/**
 * @author Vishal Chhetri
 */
@RestController
@RequestMapping("/users")
public class UsersController {
	
	
	UserServices userServices;
	@Autowired
	public UsersController(UserServices userServices) {
	this.userServices = userServices;	
	}
	
	@GetMapping("/")
	public List<User> getAllUsers() {	
		return userServices.getAllUsers();
	}
	@GetMapping("/findByName/{userName}")
	public List<User> findByName(@PathVariable String userName) {	
		return userServices.findByName(userName);
	}
	@GetMapping("/{userId}")
	public Optional<User> getUserById(@PathVariable Long userId) {	
		return userServices.getById(userId);
	}
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		return userServices.createUser(user);		
	}
	@PostMapping("/activateUser/{user_id}")
	public void activateUser(@PathVariable Long user_id) {
		userServices.activateUser(user_id);
	}
	@PostMapping("/deactivateUser/{user_id}")
	public void deactivateUser(@PathVariable Long user_id) {
		userServices.deactivateUser(user_id);
	}
	@DeleteMapping("/deleteUser/{user_id}")
	public void deleteUser(@PathVariable("user_id") Long user_id) {
		userServices.deleteUser(user_id);
	}
}
