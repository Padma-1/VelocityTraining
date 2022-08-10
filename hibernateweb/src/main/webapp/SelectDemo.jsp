<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="org.hibernate.query.Query,
				org.hibernate.*,
				org.hibernate.cfg.Configuration,
				com.wipro.velocity.User,
				java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HQL</title>
</head>
<body>

	<h1>HQL - Hibernate Query Language</h1>
	<h2>HQL Select Query</h2>
	<%
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	Session sess = factory.openSession();
	sess.beginTransaction();

	Query<User> qry = sess.createQuery("from User"); //Quering the User pojo class.
	List<User> lst = (List<User>) qry.list();
	out.println("<h3>List of Employeees:</h3>" + "<br>");
	for (User st : lst) {
		out.println(st.getId() + " " + st.getName() + " " + st.getEmail() + "<br>");
	}

	out.println("<br/>");

	//Parameter Queries
	qry = sess.createQuery("from User U where U.id=:id");
	qry.setInteger("id", 6);
	List<User> list3 = (List<User>) qry.list();
	out.println("List of Employees with Criteria:" + "<br>");
	for (User st : list3) {
		out.println(st.getId() + "," + st.getName() + "," + st.getEmail() + "<br>");
	}

	//HQL Aggregate Functions - SUM,MAX,MIN,COUNT
	Query qry1 = sess.createQuery("select count(*) from User");
	Long cnt = (Long) qry1.uniqueResult(); // can also change to these lines, to get same output,List<Integer>lst = qry1.list();
	out.println("Total Employees Count is : " + cnt); //out.println(lst.get(0))

	//HQL Pagination Example
	qry = sess.createQuery("from User"); //Quering the User pojo class.
	qry.setFirstResult(1); //index starts from 0, I'm giving 1 means-display results from id:2
	qry.setMaxResults(2); //To display 2 records.
	List<User> lst3 = (List<User>) qry.list();
	out.println("<h3>Paginated List of Employeees:</h3>" + "<br>");
	for (User st : lst3) {
		out.println(st.getId() + " " + st.getName() + " " + st.getEmail() + "<br>");
	}

	out.println("<br/>");
	%>
</body>
</html>