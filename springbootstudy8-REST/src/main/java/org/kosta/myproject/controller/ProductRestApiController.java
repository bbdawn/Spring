package org.kosta.myproject.controller;

import java.util.List;

import org.kosta.myproject.mapper.ProductMapper;
import org.kosta.myproject.vo.ProductVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController // @Controller+ @ResponseBody
@RequiredArgsConstructor
public class ProductRestApiController {
	private final ProductMapper productMapper;
	@GetMapping("/product")
	public List<ProductVO> getAllProductList(){
		return productMapper.getAllProductList();
	}
	/*
	 *  ResponseEntity : rest 응답시 상태코드( http status code : 404 , 405, 500 ,200 ) 와 응답메세지를 전송하기
	 *  				   위한 클래스 
	 *  @PathVariable : url 정보를 컨트롤러 메서드의 변수로 할당받기 위한 어노테이션 
	 *  ex)  ip:port/product/1004  => 아래의 매개변수 id에 1004가 할당된다 
	 */
	@GetMapping("/product/{id}")
	public ResponseEntity<ProductVO> findProductById(@PathVariable("id") String id){
		ProductVO productVO=productMapper.findProductById(id);
		if(productVO==null) {
			return new ResponseEntity<ProductVO>(HttpStatus.NOT_FOUND);//상품정보가 없을 때는 404 Not Found
		}else {
			return new ResponseEntity<ProductVO>(productVO, HttpStatus.OK);//정상수행일때 상품정보와 200 OK으로 응답 
		}
	}
	@PostMapping("/product")
	public ResponseEntity<String> registerProduct(ProductVO productVO){
		productMapper.registerProduct(productVO);
		return new ResponseEntity<String>(productVO.getId()+" 상품 등록완료",HttpStatus.OK);
	}
	@PutMapping("/product")
	public ResponseEntity<String> updateProduct(ProductVO productVO){
		int result=productMapper.updateProduct(productVO);
		if(result==0) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(productVO.getId()+" 상품 수정완료",HttpStatus.OK);
	}
	@DeleteMapping("/product")
	public ResponseEntity<String> deleteProduct(String id){
		int result=productMapper.deleteProduct(id);
		if(result==0)
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<String>(id+" 상품 삭제완료",HttpStatus.OK);
	}
}




















