package test;

import model.Spade;

public class TestWorker {
	public static void main(String[] args) {
		/*
		 	Hammer.java, TestWorker.java
		 	기존의 일반적인 제어방식은 아래와 같다
		 	사용하는 측에서 Hammer 컴포넌트를 사용하기 위해서는
		 	사용하는 측에서 객체를 생성하고 work를 호출.
		 	
		 	도구를 Hammer에서 Spade으로 변경해야할 필요가 있다면
		 	아래와 같이 Spade 컴포넌트 생성을 위해 코드를 수정해 work를 호출햐아한다. 
		 	결합도가 높음!!
		 	
		 	실제 어플리케이션을 생각해보면 개별 컨트롤러 50개가 Hammer라는 tool을 이용하고 있는데
		 	Spade로 tool을 변경해야한다면 아래 기존 제어방식, 필요로 하는 요소를 직접 생성하는 방식으로는 
		 	50개의 컨트롤러가 모두 함께 변경해야 되는 구조
		 	-> 결합도가 높은 상태. 
		 	
		 	--> tool (bean or instance or component .. ) 이 변경되어도 사용하는 측에서 별도의 변화가
		 		필요 없는 결합도가 낮은 상태로 만들기 위해서는 IOC(or DI, DL)가 필요하다. 
		 		
		 	 
		 	 
		 	 
		 */
		//Hammer tool=new Hammer();
		Spade tool=new Spade();
		tool.work();
	}
}
