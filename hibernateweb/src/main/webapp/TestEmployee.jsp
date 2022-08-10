<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*,
				org.hibernate.*,
				org.hibernate.cfg.Configuration,
				com.wipro.velocity.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Collection Mapping</title>
</head>
<body>
	<h1>Hibernate Collection Mapping Demo Using XML Configuration</h1>

	<%
	Session s = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	Transaction t = s.beginTransaction();
	Employee e = new Employee();
	e.setEmployeeId(121);
	e.setEmployeeName("Fatima");
	
	Set<String> phoneNumbers = new HashSet<String>();
	phoneNumbers.add("98879423");
	phoneNumbers.add("8134327048");
	
	e.setPhoneNumbers(phoneNumbers);
	
	s.save(e);
	t.commit();

	//Retrieve records using Query Interface

	List<Employee> empList = s.createQuery("from Employee", Employee.class).list();
	Iterator<Employee> itr = empList.iterator();
	while (itr.hasNext()) {
		Employee emp = itr.next();
		out.print("<br>" + "Employee Id: " + emp.getEmployeeId() + "<br>");
		out.print("Employee Name: " + emp.getEmployeeName() + "<br>");

		Set<String> set = emp.getPhoneNumbers();
		Iterator<String> itr2 = set.iterator();
		out.print("Employee Phone Numbers: ");
		while (itr2.hasNext()) {
			out.println(itr2.next());
		}
		out.println("<br>" + "--------------------------------------");
	}

	s.close();
	out.println("<br>" + "success");
	%>

</body>
</html>