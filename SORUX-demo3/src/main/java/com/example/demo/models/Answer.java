package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int answerId;
	public int qid;
	public String answerText;
	public boolean Truemu;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public boolean isTruemu() {
		return Truemu;
	}

	public void setTruemu(boolean truemu) {
		Truemu = truemu;
	}

}
