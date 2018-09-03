package com.computer.genuine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.computer.genuine.model.MenuList;
import com.computer.genuine.repository.MenuListRepository;

/**
 * @author Vishal Chhetri
 *
 */
@Service
public class MenuListService {
	
	//MenuList
	private MenuListRepository menuListRepository;
	@Autowired
	public MenuListService(MenuListRepository menuListRepository) {
		this.menuListRepository = menuListRepository;		
	}
	
	public MenuList createMenuList(MenuList menu) {
		return menuListRepository.save(menu);
	}
	public void deleteMenuList(MenuList menu) {
		 menuListRepository.delete(menu);
	}
	public List<MenuList> getMenuList() {
		return menuListRepository.findAll();
	}
}
