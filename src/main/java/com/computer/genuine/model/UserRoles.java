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
@Table(name="USER_ROLES")
public class UserRoles {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_ROLES_ID")
	private Long userRolesId;	
	@Column(name="USER_ROLE_MAP_ID")
	private Long userRoleMapId;
	@Column(name="ROLE_NAME")
	private String roleName;
	
	public UserRoles() {
		super();
	}

	public Long getUserRolesId() {
		return userRolesId;
	}

	public void setUserRolesId(Long userRolesId) {
		this.userRolesId = userRolesId;
	}

	public Long getUserRoleMapId() {
		return userRoleMapId;
	}

	public void setUserRoleMapId(Long userRoleMapId) {
		this.userRoleMapId = userRoleMapId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}
