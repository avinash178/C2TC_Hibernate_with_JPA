package com.placementmanagement.entities;

import javax.persistence.*;

import com.placementmanagement.entities.*;


@Entity                              
public class Certificate {

	@Id
	private long id;
	private int year;
	
	@OneToOne                      // mapping between Student and Certificate
	@JoinColumn(name="student_Id")     // set column name as student_Id
	private Student student;
	
	@ManyToOne						// college can many certificate in it 
	@JoinColumn(name="college_Id")
	private College college;
	
	
	// created getter and setter of field
	
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
