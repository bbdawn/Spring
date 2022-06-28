package test;

import java.sql.SQLException;

import org.kosta.myproject.model.MemberService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		MemberService service=(MemberService)ctx.getBean("memberServiceImpl");
		try {
			System.out.println(service.findMemberById("java"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ctx.close();
	}
}
