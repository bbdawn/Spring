package test;

import org.kosta.myproject.model.Tool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
	public static void main(String[] args) {
		//Spring IOC Container 생성 (생성시 spring 설정 xml을 로딩하여 tool bean 생성해 컨테이너에 저장한다.)
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Tool tool=(Tool)ctx.getBean("tool");
		System.out.println(ctx.getBean("tool"));
		System.out.println(ctx.getBean("tool"));
		System.out.println(ctx.getBean("tool"));
		//위 코드의 실행결과는 동일한 bean(instance)가 반환된다 -> IOC Container는 Singleton 방식으로 운용
		tool.work();
		ctx.close();
	}
}
