package com.kh.chap04_field.model.vo;

public class FieldTest2 {
	/*
	 * (+) public  -> 어디서든(같은 패키지, 다른 패키지 모두) 접근이 가능
	 * 
	 * (#) protected -> 같은 패키지면 무조건 접근 가능, 다른 패키지라면 "상속"구조인 클래스에서만 접근 가능하다.
	 * 
	 * (~) defaul -> 접근 제한자를 안붙였을때 사용 // 오로지 같은 패키지 안에서만 접근 가능, 생략시
	 * 
	 * (-) private -> 오직 해당 클래스에서만 접근 가능 //setter/getter를 사용해 사용자별로 권한을 부여하고 값을 불러왔음.
	 * 
	 * 
	 * 위에서 부터 아래로 내려갈 수록 접근할 수 있는 범위가 좁아진다.
	 * + , #, ~, - : 클래스 다이어그램 표기법.
	 */

	
	public String pub ="public";
	protected String pro = "protected";
			  String df = "default";
	private String pri = "private";		  
	
	public static String sta = "FieldTest2"; //static을 사용하게 되면 객체를 생성하지 않고 써야함.
	
	
	
	
	
}
