package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Deneme {

	@GetMapping("/")
	public ModelAndView home() {

		ModelAndView mav = new ModelAndView("home");

		mav.addObject("message", "dokunursam giderim, jquery çalışıyoe demektir");

		return mav;
	}

}
