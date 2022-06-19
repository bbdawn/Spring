package org.kosta.myproject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.myproject.vo.ProductVO;

@Mapper
public interface ProductMapper {
	public int getTotalCount();

	public List<ProductVO> findAllProductList();
}
