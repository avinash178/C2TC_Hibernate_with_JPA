package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {
	public static void main(String[] args) {
		
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session session = factory.openSession();
        
        // get detail from student table 101 id 
        Student1 s1=(Student1)session.get(Student1.class,101);
        System.out.println(s1.getSname()+"   "+s1.getScity());
        
        
        Student1 s2=(Student1)session.get(Student1.class,10);
        System.out.println(s2.getSname()+"  "+s2.getScity());
        

        
        
        
        session.close();
        factory.close();
		
		
	
	}
	

}
