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
@Table(name="USER_ROLE_MAP")
public class UserRoleMapping {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_ROLE_MAP_ID")
	private Long userRoleMapId;
	@Column(name = "USER_ID")
	private Long userId;
	@Column(name="USER_ROLES_ID")
	private Long userRolesId;
	
	public UserRoleMapping() {
		super();
	}

	public Long getUserRoleMapId() {
		return userRoleMapId;
	}

	public void setUserRoleMapId(Long userRoleMapId) {
		this.userRoleMapId = userRoleMapId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserRolesId() {
		return userRolesId;
	}

	public void setUserRolesId(Long userRolesId) {
		this.userRolesId = userRolesId;
	}	
	
	
	
	

}
