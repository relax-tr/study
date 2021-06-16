package com.example.demo.CONTROLLER;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")

	public String home() {

		return "index";
	}

	@RequestMapping("/sorular")

	public String sorular() {

		return "sorular";
	}

	@RequestMapping("/sayfam")

	public String sayfam() {

		return "sayfam";
	}
}
