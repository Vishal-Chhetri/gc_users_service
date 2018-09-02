package com.computer.genuine.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.http.entity.SerializableEntity;

/**
 * @author Vishal Chhetri
 *
 */
@Entity
@Table(name="USER_ROLE_MAP")
public class UserRoleMapping implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_ROLE_MAP_ID")
	private Long userRoleMapId;
	@Column(name = "USER_ID")
	private Long userId;
	@Column(name="USER_ROLES_ID")
	private Long userRolesId;
	
	@OneToMany
	@JoinColumn(name="USER_ROLES_ID")
	private List<UserRoles> userRoles;
	
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

	public List<UserRoles> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRoles> userRoles) {
		this.userRoles = userRoles;
	}


}
