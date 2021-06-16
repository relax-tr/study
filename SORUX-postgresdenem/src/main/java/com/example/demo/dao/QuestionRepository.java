package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

	public List<Question> findByQtext(String qtext);

}
