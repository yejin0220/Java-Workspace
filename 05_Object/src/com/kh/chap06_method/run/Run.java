package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.*;

public class Run {

	public static void main(String[] args) {
		
		MethodTest1 mt1 = new MethodTest1();
		mt1.method1();
		System.out.println("랜덤값" +mt1.method2()); //현재 MethodTest1에 랜덤값을 반환할 변수가 없으므로 run클래스에 바로 출력문 입력.
		
		mt1.method3(60,15); //현재MethodTest1에 매개변수 2개가 선언되어 있기때문에 실행하고자 하는 값을 각각 하나씩 넣어주면 됨
							//만약 선언되어 있는 매개변수보다 많은 값을 입력할 경우 에러가 남. 반드시 선언된 매개변수 만큼! 값 넣어주기
		
		System.out.println(mt1.method4(42, 5));
	
	
		
		
		System.out.println("=========================================================================================");
		
		MethodTest2.method1(); 
		//=> static키워드가 붙은 메소드만 이렇게 호출 할 수 있음.
		//static메소드의 경우 new문으로 객체를 생성할 필요가 없음
		//static이 붙은 클래스와 마찬가지로, 메소드 또한 프로그램 실행시 정적 메모리 영역에 저장되기 때문
		
		System.out.println(MethodTest2.method2());
		
		MethodTest2.method3("김예진", 28);
		
		System.out.println(MethodTest2.method4(100));
		
	}
	
}
