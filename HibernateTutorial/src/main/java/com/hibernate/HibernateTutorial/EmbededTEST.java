package com.hibernate.HibernateTutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbededTEST {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		
		Student student= new Student();
		student.setStudentId(100);
		student.setName("Upendra");
		student.setCity("Pune");
		
		Certificate cert= new Certificate();
		cert.setCource("java");
		cert.setDuration("2 months");
		
		student.setCertificate(cert);
		
		Student student1= new Student();
		student1.setStudentId(101);
		student1.setName("Aviraj");
		student1.setCity("patna");
		
		Certificate cert1= new Certificate();
		cert1.setCource("php");
		cert1.setDuration("1 months");
		
		
		student1.setCertificate(cert1);
		
		Session openSession = sessionFactory.openSession();
		Transaction tx= openSession.beginTransaction();
		openSession.save(student);
		openSession.save(student1);
		tx.commit();
		
		openSession.close();
		sessionFactory.close();
		
	}

}
