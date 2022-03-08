package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeFamily {
	@Id
	private int eid;
	private int NumberOfCount;
	private String city;
	
	
	public EmployeeFamily(int eid, int numberOfCount, String city) {
		super();
		this.eid = eid;
		NumberOfCount = numberOfCount;
		this.city = city;
	}
	
	
	
	public EmployeeFamily() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getNumberOfCount() {
		return NumberOfCount;
	}
	public void setNumberOfCount(int numberOfCount) {
		NumberOfCount = numberOfCount;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
