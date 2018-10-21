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
	public List<User> createUsers(List<User> users) {		
		return userRepository.saveAll(users);
	}
	public List<User> findByName(String userName) {		
		return  userRepository.findByUserName(userName);				
	}
	public void activateUser(Long user_id) {
		userRepository.activateUser(user_id);
	}
	public void deactivateUser(Long user_id) {
		userRepository.deactivateUser(user_id);
	}
	public void deleteUser(Long user_id) {
		userRepository.deleteUser(user_id);
	}

	public Optional<User> validateUser(User user) {
		Long user_id = userRepository.validateUser(user.getUserName(), user.getPassWord());
		
		return getById(user_id);
	}
	
}
