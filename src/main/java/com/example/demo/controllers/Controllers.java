package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/")
public class Controllers {
	
	@GetMapping(path = {"index"})
	public ModelAndView getIndex(ModelMap model) {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
}
