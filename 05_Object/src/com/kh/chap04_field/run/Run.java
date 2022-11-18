package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
//		FieldTest1 f1 = new FieldTest1(); //객체 생성시 global 전역 변수가 할당
//		
//		f1.test(109); // test메소드 호출시 num, local 변수 할당
//					  // test메소드 종료시 num, local 변수 소멸
//		
//		f1=null; //객체 소멸시 global 멤버변수 출력
		
		FieldTest2 f2 = new FieldTest2();
		
		//public -> 어디서든 직접접근 가능
//		System.out.println(f2.pub);
		
//		//protected => 같은 패키지에서는 직접접근 가능 하지만 다른 패키지 에서는 직접접근 불가능.
//		//같은 패키지 : protected String pro = "protected 가 입력되어있는 model.vo 패키지
//		System.out.println(f2.pub); 
//		-> 값이 나오지 않음
//		
//		//default => 같은 패키지 에서만 직접접근이 가능
//		//같은 패키지 : String df = "default"; 가 입력되어있는 model.vo 패키지
//		System.out.println(f2.df);
//		-> 실행조차 안됨
		
//		//같은 패키지 : private String pri = "private"; 가 입력되어 있는 model.vo 패키지
//		System.out.println(f2.pri);
//		//-> 실행 조차 안됨
	
		
//		System.out.println(FieldTest2.sta); //객체를 생성하지 않았지만 static을 사용했기 때문에 클래스와 저장된 변수 입력.
		
		System.out.println(Math.PI);
		
		FieldTest3.num = 500; //처음 값은 100이였지만, 500으로 변경된 후 출력
		System.out.println(FieldTest3.num); 
		
		//상수필드 출력
		System.out.println(FieldTest3.NUM);
//		FieldTest3.NUM = 99;  -> 에러 : 값 변경 불가.
		
		
		
		
		
	}

}
