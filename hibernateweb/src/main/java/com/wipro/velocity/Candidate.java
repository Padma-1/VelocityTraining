package com.wipro.velocity;

import java.util.Date;

public class Candidate extends Person {

	private Date joiningDate;
	private String departmentName;

	
	public Candidate() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Candidate(String firstname, String lastname, Date jd, String deptName) {
		super(firstname, lastname);
		this.joiningDate = jd;
		this.departmentName = deptName;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
