package org.kosta.myproject.controller;

import org.kosta.myproject.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PointController {
	private final MemberService memberService;
	@RequestMapping("findPointById")
	public String findPointById(String id,Model model) {
		model.addAttribute("pointVO", memberService.findPointById(id));
		return "findpointbyid-result.html";
	}
}








