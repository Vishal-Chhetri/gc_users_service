package com.computer.genuine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.computer.genuine.model.UserContactDetails;
import com.computer.genuine.repository.UserContactDetailsRepository;

/**
 * @author Vishal Chhetri
 *
 */
@Service
public class UserContactDetailsService {

	UserContactDetailsRepository userContactDetailsRepository;
	
	@Autowired
	public UserContactDetailsService(UserContactDetailsRepository userContactDetailsRepository) {
		this.userContactDetailsRepository =userContactDetailsRepository;
	}	
	
	public UserContactDetails createUserContactDetails(UserContactDetails userContactDetails) {
		return userContactDetailsRepository.save(userContactDetails);
	}
	
	public List<UserContactDetails> getAllUserContactDetails(){
		return userContactDetailsRepository.findAll();
	}
	
	public Optional<UserContactDetails> getById(Long userContactId){
		return  userContactDetailsRepository.findById(userContactId);
	}
	public void deleteUserContactById(Long userContactId){
		userContactDetailsRepository.deleteById(userContactId);
	}
	
}
