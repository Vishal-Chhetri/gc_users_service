package com.computer.genuine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.computer.genuine.model.UserRoles;
import com.computer.genuine.repository.UserRolesRepository;

/**
 * @author Vishal Chhetri
 *
 */
@Service
public class UserRolesServices {
	
	private UserRolesRepository userRolesRepository;
	@Autowired
	public UserRolesServices(UserRolesRepository userRolesRepository) {
		this.userRolesRepository = userRolesRepository;
	}
	
	public UserRoles createUserRolesRepository(UserRoles userRoles) {
		return userRolesRepository.save(userRoles);
	}
	public void deleteUserRolesRepository(UserRoles userRoles) {
		 userRolesRepository.save(userRoles);
	}
	
}
