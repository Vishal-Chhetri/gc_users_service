package com.computer.genuine.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Vishal Chhetri
 */
@Entity
@Table(name = "USERS")
public class User {		
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Long userId;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "PASSWORD")
	private String passWord;
	/*@Column(name = "ROLE_ID")
	private int roleId;*/
	@Column(name = "ACTIVE")
	private int status;
	@Column(name = "USER_TYPE")
	private int userType;
	@Column(name = "PHOTO")
	private byte[] userPhoto;
	@Column(name = "CREATED_DATE")
	private Date createdDate;
	@Column(name = "LAST_UPDATED_DATE")
	private Date lastUpdatedDate;
	
	@OneToMany( targetEntity=UserContactDetails.class ,orphanRemoval=true)
	@JoinColumn(name="USER_ID") 
    private List userContactDetails;
	
	
	public User() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public List getUserContactDetails() {
		return userContactDetails;
	}

	public void setUserContactDetails(List userContactDetails) {
		this.userContactDetails = userContactDetails;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	/*public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}*/

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public byte[] getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(byte[] userPhoto) {
		this.userPhoto = userPhoto;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	
	
	
}
