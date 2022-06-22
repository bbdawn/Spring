package org.kosta.myproject.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.myproject.vo.DepartmentVO;

@Mapper
public interface DepartmentMapper {

	DepartmentVO findDepartmentByNo(int departmentNo);

	Map<String, Object> findDepartmentMapByNo(int departmentNo);

	List<DepartmentVO> findAllDepartmentList();

}
