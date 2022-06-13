package org.kosta.myproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kosta.myproject.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest   //  자바 테스트를 위한 어노테이션 ( junit test framework 을 지원 ) 
class Springbootstudy1MybatisJspApplicationTests {
	@Autowired
	private ProductMapper productMapper;
	@Test
	void contextLoads() {
		Assertions.assertNotNull(productMapper);
	}
	@Test
	public void getTotalProductCount() {
		int count=productMapper.getTotalProductCount();
		Assertions.assertNotEquals(0,count);
	}
	@Test
	public void findProductByNo() {
		int productNo=1;
		Assertions.assertNotNull(productMapper.findProductByNo(productNo));
	}
}







