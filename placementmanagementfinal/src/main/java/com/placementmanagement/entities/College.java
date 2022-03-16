package com.placementmanagement.entities;

import javax.persistence.*;


@Entity
public class College {

	@Id
	private long id;
	@OneToOne
	@JoinColumn(name="User_id")
	private User collegeAdmin;       // reference variable  
	private String collegeName;
	private String location;
	
	// getter and setter of field

	public User getCollegeAdmin() {
		return collegeAdmin;
	}
	public void setCollegeAdmin(User collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
