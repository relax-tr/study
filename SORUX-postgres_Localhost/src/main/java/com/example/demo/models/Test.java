package com.example.demo.models;

public class Test {

	public Test(Question tQuestion, Answer tAnswer) {
		super();
		this.tQuestion = tQuestion;
		this.tAnswer = tAnswer;
	}

	public Question gettQuestion() {
		return tQuestion;
	}

	public void settQuestion(Question tQuestion) {
		this.tQuestion = tQuestion;
	}

	public Answer gettAnswer() {
		return tAnswer;
	}

	public void settAnswer(Answer tAnswer) {
		this.tAnswer = tAnswer;
	}

	public Test() {

	}

	public Question tQuestion;
	public Answer tAnswer;

}
