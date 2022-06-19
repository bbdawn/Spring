package org.kosta.myproject;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kosta.myproject.mapper.ProductMapper;
import org.kosta.myproject.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springbootstudy4ThymeleafApplicationTests {
	@Autowired
	ProductMapper productMapper;
	@Test
	void contextLoads() {
		Assertions.assertNotNull(productMapper);
	}
	@Test
	void getTotalCount() {
		Assertions.assertNotEquals(0, productMapper.getTotalCount());
	}
	@Test
	void findAllProductList() {
		List<ProductVO> list=productMapper.findAllProductList();
		Assertions.assertNotEquals(0, list.size());
	}
}
















