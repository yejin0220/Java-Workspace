package com.kh.chap04_field.model.vo;


public class Test {

	public static void main(String[] args) {
		
		FieldTest2 f2 = new FieldTest2();
		//public -> 어디서든 직접접근 가능
		//System.out.println(f2.pub);
		
//		//protected => 같은 패키지에서는 직접접근 가능 하지만 다른 패키지 에서는 직접접근 불가능.
//		//같은 패키지 : protected String pro = "protected 가 입력되어있는 model.vo 패키지
		//System.out.println(f2.pro); 
//		
		//default => 같은 패키지 에서만 직접접근이 가능
//		//같은 패키지 : String df = "default"; 가 입력되어있는 model.vo 패키지
		//System.out.println(f2.df);
		
		//같은 패키지 : private String pri = "private"; 가 입력되어 있는 model.vo 패키지
		//System.out.println(f2.pri);
		
		
	}

}
