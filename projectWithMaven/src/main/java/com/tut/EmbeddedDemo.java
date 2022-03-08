package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmbeddedDemo {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();

		Student1 s1=new Student1();
		Certificate c1=new Certificate();
		
		s1.setSid(101);
		s1.setSname("mohit");
		s1.setScity("delhi");
		
		
		
		
		
		
		c1.setCourse("maths");
		c1.setDuration("6 months");
		s1.setCerti(c1);
		
		Student1 s2=new Student1();
		Certificate c2=new Certificate();
		
		s2.setSid(102);
		s2.setSname("rahul");
		s2.setScity("kolkata");
		
		c2.setCourse("science");
		c2.setDuration("6 months");
		s2.setCerti(c2);
		
		
		
		
		Session se =factory.openSession();
		Transaction tx=se.beginTransaction();
		
		//object saving
		se.save(s1);
		se.save(s2);
		
		
		tx.commit();
		se.close();
		factory.close();
		

		
		
	}
}
