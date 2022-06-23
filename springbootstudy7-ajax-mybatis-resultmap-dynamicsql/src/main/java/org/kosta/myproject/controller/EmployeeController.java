package org.kosta.myproject.controller;

import java.util.List;

import org.kosta.myproject.mapper.DepartmentMapper;
import org.kosta.myproject.mapper.EmployeeMapper;
import org.kosta.myproject.vo.EmployeeVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor // lombok  final field 생성자 정의 
@Slf4j
public class EmployeeController {
	private final DepartmentMapper departmentMapper;
	private final EmployeeMapper employeeMapper;
	@RequestMapping("employeeAjaxTest")
	public String employeeAjaxTest(Model model) {
		// select option 에서 제공할 주소 리스트를 mapper에서 가져와 공유 
		model.addAttribute("deptList", departmentMapper.findAllDepartmentList());
		log.debug("employeeAjaxTest");
		return "employee/list";
	}
	@RequestMapping("employeeAjaxTest2")
	public String employeeAjaxTest2(Model model) {
		// select option 에서 제공할 주소 리스트를 mapper에서 가져와 공유 
		model.addAttribute("deptList", departmentMapper.findAllDepartmentList());
		log.debug("employeeAjaxTest2");
		return "employee/list2";
	}
	@RequestMapping("findEmployeeListDynamicSql")
	@ResponseBody // ajax 응답 ( List 를 JSONArrary 로 변환해 응답 ) 
	public List<EmployeeVO> findEmployeeListDynamicSql(EmployeeVO employeeVO) {
		log.debug("param:{}",employeeVO);// 사원명 name 과 부서번호 departmentVO 의 departmentNo 할당을 확인 
		return employeeMapper.findEmployeeListDynamicSql(employeeVO);
	}
	//  thymeleaf 를 이용해 컨트롤러에서 html 요소를 응답하도록 처리 
	@RequestMapping("findEmployeeListDynamicSql2")
	public String findEmployeeListDynamicSql2(EmployeeVO employeeVO,Model model) {
		model.addAttribute("empList", employeeMapper.findEmployeeListDynamicSql(employeeVO));
		// employee/list2 => view name 
		// :: #empTbody  타임리프가 model의 empList를 이용해 생성한 html 요소를 반영할 요소 id 
		return "employee/list2 :: #empTbody";
	}
}











