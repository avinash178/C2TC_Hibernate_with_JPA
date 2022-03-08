package com.onetoone.answer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class QuestionQ {
	
	
	@Id
	private int questionid;
	private String question;
	
	
	@OneToOne
	AnswerQ ans;
	
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public AnswerQ getAns() {
		return ans;
	}
	public void setAns(AnswerQ ans) {
		this.ans = ans;
	}
	

}
