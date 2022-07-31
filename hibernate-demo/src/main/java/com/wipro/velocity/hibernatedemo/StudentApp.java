package com.wipro.velocity.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentApp {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	       SessionFactory sf = cfg.buildSessionFactory();
	       Session session = sf.openSession();	//Physical connection with database
	       Transaction t = session.beginTransaction();
	       
	       Student s1 = new Student();
	       s1.setName("Pavan");
	       s1.setBranch("Botany");
	       s1.setMarks(90);
	       
	       session.save(s1);
	       t.commit();
	       System.out.println("Student details successfully saved to database");
	       session.close();
	       sf.close();
	       
	       

	}

}
