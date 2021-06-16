package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryid;

	private String cname;

	private String omer;

	public String getOmer() {
		return omer;
	}

	public void setOmer(String omer) {
		this.omer = omer;
	}

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(String cname) {
		this.cname = cname;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

}
