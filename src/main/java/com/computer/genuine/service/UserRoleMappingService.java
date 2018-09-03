package com.computer.genuine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.computer.genuine.model.UserRoleMapping;
import com.computer.genuine.repository.UserRoleMappingRepository;

/**
 * @author user Vishal Chhetri
 *
 */
@Service
public class UserRoleMappingService {
	
	private UserRoleMappingRepository userRoleMappingRepository;
	@Autowired
	public UserRoleMappingService(UserRoleMappingRepository userRoleMappingRepository) {
		this.userRoleMappingRepository = userRoleMappingRepository;
	}
	
	public UserRoleMapping createUserRoleMapping(UserRoleMapping userRoleMapping) {
		return userRoleMappingRepository.save(userRoleMapping);
	}
	public void deleteUserRoleMapping(UserRoleMapping userRoleMapping) {
		userRoleMappingRepository.delete(userRoleMapping);
	}
}
