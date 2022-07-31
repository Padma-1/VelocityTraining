package com.wipro.velocity.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*
 * Hibernate Application to save Employee object to Database
 *
 */
public class EmployeeApp 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory sf = cfg.buildSessionFactory();
       Session session = sf.openSession();	//Physical connection with database
       Transaction t = session.beginTransaction();
       
       Employee e1 = new Employee();	//create transient object of Employee
      // e1.setFirstName("Padma");
      // e1.setLastName("Uppalapati");
       e1.setFirstName("Pavan");
       e1.setLastName("U");
       session.save(e1);	// to persist Employee Object
       t.commit();
       System.out.println("Data Successfully saved to Database");
       session.close();	//object is in detached state
       sf.close();
       
    }
}
