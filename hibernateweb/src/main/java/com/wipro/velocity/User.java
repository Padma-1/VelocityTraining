package com.wipro.velocity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Hibernate persistence class using annotation configuration

@Entity
@Table(name = "User100")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int id;
	
	@Column(name = "user_name")
	private String name;

	private String password;
	private String email;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	/*
	 * String hql="select U.name from User U";
	 * 
	 * qry=sess.createQuery(hql); List<User>list1=(List<User>)qry.getResultList();
	 * out.println("List of Names::"+"<br>"); for(User st:list1){
	 * out.println(st.getName()+"<br>"); } out.println("<br/>");
	 */

}
