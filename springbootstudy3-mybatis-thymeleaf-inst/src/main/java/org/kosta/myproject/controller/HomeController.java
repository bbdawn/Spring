package org.kosta.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("message", "방가방가 타임리프 템플릿엔진");
		//templates 아래의 thymeleaf program인 home.html 로 응답하게 된다 -> viewResolver 는 SpringBoot에서 자동 설정  
		return "home";
	}
}
