package org.kosta.myproject.controller;

import org.kosta.myproject.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor // lombok : final field parameter constructor 정의해 DI 하게 함
public class HomeController {
	private final MemberService memberService;
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("totalMemberCount", memberService.getTotalMemberCount());
		return "index";
	}
}








