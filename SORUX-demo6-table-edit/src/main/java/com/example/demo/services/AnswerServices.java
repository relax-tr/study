package com.example.demo.services;

import java.util.List;
import java.util.Optional;

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

	public List<Answer> findByQid(int qid) {

		return arepo.findByQid(qid);
	}

	public Answer findByDogan(String deneme) {
		return null;
	}

	public Answer getAnswerByid(Integer id) {

		Optional<Answer> answeredit = arepo.findById(id);
		Answer answer = null;
		if (answeredit.isPresent()) {

			answer = answeredit.get();
		} else {

			throw new RuntimeException("GET ANSWEWR BU İD MEDOTUNDA SORUN VAR");
		}

		return answer;

	}

	public void deleteById(Integer id) {

		arepo.deleteById(id);

	}

}
