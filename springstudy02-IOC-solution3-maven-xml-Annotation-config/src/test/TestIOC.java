package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(ctx.getBean("tool"));
		ctx.close();
	}
}
