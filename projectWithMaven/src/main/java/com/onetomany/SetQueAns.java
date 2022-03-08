package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SetQueAns {
	
	public static void main(String[] args) {
		
		System.out.println("one ot many");
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory =cfg.buildSessionFactory();
		
		// creating objects of question and answer
		
		Question q1=new Question();
		q1.setQuestionId(301);
		q1.setQuestion("name of top cities in world");
		
		Answer a1 =new Answer();
		a1.setAnswerId(801);
		a1.setAnswer("mumbai");
		
		Answer a2=new Answer();
		a2.setAnswerId(802);
		a2.setAnswer("new york city");
		
		Answer a3=new Answer();
		a3.setAnswerId(803);
		a3.setAnswer("tokyo");
		
		Answer a4 =new Answer();
		a4.setAnswerId(804);
		a4.setAnswer("London");
		
		
		// putting all answer in list object
		
		List<Answer> l=new ArrayList<Answer>();
		l.add(a1);
		l.add(a2);
		l.add(a3);
		l.add(a4);
		q1.setAns(l);
		
		Session session =factory.openSession();
		Transaction tx=session.beginTransaction();
		
		// saving object
		session.save(q1);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.save(a4);
		
		
		
		tx.commit();
		session.close();
		factory.close();
		
		
		
		
	}

}
