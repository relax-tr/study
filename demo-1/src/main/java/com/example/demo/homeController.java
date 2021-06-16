package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class homeController {
	@GetMapping("/")
	public String homePage() {
		return "index";
	}

	@GetMapping("/contact")
	public String contactPage() {
		return "contact";
	}

	@GetMapping("/about")
	public String aboutPage() {
		return "about";
	}
}
