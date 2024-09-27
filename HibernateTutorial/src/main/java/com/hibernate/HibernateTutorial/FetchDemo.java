package com.hibernate.HibernateTutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		
		 Configuration cfg= new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory sessionFactory = cfg.buildSessionFactory();
	        
	        Session currentSession = sessionFactory.openSession();
	        
	        Student student = currentSession.get(Student.class, 10);
	       System.out.println(student);
	       
	       Student loadStudent = currentSession.load(Student.class, 10);
	       System.out.println(loadStudent);
	        
	       currentSession.close();

	}

}
