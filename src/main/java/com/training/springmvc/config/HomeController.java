package com.training.springmvc.config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String displayGreeting(ModelMap model) {
		model.addAttribute("message", "hello from homecontroller");
		return "home";
	}
	
	@RequestMapping("/message")
	public String displayMessage(ModelMap model) {
		model.addAttribute("value", "this is a special message");
		return "message";
	}
}
