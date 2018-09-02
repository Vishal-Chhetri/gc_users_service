package com.computer.genuine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Vishal Chhetri
 *
 */
@Entity
@Table(name="MENU_ROLE_MAP")
public class MenuRoleMap {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long menuRoleMapId;
	@Column(name="USER_ROLES_ID")
	private Long userRolesId;	 
	@Column(name="MENU_ID")
	private Long menuId;
	
	@OneToOne
	@JoinColumn(name="MENU_ID" , updatable=false , insertable =false)
	private MenuList menu;
	
	public MenuRoleMap() {
		super();
	}
	
	public Long getMenuRoleMapId() {
		return menuRoleMapId;
	}
	public void setMenuRoleMapId(Long menuRoleMapId) {
		this.menuRoleMapId = menuRoleMapId;
	}
	public Long getUserRolesId() {
		return userRolesId;
	}
	public void setUserRolesId(Long userRolesId) {
		this.userRolesId = userRolesId;
	}
	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	
	

}
