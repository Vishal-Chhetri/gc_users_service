package com.computer.genuine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.computer.genuine.model.MenuRoleMap;
import com.computer.genuine.repository.MenuRoleMapRepository;

/**
 * @author Vishal Chhetri
 *
 */
@Service
public class MenuRoleMapServices {
	
	private MenuRoleMapRepository menuRoleMapRepository;
	@Autowired
	public MenuRoleMapServices(MenuRoleMapRepository menuRoleMapRepository) {
		this.menuRoleMapRepository = menuRoleMapRepository;
	}
	
	public MenuRoleMap createMenuRoleMap(MenuRoleMap menuRoleMap) {
		return menuRoleMapRepository.save(menuRoleMap);
	}
	public void deleteMenuRoleMap(MenuRoleMap menuRoleMap) {
		 menuRoleMapRepository.delete(menuRoleMap);
	}
	
}
