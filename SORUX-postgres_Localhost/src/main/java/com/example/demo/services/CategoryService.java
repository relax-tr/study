package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CategoryRepo;
import com.example.demo.models.Category;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepo crepo;

	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return crepo.findAll();
	}

	public void save(Category category) {

		crepo.save(category);

	}

}
