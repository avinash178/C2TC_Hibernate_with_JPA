package com.placementmanagement.entities;

import javax.persistence.*;

import com.placementmanagement.entities.*;


@Entity
public class Certificate {

	@Id
	private long id;
	private int year;
	
	@OneToOne
	@JoinColumn(name="student")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="college_name")
	private College college;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
}
