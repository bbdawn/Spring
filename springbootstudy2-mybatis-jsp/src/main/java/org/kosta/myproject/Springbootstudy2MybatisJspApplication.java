package org.kosta.myproject;// @SpringBootApplication 이 있는 클래스의 패키지가 component scan의 base package가 됨 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // bean 생성 관리 및 자동설정을 지원 ( IOC DI AOP MVC DBCP MyBatis JUnit Security 등 설정 )
public class Springbootstudy2MybatisJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springbootstudy2MybatisJspApplication.class, args);
	}

}
