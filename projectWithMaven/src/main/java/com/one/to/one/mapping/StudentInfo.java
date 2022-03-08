package com.one.to.one.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne; 


@Entity
public class StudentInfo {
	@Id
	private int sid;
	private String sname;
	private int age;
	
	@OneToOne
	@JoinColumn(name="unique_id")
	private StudentMarks smarks;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public StudentMarks getSmarks() {
		return smarks;
	}

	public void setSmarks(StudentMarks smarks) {
		this.smarks = smarks;
	}

}
