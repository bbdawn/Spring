package test;

import org.kosta.myproject.model.LoggingDemoService;

public class TestLogger {
	public static void main(String[] args) {
		LoggingDemoService service=new LoggingDemoService();
		service.testLog();
		service.testLog2("메뉴", "김밥");
		service.testLog2("메뉴2", "피자");
	}
}
