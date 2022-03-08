package com.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@Column( name="Idetification_No")
	private int eid;
	private String ename;
	private String egender;
	
	@OneToOne
	private EmployeeFamily edata;
	
	
	public Employee(int eid, String ename, String egender, EmployeeFamily edata) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.egender = egender;
		this.edata = edata;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEgender() {
		return egender;
	}
	public void setEgender(String egender) {
		this.egender = egender;
	}
	public EmployeeFamily getEdata() {
		return edata;
	}
	public void setEdata(EmployeeFamily edata) {
		this.edata = edata;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
