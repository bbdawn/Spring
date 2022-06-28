package org.kosta.myproject.model;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 컴포넌트 계열 어노테이션 : 스프링 컨테이너가 스캔하여 bean 생성해 관리 
public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO;
	// 생성자가 하나인 경우에는 아래 DI 어노테이션 생략가능 
	@Autowired // DI 계열 어노테이션 : 매개변수의 타입에 맞는 bean(의존성)을 스프링컨테이너가  주입한다  
	public MemberServiceImpl(MemberDAO memberDAO) {
		super();
		this.memberDAO = memberDAO;
		System.out.println("**MemberServiceImpl 생성자를 통해 "+memberDAO+" 구현체를 주입받는다");
	}

	@Override
	public MemberVO findMemberById(String id) throws SQLException {
		return memberDAO.findMemberById(id);
	}
}
