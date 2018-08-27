package com.computer.genuine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.computer.genuine.model.User;
import com.computer.genuine.repository.UserRepository;

/**
 * @author Vishal Chhetri
 */
@Service
public class UserServices {	
	
	UserRepository userRepository;
	
	@Autowired
	public UserServices(UserRepository userRepository) {
		this.userRepository =userRepository;
	}	
	
	public List<User> getAllUsers() {		
		return  userRepository.findAll();
	}	
	public Optional<User> getById(Long id) {
		return userRepository.findById(id);
	}
	public User createUser(User user) {		
		return userRepository.save(user);
	}
	
}
