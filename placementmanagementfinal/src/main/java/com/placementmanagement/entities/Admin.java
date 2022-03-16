package com.placementmanagement.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity                            // Created admin table in database
public class Admin {
	
	@Id								// primary key 
	private long id;
	
	private String name;
	private char[] password;		// using character array for password
	
	@OneToOne						// admin and user one to one relation 
	private User user;	
	
	
	//  created getter and setter of field
	
	
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
	
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	

}
