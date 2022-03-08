package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpProjects {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		// creating objects of emp
		Emp e1=new Emp();
		Emp e2=new Emp();
		
		// creating objects of projects
		Project p1 =new Project();
		Project p2=new Project();
		
		e1.setEid(12);
		e1.setEname("ram");
		
		p1.setPid(2);
		p1.setProjectname("library management");
		
		e2.setEid(13);
		e2.setEname("shayam");
		
		p2.setPid(3);
		p2.setProjectname("chatbot");
		
		List<Project> list1=new ArrayList<Project>();
		List<Emp> list2=new ArrayList<Emp>();
		
		list1.add(p1);
		list1.add(p2);
		list2.add(e1);
		list2.add(e2);
		
		e1.setProjects(list1);
		
		
		p2.setEmps(list2);
		
		
		Session session =factory.openSession();
		Transaction tx =session.beginTransaction();
		
		
		// saving objects
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		
		
		
	
		tx.commit();
		session.close();
		factory.close();
	}

}
