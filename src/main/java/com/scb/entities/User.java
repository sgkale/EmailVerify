package com.scb.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private int id;

	@Column
	private int thaiId;

	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String mobile;
	@Column
	private Boolean isEmailVerified;
	@Column
	private Boolean isMobileNumberVerified;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Boolean getIsEmailVerified() {
		return isEmailVerified;
	}
	public void setIsEmailVerified(Boolean isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}
	public Boolean getIsMobileNumberVerified() {
		return isMobileNumberVerified;
	}
	public void setIsMobileNumberVerified(Boolean isMobileNumberVerified) {
		this.isMobileNumberVerified = isMobileNumberVerified;
	}
	public int getThaiId() {
		return thaiId;
	}
	public void setThaiId(int thaiId) {
		this.thaiId = thaiId;
	}


}
