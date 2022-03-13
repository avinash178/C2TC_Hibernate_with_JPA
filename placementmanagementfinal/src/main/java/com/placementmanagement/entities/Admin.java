package com.placementmanagement.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



public class Admin {
	
	
	private long id;
	
	private String name;
	private String password;
	
	
	private User user;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	

}
