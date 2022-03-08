package com.mapping;

import org.hibernate.Session;
import javax.transaction.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




 

public class EmployeeAccess {

	public static void main(String[] args) {
		
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory fact=cfg.buildSessionFactory();
	
		
	// setting values using constructor 	
		//family info
		EmployeeFamily ef1=new EmployeeFamily(201,8,"satara");
		
		// employee info
		Employee e1=new Employee(101,"rohan","male",ef1);
		
		
		
		// employee 2 info
				Employee e2=new Employee();
				e2.setEid(2);
				e2.setEname("riya");
				e2.setEgender("female");
				
				
				//family 2 info
				EmployeeFamily ef2=new EmployeeFamily();
				ef2.setEid(402);
				ef2.setNumberOfCount(4);
				ef2.setCity("mumbai");
				// foreign key 
				e2.setEdata(ef2);
				
		// session  (which have save method)
		
		Session s=fact.openSession();
		
		org.hibernate.Transaction tx=s.beginTransaction();
		
		
		
		s.save(e1);
		s.save(ef1);
		s.save(e2);
		s.save(ef2);
		
		tx.commit();
		s.close();
		fact.close();
		


		
	}
}
