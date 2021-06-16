
package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {

	@RequestMapping("")
	public String home(Model model) {

		model.addAttribute("test", new String("test string"));

		ArrayList<book> deneme = new ArrayList<>();

		deneme.add(new book("aaa", "aab", 111));
		deneme.add(new book("bbb", "aab", 222));
		deneme.add(new book("bbb", "aab", 333111));
		deneme.add(new book("bbb", "aab", 4444));
		deneme.add(new book("bbb", "aab", 44));

		model.addAttribute("book", new book("aaa", "aab", 111));
		model.addAttribute("bookliste", deneme);

		return "home";
	}

	@RequestMapping("/asd")
	public String index(Model model) {

		model.addAttribute("test", new String("test string"));

		return "asd";
	}

}

class book {

	public String name;
	public String title;

	public Integer count;

	public book(String name, String title, Integer count) {
		super();
		this.name = name;
		this.title = title;
		this.count = count;
	}

}
