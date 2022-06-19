package org.kosta.myproject.controller;

import java.util.List;

import org.kosta.myproject.mapper.ProductMapper;
import org.kosta.myproject.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {
	private ProductMapper productMapper;
	@Autowired
	public ProductController(ProductMapper productMapper) {
		super();
		this.productMapper = productMapper;
	}
	@GetMapping("getProductTotalCount")
	@ResponseBody // ajax 응답 : 리턴한 정보가 클라이언트측으로 전달 
	public int getTotalCount() {		
		return productMapper.getTotalCount();
	}
	/*
	 *  Thymeleaf 방식으로 ajax 응답시에는 @ResponseBody 어노테이션을 명시하지 않는다 
	 *  응답할 데이터를 Model 객체에 저장, name은 html의 ${변수명} 으로 할당
	 *  리턴값은 html 파일명::#id 명 형식으로 명시하면 thymeleaf template engine에서 필요한 html code를 만들어서 응답 
	 */
	@GetMapping("getProductTotalCount2") 
	public String getTotalCount2(Model model) {
		model.addAttribute("productCount", productMapper.getTotalCount());
		return "step10-ajax::#productCountView2";
	}
	@GetMapping("findAllProductList")
	@ResponseBody // ajax 응답
	public List<ProductVO> findAllProductList(){
		return productMapper.findAllProductList();
	}
	@GetMapping("findAllProductList2") // thymeleaf 를 이용한 ajax 처리 
	public String findAllProductList2(Model model) {
		List<ProductVO> list=productMapper.findAllProductList();
		model.addAttribute("productList", list);// thymeleaf each에서 사용하는 변수 
		return "step12-ajax ::#productTbody";// html파일명 :: 생성한 html을 삽입할 태그 id를 명시 
	}
}











