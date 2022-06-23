package org.kosta.myproject.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kosta.myproject.mapper.EmployeeMapper;
import org.kosta.myproject.vo.DepartmentVO;
import org.kosta.myproject.vo.EmployeeVO;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class EmployeeUnitTest {
	@Resource // field injection 
	EmployeeMapper employeeMapper;
	@Test
	void mapper() {
		Assertions.assertNotNull(employeeMapper);
	}
	@Test
	void findEmployeeByNo() {
		// Employee 조회시 Department 정보도 함께 조회 => resultmap 을 이용 
		int employeeNo=1;
		EmployeeVO evo=employeeMapper.findEmployeeByNo(employeeNo);
		log.debug("employee:{}",evo);		
	}
	/*
	 MyBatis Dynamic SQL  활용하여 다양한 검색조건을 하나의 메서드에서 처리 
	 1. 부서번호와 사원명이 없을 때에는 전체 사원 리스트 조회 
	 2. 부서번호만 있으면 부서번호로 조회 
	 3. 사원명 검색 키워드가 있으면 사원명 키워드 like 조회 
	 4. 부서번호와 사원명이 있으면 두 조건으로 조회 
   */
	@Test
	void findEmployeeListDynamicSqlTest1() {
		//  1. 부서번호와 사원명이 없을 때에는 전체 사원 리스트 조회 
		EmployeeVO employeeVO=new EmployeeVO();
		List<EmployeeVO> list=employeeMapper.findEmployeeListDynamicSql(employeeVO);
		for(EmployeeVO vo:list)
			log.debug("employee: {}",vo);
	}
	@Test
	void findEmployeeListDynamicSqlTest2() {
		// 2. 부서번호만 있으면 부서번호로 사원 리스트 조회 
		EmployeeVO employeeVO=new EmployeeVO();
		DepartmentVO departmentVO=new DepartmentVO();
		departmentVO.setDepartmentNo(10);
		employeeVO.setDepartmentVO(departmentVO);
		List<EmployeeVO> list=employeeMapper.findEmployeeListDynamicSql(employeeVO);
		for(EmployeeVO vo:list)
			log.debug("employee: {}",vo);
	}
	@Test
	void findEmployeeListDynamicSqlTest3() {
		//  3. 사원명 검색 키워드가 있으면 사원명 키워드 like 조회 
		EmployeeVO employeeVO=new EmployeeVO();
		employeeVO.setName("유");
		List<EmployeeVO> list=employeeMapper.findEmployeeListDynamicSql(employeeVO);
		for(EmployeeVO vo:list)
			log.debug("employee: {}",vo);
	}
	@Test
	void findEmployeeListDynamicSqlTest4() {
		//4. 부서번호와 사원명이 있으면 두 조건으로 조회
		EmployeeVO employeeVO=new EmployeeVO();
		employeeVO.setName("두");
		DepartmentVO departmentVO=new DepartmentVO();
		departmentVO.setDepartmentNo(20);
		employeeVO.setDepartmentVO(departmentVO);
		List<EmployeeVO> list=employeeMapper.findEmployeeListDynamicSql(employeeVO);
		for(EmployeeVO vo:list)
			log.debug("employee: {}",vo);
	}
}












