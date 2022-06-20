package org.kosta.myproject.controller;

import org.kosta.myproject.service.MemberService;
import org.kosta.myproject.vo.MemberVO;
import org.kosta.myproject.vo.PointVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MemberController {
	private final MemberService memberService;
	@RequestMapping("findMemberById")
	public String findMemberById(String id,Model model) {
		model.addAttribute("memberVO", memberService.findMemberById(id));
		return "findmemberbyid-result";
	}
	@PostMapping("register")
	public String registerMemberAndPoint(MemberVO memberVO, PointVO pointVO) {
		log.debug("memberService Proxy {}",memberService.getClass());
		memberService.registerMemberAndPoint(memberVO, pointVO);
		return "register-result";
	}
}










