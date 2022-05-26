package org.kosta.myproject.config;

import org.kosta.myproject.model.Hammer;
import org.kosta.myproject.model.Spade;
import org.kosta.myproject.model.Tool;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //spring 설정 클래스임을 Spring IOC Container에 알리는 어노테이션
public class AppConfig {
	@Bean //tool 메서드 명이 bean id가 되어 IOC 컨테이너에 bean으로 등록된다. 
	Tool tool() {
		return new Spade();
	}
	
	//Bean 어노테이션 테스트
	@Bean //tool2 bean id로 IOC Container에 Hammer객체가 등록
	Tool tool2() {
		return new Hammer();
	}
	
	
}
