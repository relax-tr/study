package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

	public List<Answer> findByQid(int qid);

}
