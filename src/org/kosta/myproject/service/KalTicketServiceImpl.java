package org.kosta.myproject.service;

//별도의 이름을 명시하지 않으면 소문자로 시작하는 클래스명이 bean name이 된다. 
//@Component("ticketService")
public class KalTicketServiceImpl implements TicketService {
	@Override
	public void ticketing() {
		System.out.println("대한항공 티켓 서비스");
	}
}
