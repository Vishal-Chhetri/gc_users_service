package com.computer.genuine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.computer.genuine.model.MenuList;
import com.computer.genuine.service.MenuListService;

/**
 * @author Vishal Chhetri
 *
 */
@RestController
@RequestMapping("/menu")
public class MenuListController {
	private MenuListService menuListService;
	@Autowired
	public MenuListController(MenuListService menuListService) {
		this.menuListService = menuListService;
	}
	
	@GetMapping("/getAllMenu")
	public List<MenuList> getAllMenu(){
		return menuListService.getMenuList();
	}
	@PostMapping("/createMenu")
	public MenuList createMenu(@RequestBody MenuList menu) {
		return menuListService.createMenuList(menu);
	}
	@DeleteMapping("/deleteMenu")
	public void deleteMenu(@RequestBody MenuList menu) {
		menuListService.deleteMenuList(menu);
	}
	
}
