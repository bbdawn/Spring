package test;

import org.kosta.myproject.config.AppConfig;
import org.kosta.myproject.model.Tool;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestIOC {
	public static void main(String[] args) {
		//자바 기반 설정 클래스를 로딩 
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(ctx.getBean("tool"));
		System.out.println(ctx.getBean("tool"));
		System.out.println(ctx.getBean("tool"));
		Tool tool=(Tool)ctx.getBean("tool");
		tool.work();
		System.out.println(ctx.getBean("tool2"));
		ctx.close();
	}
}
