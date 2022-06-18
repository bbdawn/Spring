package org.kosta.myproject.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper // MapperProxy(Mapper Interface의 구현체-> 대리인객체)를 위한 설정 
public interface DepartmentMapper {

	int getAllDepartmentCount();

}
