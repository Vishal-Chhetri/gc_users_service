package com.computer.genuine.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Vishal Chhetri
 */
@Entity
@Table(name="USER_CONTACT_DETAILS")
public class UserContactDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_CONTACT_DETAILS_ID")
	private Long userContactId;
	@Column(name = "USER_ID")
	private Long userId;
	@Column(name="CONTACT_NO")
	private String contactNo;
	@Column(name="ADDRESS")
	private String address;
	@Column(name = "ACTIVE")
	private int status;
	@Column(name = "ID_PROOF_PHOTO")
	private byte[] idProofPhoto;
	@Column(name = "CREATED_DATE")
	private Date createdDate;
	@Column(name = "LAST_UPDATED_DATE")
	private Date lastUpdatedDate;
	
	public UserContactDetails() {
		super();
	}

	public Long getId() {
		return userContactId;
	}

	public void setId(Long id) {
		this.userContactId = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public byte[] getIdProofPhoto() {
		return idProofPhoto;
	}

	public void setIdProofPhoto(byte[] idProofPhoto) {
		this.idProofPhoto = idProofPhoto;
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
