package com.kh.chap_math.run;

public class MathRun {

	public static void main(String[] args) {
		//int num = 3.14;
		//메소드명(매개변수) : 반환형
		//올림 => 
		
		
		
		
		
		//반올림 => Math.round(double) : 반환값이 long형
		
		
		
		//버림 = > Math.floor(double) : 반환값이 double형
		//System.out.println("버림 : "+Math.floor(num1));
		
		
		//가장 가까운 정수값을 알아낸 후 실수형 반환 : rint
		//System.out.println("가장 가까운 정수값 : "+Math.rint(num1));
		
		
		//절대갑 => MAth.abs(int/double/long/float) : 반환값 : 매개변수 그대로
		int num2 = 10;
		System.out.println("절대값 : "+Math.abs(num2));
		
		//최소값 => Math.min(int, int) : 반환값 int
		System.out.println("최소값 : "+Math.min(5, 10));
		
		
		//최대값 => Math.max(int, int) : 반환값 int
		System.out.println("최대값 : "+Math.max(5, 10));
		
		//재접근(루트) => Math.sqrt(double) : 반환값 double
		System.out.println("8의 제곱근: "+Math.sqrt(8));
		
		//제곱 =>
		
		/*
		 *  Javq.lang.Math 클래스의 특깅
		 *  - 모든 필드 => 상수필드
		 *  - 모든 메서드 => static 메소드
		 *  
		 *  모든게 다 static이기 때문에 Math.필드 혹은 Math.메서드명 으로 다 접근가능(객체 생성할 필요가 없음)
		 *  Math 클래스의 생성자가 private이다.(객체생성 불가)
		 * 
		 * 
		 */

		
	}

}
