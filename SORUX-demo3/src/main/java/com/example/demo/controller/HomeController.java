package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.models.Answer;
import com.example.demo.models.Category;
import com.example.demo.models.Question;
import com.example.demo.services.AnswerServices;
import com.example.demo.services.CategoryService;
import com.example.demo.services.QuestionServices;

@Controller
public class HomeController {

	@Autowired
	private QuestionServices qservices;

	@Autowired
	private CategoryService cServices;

	@Autowired
	private AnswerServices cAnswerServices;

	@GetMapping("/")

	public ModelAndView home(ModelAndView model, @RequestParam(defaultValue = "") String qtext) {

		ModelAndView mav = new ModelAndView("index");

		Question question = new Question();

		mav.addObject("categories", cServices.findAll());

		if (qtext.isEmpty() || qtext.isBlank() || qtext == null) {

			mav.addObject("questions", qservices.listall());

		}

		else {

			mav.addObject("questions", qservices.findByQtext(qtext));
		}
		mav.addObject("question", question);

		mav.addObject("message", "wellcome to soru-x world");

		return mav;
	}

	@RequestMapping("/search")
	public String search(@RequestParam String qtext, RedirectAttributes redirectAttributes) {

		redirectAttributes.addFlashAttribute("questions", qservices.findByQtext(qtext));

		return "redirect:/";
	}

	@RequestMapping("/new")

	public String addQuestion(Map<String, Object> model) {

		model.put("question", new Question());

//		List<Answer> answers = new ArrayList<>();

		model.put("answer", new Answer());

		model.put("categories", cServices.findAll());

		return "addquestion";
	}

	@RequestMapping("/newCategory")

	public String addCategory(Map<String, Object> model) {

		model.put("category", new Category());

		return "addcategory";
	}

	@RequestMapping("/soruislem")

	public ModelAndView soruIslem() {

		ModelAndView mav = new ModelAndView("soruislem");

		Category category = new Category();

		mav.addObject("categories", cServices.findAll());

		mav.addObject("question", category);

		mav.addObject("message", "wellcome to soru-x world");

		return mav;

	}

	@PostMapping(path = "/answeradd")

	public String addOrder(Answer answer) {

		System.err.println(answer.Truemu);

		cAnswerServices.save(answer);

		return "redirect:/";
	}

	@PostMapping(value = "/save")

	public ModelAndView saveQuestion(@ModelAttribute("question") Question question,
			@ModelAttribute("answer") Answer answer, @ModelAttribute("category") Category category) {

		qservices.save(question);

		ModelAndView mav = new ModelAndView("addquestion");

		mav.addObject("question", question);

		return mav;
	}

	@PostMapping(value = "/savecategory")

	public String savecategory(@ModelAttribute("category") Category category) {

		cServices.save(category);

		return "redirect:/soruislem";
	}

	@GetMapping("/update/{id}")

	public ModelAndView update(@PathVariable(value = "id") int id) {

		ModelAndView mav = new ModelAndView("update");

		Question question = qservices.getQuestionByid(id);

		mav.addObject("question", question);

		mav.addObject("categories", cServices.findAll());

		return mav;
	}

	@GetMapping("/delete/{id}")

	public String delete(@PathVariable(value = "id") int id) {

		Question question = qservices.getQuestionByid(id);
		qservices.deleteById(id);

		return "redirect:/";
	}

}
