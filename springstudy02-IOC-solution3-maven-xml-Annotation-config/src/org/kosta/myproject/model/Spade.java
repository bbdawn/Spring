package org.kosta.myproject.model;

import org.springframework.stereotype.Component;

//스프링 IOC Container에 해당 클래스가 컴포넌트임을 알리는 어노테이션
//해당 클래스를 bean으로 컨테이너에 등록하게 된다 
@Component("tool")
public class Spade implements Tool {
	@Override
	public void work() {
		System.out.println("삽 도구로 일하다");
	}
}
