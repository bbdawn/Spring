package org.kosta.myproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.myproject.vo.PointVO;

@Mapper
public interface PointMapper {

	PointVO findPointById(String id);

	int register(PointVO pointVO);

}
