package com.kh.chap06_method.controller;

public class MethodTest1 {

	/*
	 * 메소드
	 * 
	 * [표현법]
	 * 접근제한자 예약어(생략가능) 반환할값의자료형 메소드명([매개변수]) {
	 * 			수행할 코드
	 * 
	 * 			return 반환할 값;(반환형이 void인 경우 생략 가능)
	 * }
	 * 
	 * 메소드를 정의한 후 항상 원하는만큼 호출해서 사용할 수 있음.
	 * 
	 * 
	 */
	
	//1. 매개변수가 없고 반환값도 없는 메소드
	public void method1() {
		System.out.println("매개변수와, 반환값이 둘 다 없는 메서드 입니다.");
		
		//void의 경우 return문이 있어도 되고 없어도 됨 -> JVM이 void의 경우 return문을 자동으로 생성해주기 때문에.
		
	}
	
	
	
	//2. 매개변수가 없고, 반환값은 있는 메소드.
	public int method2() {
		System.out.println("매개변수가 없고, 반환값은 있는 메서드 입니다.");
		
		//1부터 100까지의 랜덤값 발생 시키고, 돌려주는 메소드
//		int random =(int)(Math.random()*100+1);
//		
//		return random; //반환값이 있을 경우 반드시 return문을 통해 값을 넣어줘야 함.
		
		return  (int)(Math.random()*100+1);
	}
	
	
	
	//3. 매개변수가 있고, 반환값이 없는 메소드
	public void method3(int num1, int num2) {
		System.out.println("매개변수가 있고, 반환값은 없는 메서드 입니다.");
		
		//num1과 num2의 값을 비교하여 결과를 출력하는 메서드
		//최소값 : 00 / 최대값  : 00
		
		int min = 0; //두 수중에 작은 값을 보관
		int max = 0; //두 수중에 큰   값을 보관
		
		if(num1>num2) {
			min = num2;
			max = num1;
		}else {
			min = num1;
			max = num2;
		}
		System.out.println("최소값 : "+min);
		System.out.println("최대값 : "+max);
		
	}
	
	
	
	//4.매개변수가 있고, 반환값도 있는 메소드.
	public int method4(int a , int b) {
		System.out.println("매개변수 있습니다, 반환값도 있습니다.");
		
		//a와 b를 곱한 결과값을 돌려주는
		
		return(a*b); //return문 뒤에는 변수뿐만 아니라 산술연산도 가능함
		
		
		
		
		
		
		
	}
}
