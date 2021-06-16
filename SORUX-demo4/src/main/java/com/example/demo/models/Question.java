package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionid;

	private int categoryid;

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public int getQuestionid() {
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public int getId() {
		return questionid;
	}

//	public String getCname() {
//
//		String catgeroyname = "opps... category ismimnde sorun var";
//
//		for (Category category : new CategoryService().findAll()) {
//
//			if (category.getCategoryid() == categoryid)
//
//				catgeroyname = category.getCname();
//
//		}
//
//		return catgeroyname;
//	}

	public void setId(int id) {
		this.questionid = id;
	}

	private String qtext;

	public String getQtext() {
		return qtext;
	}

	public void setQtext(String qtext) {
		this.qtext = qtext;
	}

	public Question(String qtext) {
		this.qtext = qtext;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

}
