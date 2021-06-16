package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}
