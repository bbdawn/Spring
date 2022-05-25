package org.kosta.myproject.model;

public class Hammer implements Tool{
	@Override
	public void work() {
		System.out.println("망치 도구로 일하다");
	}
}
