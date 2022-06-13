package org.kosta.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 *  SpringBoot 설정 클래스 
 *  @SpringBootApplication 이 명시된 클래스의 패키지 및 그 이하의 패키지의 클래스들을 대상으로 component scan이 이루어짐
 *  아래의 어노테이션 설정은 component scan과 함께 미리 정의된 bean들에 대한 자동설정 기능이 지원된다 
 *  ( Maven Dependencies -> spring-boot-autoconfigure -> META-INF -> spring.factories 에 위치 ) 
 */
@SpringBootApplication
public class Springbootstudy1MybatisJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springbootstudy1MybatisJspApplication.class, args);
	}

}
