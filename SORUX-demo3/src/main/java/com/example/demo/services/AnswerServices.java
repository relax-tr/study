package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AnswerRepository;
import com.example.demo.models.Answer;

@Service
public class AnswerServices {

	@Autowired
	private AnswerRepository arepo;

	public void save(Answer answer) {

		arepo.save(answer);

	}

}
