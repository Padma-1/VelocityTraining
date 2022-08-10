<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*,
				org.hibernate.*,
				org.hibernate.cfg.Configuration,
				com.wipro.velocity.Student,
				com.wipro.velocity.StudentClass"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Component Mapping</title>
</head>
<body>
	<h1>Component Mapping Demo</h1>
	<%
	Session s = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	Transaction t = s.beginTransaction();
	StudentClass studentClass = new StudentClass("MSc", "A1");
	Student student = new Student("Pavan", "Uppalapati", "A1/05/12", 22, studentClass);
	s.save(student); //saved as persistent object
	out.println("Data saved successfully");
	t.commit();
	t = s.beginTransaction();
	List<Student> students = s.createQuery("From Student").list();
	for (Student s1 : students) {
		out.println("<br><br>" + "First Name: " + s1.getFirstName() + "<br>");
		out.println("<br>" + "Last Name: " + s1.getLastName() + "<br>");
		out.println("<br>" + "Roll No: " + s1.getRollNo() + "<br>");
		out.println("<br>" + "Age: " + s1.getAge() + "<br>");

		StudentClass sc1 = s1.getStudentClass();
		out.println("Class name: " + sc1.getClassName() + "<br>");
		out.println("Class Id: " + sc1.getClassId() + "<br>");
		out.println("<br>" + "--------------------------");
	}
	%>
</body>
</html>