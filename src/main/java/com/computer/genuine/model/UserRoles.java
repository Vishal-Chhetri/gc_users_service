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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Vishal Chhetri
 *
 */
@Entity
@Table(name="USER_ROLES")
public class UserRoles implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_ROLES_ID")
	private Long userRolesId;	
	@Column(name="ROLE_NAME")
	private String roleName;
	
	@OneToMany
	@JoinColumn(name="USER_ROLES_ID")
	private List<MenuRoleMap> userRoles;
	
	public UserRoles() {
		super();
	}

	public Long getUserRolesId() {
		return userRolesId;
	}

	public void setUserRolesId(Long userRolesId) {
		this.userRolesId = userRolesId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public List<MenuRoleMap> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<MenuRoleMap> userRoles) {
		this.userRoles = userRoles;
	}

}
