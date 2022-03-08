package com.tut;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        
        Student1 st =new Student1();
      
        st.setSid(101);
        st.setSname("vinay");
        st.setScity("chandrapur");
        System.out.println(st);
        
        
		
        Session session = factory.openSession();
        
        
       // Transaction tx=(Transaction) session.beginTransaction();
        org.hibernate.Transaction  tx=session.beginTransaction();
        session.save(st);
        tx.commit();
        
        
        
        
        
        session.close();
        
    }
}
