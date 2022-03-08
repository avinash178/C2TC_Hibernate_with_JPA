package com.one.to.one.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentMarks {
	@Id
	private int uniqueId;
	private int english;
	private int maths;
	private int history;
	private boolean ispassed;
	
	public int getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}
	public boolean isIspassed() {
		return ispassed;
	}
	public void setIspassed(boolean ispassed) {
		this.ispassed = ispassed;
	}
	

}
