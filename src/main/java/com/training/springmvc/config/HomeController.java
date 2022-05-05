package com.training.springmvc.config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String displayLogin(ModelMap model) {
		model.addAttribute("value", "Please login to continue.");
		return "index";
	}
	
	@RequestMapping("/message")
	public String displayMessage(ModelMap model) {
		model.addAttribute("value", "this is a special message");
		return "message";
	}
	
	@RequestMapping("/failure")
	public String displayMess(ModelMap model) {
		model.addAttribute("value", "failure test");
		return "message";
	}
	
}
