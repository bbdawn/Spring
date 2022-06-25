package org.kosta.myproject.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController // @Controller + @ResponseBody
@Slf4j
public class MyRestController {
	@GetMapping("/item/{id}") 
	public String testGet(@PathVariable("id") String id) { //@PathVariable : url 정보를 변수의 데이터로 할당받기 위한 어노테이션
		log.info("rest get");
		return id+" id 아이템정보를 조회";
	}
	@PostMapping("/item") 
	public String testPost(String id) { 
		log.info("rest post");
		return id+" id 아이템정보를 생성";
	}
	@PutMapping("/item")
	public String testPut(String id) {
		log.info("rest put");
		return id+" id 아이템 정보를 수정";
	}
	@DeleteMapping("/item")
	public String testDelete(String id) {
		log.info("rest delete");
		return id+" id 아이템 정보를 삭제";
	}
}









