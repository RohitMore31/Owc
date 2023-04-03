package com.demo.test;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Democlass {

	@RequestMapping("/home")
	@ResponseBody
	public String home() {
		return "This  is a Home screen2";
	}
	
	@RequestMapping("/about")
	public ModelAndView aboutPage() {
		ModelAndView modelAndView = new ModelAndView("view/viewPage");
	    modelAndView.addObject("message", "Baeldung");
	    return modelAndView;
	}
}