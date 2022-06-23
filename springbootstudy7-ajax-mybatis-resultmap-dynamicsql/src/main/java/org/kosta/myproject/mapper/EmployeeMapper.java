package org.kosta.myproject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.myproject.vo.EmployeeVO;

@Mapper
public interface EmployeeMapper {

	EmployeeVO findEmployeeByNo(int employeeNo);

	List<EmployeeVO> findEmployeeListDynamicSql(EmployeeVO employeeVO);

}
