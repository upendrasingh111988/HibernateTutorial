package com.hibernate.HibernateTutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project started!" );
        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Student stu= new Student();
        stu.setStudentId(10);
        stu.setName("Vashu");
        stu.setCity("Pune");
        System.out.println(stu);
        Address ad= new Address();
        ad.setAddressId(1006);
        ad.setCity("Pune");
        ad.setStreet("satav nagar");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        
		/*
		 * FileInputStream fis= new FileInputStream("src/main/java/12234.jpg"); byte[]
		 * data= new byte[fis.available()]; fis.read(data);
		 */
       // ad.setImage(ImageUtils.convertImageToBytes("src/main/java/tt.jpg"));
        
        Session currentSession = sessionFactory.openSession();
        Transaction beginTransaction = currentSession.beginTransaction();
        currentSession.save(stu);
        currentSession.save(ad);
        beginTransaction.commit();
        currentSession.close();
        System.out.println(sessionFactory);
        System.out.println(sessionFactory.isClosed());
		/*
		 * Session session = sessionFactory.getCurrentSession(); // Uses current session
		 * Transaction tx = session.beginTransaction();
		 */

		/*
		 * try { // Perform your operations tx.commit(); } catch (Exception e) { if (tx
		 * != null) tx.rollback(); e.printStackTrace(); } finally {
		 * sessionFactory.close(); // Close session factory at the end }
		 */
        
   }
}
