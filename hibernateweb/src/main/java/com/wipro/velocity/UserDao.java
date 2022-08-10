package com.wipro.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDao {
	public static int register(User u) {
		
		int i = 0;
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession(); // Physical connection with database
		
		Transaction t = session.beginTransaction();
		
		i = (Integer) session.save(u);	//save to DB
		
		t.commit();
		session.close();
		return i;

	}

}
