package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.QuestionRepository;
import com.example.demo.models.Question;

@Service
public class QuestionServices {

	@Autowired
	private QuestionRepository qrepo;

	public List<Question> listall() {

		return qrepo.findAll();
	}

	public void save(Question question) {

		qrepo.save(question);

	}

	public Question getQuestionByid(Integer id) {

		Optional<Question> questionEdit = qrepo.findById(id);
		Question question = null;
		if (questionEdit.isPresent()) {

			question = questionEdit.get();
		} else {

			throw new RuntimeException("uupps.. somtrihi, wrong");
		}

		return question;

	}

	public void deleteById(Integer id) {

		qrepo.deleteById(id);

	}

	public List<Question> findByQtext(String qtext) {

		return qrepo.findByQtext(qtext);
	}

}
