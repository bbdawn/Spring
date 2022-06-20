package org.kosta.myproject.service;

import org.kosta.myproject.mapper.MemberMapper;
import org.kosta.myproject.mapper.PointMapper;
import org.kosta.myproject.vo.MemberVO;
import org.kosta.myproject.vo.PointVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
// Service Layer 에 적용하는 어노테이션 : 비즈니스 로직을 캡슐화 , 트랜잭션 제어하는 계층 
@Service
@RequiredArgsConstructor // lombok : field field를 매개변수로 받는 생성자를 정의 
@Slf4j
public class MemberServiceImpl implements MemberService {
	private final MemberMapper memberMapper;
	private final PointMapper pointMapper;
	/*
	@Autowired
	public MemberServiceImpl(MemberMapper memberMapper, PointMapper pointMapper) {
		super();
		this.memberMapper = memberMapper;
		this.pointMapper = pointMapper;
	}
	*/
	@Override
	public int getTotalMemberCount() {
		return memberMapper.getTotalMemberCount();
	}
	@Override
	public MemberVO findMemberById(String id) {		
		return memberMapper.findMemberById(id);
	}
	@Override
	public PointVO findPointById(String id) {		
		return pointMapper.findPointById(id);
	}
	/*
	 	트랜잭션 처리 : 회원 가입시 포인트 지급이 약속된 업무 business 
	 	회원 정보와 포인트 정보가 모두 정상적으로 등록될 때 commit 
	 	세부 작업 진행 중 문제가 발생( Error 와 RuntimeException계열 Exception )하면 
	 	진행되었던 모든 작업은 rollback( 취소하고 원상태로 복귀 ) 되어야 한다  
	 	
	 	  **Spring AOP Transaction**
    
    @Transactional : AOP 기반 선언적 방식의 트랜잭션 처리 
    				   @Transactional 어노테이션을 적용하면 AOP Proxy(대리인) 객체가 Transaction 제어를 한다  
    				   해당 서비스 메서드에서 Error 와 RuntimeException(unchecked exception) 계열 Exception 발생하면 자동 rollback
    				   Spring Data 관련 Exception 은 모두 java.lang.RuntimeException 의 하위 Exception 이다 
    				   모든 작업이 문제없이 실행되면 commit 
	*/
	@Transactional // AOP 기반 선언적 트랜잭션 처리가 되도록 명시 
	@Override
	public void registerMemberAndPoint(MemberVO memberVO, PointVO pointVO) {
		memberMapper.register(memberVO);		
		log.debug("member register {}",memberVO);
		// transaction 처리가 되지 않았을 때 문제가 되는 상황을 확인하기 위해 고의로 id를 변경해본다
		//pointVO.setId("문제가 될 아이디");//참조 무결성 제약조건 예외가 발생되도록 id 변경함 
		pointMapper.register(pointVO);
		log.debug("point register {}",pointVO);
	}
}







