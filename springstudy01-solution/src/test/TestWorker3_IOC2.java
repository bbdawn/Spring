package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Tool;

public class TestWorker3_IOC2 {
	public static void main(String[] args) {
		/*
		 	IOC 적용 예제 
		 	기존의 TestWorker1 제어방식 : 결합도가 높은 상태. 
		 	 	 						Hammer tool component가 Spade로 변경될 때 
		 	 	 						이를 사용하는 모든 프로그램이 함께 변경되어야 하는 구조 
		 	
		 	
		 	IOC 제어방식이 적용된 TestWorker2_IOC와 비교해본다.  
		 	IOC 적용단계
		 	1. 대상 컴포넌트 (의존성)를 계층구조화한다. 
		 		Tool interface를 정의, 하위 구현체로 Hammer와 Spade로 구성한다.
		 	2. Spring IOC Container가 로딩할 설정을 명시한다. (xml, annotation) 
		 	3. Spring IOC Container를 실행하여 프로그램을 구동한다. 
		 	
		 */
		//Spring IOC Container를 생성한다, 이 때 생성자에 spring 설정파일명을 등록한다 
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("ioc.xml");
		Tool tool=(Tool)ctx.getBean("tool");
		tool.work();
		ctx.close();
		
	}
}
