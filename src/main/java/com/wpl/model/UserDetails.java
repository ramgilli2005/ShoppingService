package com.wpl.model;

import java.io.Serializable;

public class UserDetails implements Serializable{	

	private static final long serialVersionUID = 1L;
	public String userName;
	public String password;
	public String status;
	public String firstName;
	public UserDetails(){
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
