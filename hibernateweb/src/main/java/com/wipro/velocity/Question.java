package com.wipro.velocity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

//persistent class for one-many mapping

@Entity
@Table(name=("question"))
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
//	@Transient - this property will not be saved in db
	private String qname;
	
	@OneToMany(cascade=CascadeType.ALL)
	
	@JoinColumn(name="qid")	//foreign key field in Answer Table
	@OrderColumn(name="type")
	private List<Answer> answers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
	
	
}
