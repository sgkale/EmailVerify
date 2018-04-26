package com.scb.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VerificationToken {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private int thaiId;
	@Column
	private String token;
	@Column
	private Date expiry;

	@Column
	private Boolean isTokenVerified;

	public Boolean getIsTokenVerified() {
		return isTokenVerified;
	}
	public void setIsTokenVerified(Boolean isTokenVerified) {
		this.isTokenVerified = isTokenVerified;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getThaiId() {
		return thaiId;
	}
	public void setThaiId(int thaiId) {
		this.thaiId = thaiId;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}


}
