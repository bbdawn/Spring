package org.kosta.myproject.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kosta.myproject.mapper.MemberMapper;
import org.kosta.myproject.mapper.PointMapper;
import org.kosta.myproject.service.MemberService;
import org.kosta.myproject.vo.MemberVO;
import org.kosta.myproject.vo.PointVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j // lombok 에서 slf4j 선언을 지원 
class Springbootstudy6AopTransactionApplicationTests {
	//@Resource
	PointMapper pointMapper;
	MemberMapper memberMapper;
	MemberService memberService;
	/*
	 * 	JUnit 4 버전에서는 constructor injection 즉 생성자 di 는 지원하지 않음 -> Field Injection 을 이용
	 * JUnit 5 버전에서는  constructor injection 즉 생성자 di 는 지원하고 생성자에 반드시 @Autowired를 명시해야 함
	 * (참고 - SpringBoot 2.2 대 이상은 JUnit5 를 이용 , 현재 버전은 SpringBoot 2.7 임 ) 
	 */	
	@Autowired // JUnit Test 에서는 반드시 @Autowired 를 적용해야 DI 됨 
	public Springbootstudy6AopTransactionApplicationTests(PointMapper pointMapper,MemberMapper memberMapper,MemberService memberService) {
		super();
		this.pointMapper = pointMapper;
		this.memberMapper=memberMapper;
		this.memberService=memberService;
	}

	@Test
	void contextLoads() {
		log.debug("pointMapper:{}",pointMapper);
		log.debug("memberMapper:{}",memberMapper);
		log.debug("memberService:{}",memberService);
	}
	@Test
	void findPointById() {
		String id="java";
		PointVO pointVO=pointMapper.findPointById(id);
		Assertions.assertNotNull(pointVO);
	}
	@Test
	void findMemberById() {
		String id="java";
		MemberVO memberVO=memberMapper.findMemberById(id);
		Assertions.assertNotNull(memberVO);
	}
	@Test
	void getTotalMemberCount() {
		//int count=memberMapper.getTotalMemberCount();
		int count=memberService.getTotalMemberCount();
		Assertions.assertEquals(1, count);
	}
	@Test
	void checkMemberAndPoint(){
		String id="java";
		MemberVO memberVO=memberService.findMemberById(id);
		log.info("member:{}",memberVO);
		PointVO pointVO=memberService.findPointById(id);
		log.info("point:{}",pointVO);
	}
	@Test
	void registerMember() {
		MemberVO memberVO=new MemberVO("spring","a","손흥민","토트넘");
		int result=memberMapper.register(memberVO);
		Assertions.assertEquals(1, result);
	}
	@Test
	void registerPoint() {
		PointVO pointVO=new PointVO("spring",10000,"cgv");
		int result=pointMapper.register(pointVO);
		Assertions.assertEquals(1, result);
	}
	@Test
	void registerMemberAndPoint() {
		MemberVO memberVO=new MemberVO("java","a","이강인","토트넘");
		PointVO pointVO=new PointVO("java",20000,"cgv");
		log.info("memberService {}",memberService.getClass());
		memberService.registerMemberAndPoint(memberVO,pointVO);
	}
}








