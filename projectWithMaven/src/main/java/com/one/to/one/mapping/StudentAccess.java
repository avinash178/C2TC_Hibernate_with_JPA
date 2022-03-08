package com.one.to.one.mapping;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;





public class StudentAccess {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		StudentInfo s1=new StudentInfo();
		s1.setSid(1001);
		s1.setSname("harshal");
		s1.setAge(26);
		
		StudentMarks sm1= new StudentMarks();
		
		sm1.setUniqueId(99231);
		sm1.setEnglish(89);
		sm1.setHistory(60);
		sm1.setMaths(50);
		
		sm1.setIspassed(true);
		
		
		s1.setSmarks(sm1);
		
		
		
		Session s=factory.openSession();
		
		org.hibernate.Transaction tx=s.beginTransaction();
		
		
		// saving object 
		s.save(s1);
		s.save(sm1);
		
		tx.commit();
		s.close();
		factory.close();
	}
}
