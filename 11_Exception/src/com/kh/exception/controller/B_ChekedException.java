package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_ChekedException {

	/*
	 * ChekedException은 반드시 예외처리를 해줘야 하는 예외들
	 * (즉, 예측 불가능한 곳에서 발생하기 때문에 미리예외처리 구문을 작성해야함)
	 * => 주로 외부매체와어떤 입출력시 발생
	 * 
	 */
	
	public void method1() {
		method2();
		
		
	}
	
	
	
	public void method2() throws IOException {
		
		//Scanner와 같이 키보드로 값을 입력받을 수 이 있는 객체(단, 문자열로만 가능)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아무 문자나 입력해주세요 : ");
		//1.try~ catch문 : 여기서 바로 예외처리하기
		
//		try {
//			String str = br.readLine();
//			System.out.println("문자열의 길이 : "+str.length());
//		} catch (IOException e) {
//	
//			e.printStackTrace();
//		}
		
		
		//2. throws : 지금 현재메서드에서 예외를 처리하지 않고 이 메서드를 호출한곳(method1)으로 떠넘기겠다.
		
		String str=br.readLine();
		System.out.println("문자열의 길이 : "+str.length());
		
		
		
	}
	
	
	
	
	/*
	 * 					    	예외발생시점											예외처리
	 * RuntimeException			프로그램실행시 => 런타임에러(컴파일 에러x)					필수 아님 -> uncheked Exception(조건문 또는 예외처리 문구사용)
	 * IOExceoption	그외			프로그램실행시 => 컴파일에러								필수 => cheked Exception(반드시 예외처리로 해결)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
