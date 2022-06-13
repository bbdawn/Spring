package org.kosta.myproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.myproject.vo.ProductVO;

@Mapper
public interface ProductMapper {

	int getTotalProductCount();

	ProductVO findProductByNo(int productNo);
	
}
