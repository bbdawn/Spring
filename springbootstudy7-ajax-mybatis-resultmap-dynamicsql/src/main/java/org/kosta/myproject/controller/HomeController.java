package org.kosta.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("message", "SpringBoot Ajax MyBatis DynamicSQL");
		return "index";
	}
	@PostMapping("test")
	public String home() {
		return "method-test";
	}
}





