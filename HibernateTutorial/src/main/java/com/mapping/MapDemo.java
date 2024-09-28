package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Question q1= new Question();
        q1.setQuestionId(1212);
        q1.setQuestion("What is java?");
        
        Answer ans= new Answer();
        ans.setAnswerId(34);
        ans.setAnswer("java is programming language");
        ans.setQuestion(q1);
        //q1.setAnswer(ans);
        
        Answer ans1= new Answer();
        ans1.setAnswerId(33);
        ans1.setAnswer("java is platform independent language");
        ans1.setQuestion(q1);
        
        Answer ans2= new Answer();
        ans2.setAnswerId(38);
        ans2.setAnswer("java is used for making software");
        ans2.setQuestion(q1);
        
        List<Answer>listOfAnswers= new ArrayList<>();
        listOfAnswers.add(ans);
        listOfAnswers.add(ans1);
        listOfAnswers.add(ans2);
        q1.setAnswers(listOfAnswers);
        
		/*
		 * Question q2= new Question(); q2.setQuestionId(242);
		 * q2.setQuestion("What is collection framework?");
		 */
		 
		 
		/*
		 * Answer ans2= new Answer(); ans2.setAnswerId(344);
		 * ans2.setAnswer("Group of interfaces and classes"); ans2.setQuestion(q2);
		 */
		 //q2.setAnswer(ans);
		 
        
			 Session currentSession = sessionFactory.openSession();
			 
			 Transaction tx= currentSession.beginTransaction();
			 
			 currentSession.save(q1);
			 currentSession.save(ans); 
			 currentSession.save(ans1);
			 currentSession.save(ans2);
				
			tx.commit();
		
       currentSession.close();
        sessionFactory.close();

	}

}
