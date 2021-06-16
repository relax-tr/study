package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testcontroller {

	@Value("${spring.application.name}")
	String appName;

	@GetMapping("/")
	public String homePage(Model model) {

		model.addAttribute("appName", appName);

		return "test";
	}
}
