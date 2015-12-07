package com.wpl.tablemap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "logindetails")
public class LoginDetails {
	@Id
	@Column(name="UserName")
	private String userName;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Status")
	private String status;
	
	@Column(name="FirstName")
	private String firstName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}