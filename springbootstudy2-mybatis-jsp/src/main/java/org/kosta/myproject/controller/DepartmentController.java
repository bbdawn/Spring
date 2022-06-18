package org.kosta.myproject.controller;

import org.kosta.myproject.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DepartmentController {
	private DepartmentMapper departmentMapper;
	@Autowired
	public DepartmentController(DepartmentMapper departmentMapper) {
		super();
		this.departmentMapper = departmentMapper;
	}
	@RequestMapping("getAllDepartmentCount")
	public String getAllDepartmentCount(Model model) {
		model.addAttribute("totalDepartmentCount", departmentMapper.getAllDepartmentCount());
		return "department-count";
	}
}




