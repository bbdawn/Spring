package org.kosta.myproject.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemoService {
	private Logger logger=LoggerFactory.getLogger(getClass());
	
	public void testLog() {
		// logback.xml 설정파일에 debug 레벨로 설정되어 있어서 
		// trace를 제외한 debug info warn error 로그가 실행된다 
		logger.warn("warn");
		logger.error("error");
		logger.trace("trace");
		logger.debug("debug");
		logger.info("info");		
	}
	public void testLog2(String message,String message2) {
		// SLF4J 의 {} : 변수의 데이터로 출력 -> String + 연산 피하여 성능개선 
		logger.info("info log test message1 {} message2 {}",message,message2);
	}
}







