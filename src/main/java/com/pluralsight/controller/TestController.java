package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping(value="/test")
	public String testController(Model model) {
		
		model.addAttribute("test", "Nice for what?");
		
		return "test";
	}
	
}
