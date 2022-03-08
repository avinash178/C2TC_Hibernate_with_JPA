package com.onetoone.answer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnswerQ {
	
	@Id
	private int answerid;
	private String answer;
	
	public int getAnswerid() {
		return answerid;
	}
	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	

}
