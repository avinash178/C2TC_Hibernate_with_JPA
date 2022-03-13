package com.placementmanagement.entities;

import javax.persistence.*;




//import com.placementmanagement.entities.Certificate;

@Entity
public class Student {

	@Id
	private long id;
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="College_Name")
	private College college;
	private long roll;
	private String qualification;
	private String course;
	private int year;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Certificate certificate;
	
	
	private long hallTicketNo;

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

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public long getRoll() {
		return roll;
	}

	public void setRoll(long roll) {
		this.roll = roll;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public long getHallTicketNo() {
		return hallTicketNo;
	}

	public void setHallTicketNo(long hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
	
	
	
	
	
	
}
