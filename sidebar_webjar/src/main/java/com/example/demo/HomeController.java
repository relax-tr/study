package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("")
	public String home() {

		return "asd";
	}

	@RequestMapping("testasd")
	public String home2() {

		return "testasd";
	}

}
