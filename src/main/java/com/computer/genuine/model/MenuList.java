package com.computer.genuine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Vishal Chhetri
 *
 */
@Entity
@Table(name="MENU_LIST")
public class MenuList {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="MENU_ID")
	private Long menuId;
	@Column(name="MENU_NAME")
	private String menuName;
	@Column(name="MENU_URL")
	private String menuUrl;
	
	public MenuList() {
		super();
	}
	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

}
