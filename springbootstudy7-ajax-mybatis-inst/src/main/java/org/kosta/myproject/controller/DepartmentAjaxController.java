package org.kosta.myproject.controller;

import java.util.List;
import java.util.Map;

import org.kosta.myproject.mapper.DepartmentMapper;
import org.kosta.myproject.vo.DepartmentVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class DepartmentAjaxController {
	private final DepartmentMapper departmentMapper;
	
	@GetMapping("testAjax")
	@ResponseBody // ajax 응답을 위한 어노테이션 ( 페이지가 아니라 데이터로 응답 ) 
	public String testAjax(String userId) {
		return "hello ajax";
	}
	@GetMapping("findDepartmentByNo")
	@ResponseBody // VO 가 JSONObject로 변환되어 클라이언트에게 응답 
	public DepartmentVO findDepartmentByNo(int departmentNo) {
		return departmentMapper.findDepartmentByNo(departmentNo);
	}
	@GetMapping("findDepartmentMapByNo")
	@ResponseBody // Map 이 JSONObject로 변환되어 클라이언트에게 응답 
	public Map<String,Object> findDepartmentMapByNo(int departmentNo){
		return departmentMapper.findDepartmentMapByNo(departmentNo);
	}
	@GetMapping("findAllDepartmentList")
	@ResponseBody // List<DepartmentVO> 가 JSONArray로 변환되어 클라이언트에게 응답 
	public List<DepartmentVO> findAllDepartmentList(){
		return departmentMapper.findAllDepartmentList();
	}
}





