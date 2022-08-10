<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page
	import="org.hibernate.*,
	 org.hibernate.cfg.Configuration, 
	 com.wipro.velocity.Customer,
	 com.wipro.velocity.Address,
	 javax.persistence.TypedQuery,
	 java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>One to One</title>
</head>
<body>
	<h1>One To One Bi-Directional Association Mapping</h1>

	<%
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	//Hibernate 4 way of initializing the SessionFactory
	SessionFactory factory = cfg.buildSessionFactory();
	Session sess = factory.openSession();
	Transaction t = sess.beginTransaction();

	Customer c = new Customer();
	c.setName("Vijaya");
	c.setEmail("Vijaya@gmail.com");

	Address a = new Address();
	a.setHouseNo(109);
	a.setStreet("RamNagar");
	a.setCity("kukatpally");
	a.setState("Telangana");
	a.setCountry("India");
	a.setPincode(562119);

	c.setAddress(a);
	a.setCust(c);

	sess.persist(c);
	t.commit();
	//sess.close();

	out.print("Data Successfully Saved");

	out.print("<br>" + "************* Data Retrieval ****************"+"<br>");

	sess.beginTransaction();
	TypedQuery qry = sess.createQuery("from Customer");
	List<Customer> list = qry.getResultList();

	Iterator<Customer> itr = list.iterator();
	while (itr.hasNext()) {
		Customer cust = itr.next();
		out.println(cust.getEmpId() + " " + cust.getName() + " " + cust.getEmail());
		Address add = cust.getAddress();
		out.println(add.getHouseNo() + " " + add.getStreet() + " " + add.getCity() + " " + add.getState() + " "
		+ add.getCountry() + " " + add.getPincode()+"<br>");
	}
	sess.close();
	out.println("success");
	%>
</body>
</html>