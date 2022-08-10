<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="org.hibernate.*,org.hibernate.boot.registry.*,
	 org.hibernate.cfg.Configuration, 
	 com.wipro.velocity.Question,
	 com.wipro.velocity.Answer,
	 javax.persistence.TypedQuery,
	 java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>One to Many</title>
</head>
<body>
	<h1>One To Many Demo</h1>

	<%
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	//Hibernate 5 way of initializing the SessionFactory ->to increase performance
	SessionFactory factory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
	Session sess = factory.openSession();
	Transaction t = sess.beginTransaction();

	Answer a1 = new Answer();
	a1.setAnswername("HTML is a markup language");
	a1.setPostedBy("Raj");

	Answer a2 = new Answer();
	a2.setAnswername("HTML is used to display static web pages");
	a2.setPostedBy("Mike");

	Answer a3 = new Answer();
	a3.setAnswername("jQuery is a JS library");
	a3.setPostedBy("John Joseph");

	Answer a4 = new Answer();
	a4.setAnswername("jQuery simplifies AJAX");
	a4.setPostedBy("Arun");

	ArrayList<Answer> list1 = new ArrayList<Answer>();
	list1.add(a1);
	list1.add(a2);

	ArrayList<Answer> list2 = new ArrayList<Answer>();
	list2.add(a3);
	list2.add(a4);

	Question q1 = new Question();
	q1.setQname("What is HTML?");
	q1.setAnswers(list1);

	Question q2 = new Question();
	q2.setQname("What is jQuery?");
	q2.setAnswers(list2);

	sess.persist(q1);
	sess.persist(q2);

	t.commit();
	//session.close();
	out.println("success");
	%>
</body>
</html>