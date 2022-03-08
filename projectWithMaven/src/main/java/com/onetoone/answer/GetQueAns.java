package com.onetoone.answer;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class GetQueAns {

	public static void main(String[] args) {
		System.out.println("one to one mapping ");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// setting question field
		QuestionQ q1 = new QuestionQ();
		q1.setQuestionid(101);
		q1.setQuestion("what is hibernate");

		// setting answer field
		AnswerQ a1 = new AnswerQ();
		a1.setAnswerid(501);
		a1.setAnswer("hibernate is java framework");
		q1.setAns(a1); 

		// question 2nd
		QuestionQ q2 = new QuestionQ();
		q2.setQuestionid(102);
		q2.setQuestion("what is springBoot");

		AnswerQ a2 = new AnswerQ();
		a2.setAnswerid(502);
		a2.setAnswer(" Spring Boot is an open source "
				+ "Java-based framework used to create a micro Service");
		q2.setAns(a2);
		
		
		Session session =factory.openSession();
		org.hibernate.Transaction tx=session.beginTransaction();
		
		
		// saving above object
		session.save(q1);
		session.save(a1);
		session.save(q2);
		session.save(a2);
		tx.commit();
		
		session.close();
		factory.close();

	}
}
