package org.kosta.myproject.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor // MyBatis 에서는 기본 생성자를 만들어 준다 
public class EmployeeVO {
	private int employeeNo;
	private String name;
	private int salary;
	private DepartmentVO departmentVO;
}
