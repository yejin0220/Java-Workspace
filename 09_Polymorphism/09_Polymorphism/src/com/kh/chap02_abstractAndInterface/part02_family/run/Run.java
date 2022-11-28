package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.*;

public class Run {

	public static void main(String[] args) {
		 
		//인터페이스 적용 전.
		//Person p = new Person(); => 미완성된 추상화 클래스는 객체 생성 불가
//		Person p1 = new Mother("김엄마",74,60,"출산");
//		Person p2 = new Baby("김애기",3.5,60);
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		p1.eat();	 //엄마의 몸무게 +10, 엄마의 건강도 -10 => 84,  50
// 		p2.eat();	 //아기의 몸무게 +3,  아기의 건강도 +1  => 6.5, 61	
//		p1.sleep();	 //엄마의 건강도 +10 => 84,  60
//		p2.sleep();	 //아기의 건강도 +3  => 6.5, 64
//		
//		
//		System.out.println("==== 다음날 ====");
//		System.out.println(p1);
//		System.out.println(p2);
		
		
		//인터페이스 적용 후
		//Basic b1 = new Basic(); => 객체 생성 불가
		Basic b1= new Mother("김엄마",74,60,"출산"); //basic 참조형 변수 안에 mother객체 들어감
		Basic b2 = new Baby("김애기",3.5,60);
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.eat();
		b2.eat();
		b1.sleep();
		b2.sleep();
		
		System.out.println("===== 다음날 =====");
		System.out.println(b1);
		System.out.println(b2);
		
		
		
		
		/*
		 * 클래스에서 클래스를 상속 받을때 : extends 클래스(단일상속만 가능) : 클래스 다이어그램 => 화살표 실선
		 * 클래스에서 인터페이스를 구현할때 : implements 인터페이스, 인터페이스(다중구현) : 클래스 다이어그램 => 화살표 점선
		 * 인터페이스에서 인터페이스 상속  : extends  인터페이스, 인터페이스(다중상속가능) : 클래스 다이어그램 => 화살표 실선
		 * 
		 * 
		 *           |추상클래스                            |인터페이스
		 * =================================================================================
		 * 상속개수      | 단일상속						     | 다중상속
		 * ---------------------------------------------------------------------------------
		 * 키워드		   | extends 						 | implements
		 * ---------------------------------------------------------------------------------
		 * 추상메소드     | 추상메소드 0개 이상					 | 모든 메소드가 추상메소드
		 * 표현법/갯수    | 명시적  abstract 기술해야함			 | 묵시적으로 abstract기술(생략 가능)
		 * ---------------------------------------------------------------------------------
		 * 일반메소드 여부 | O								 | X
		 * ---------------------------------------------------------------------------------
		 * 필드		   | 일반필드 가질 수 있음 				 | 상수필드만 가질 수 있음(묵시적 public abstract final)
		 * 
		 * 
		 * 배운순서
		 * extends 일반클래스 -> extends 추상클래스 -> implements 인터페이스
		 * ---------------------------------------------------------->
		 * 					뒤로 갈 수록 강제성이 더 짙어짐.
		 * 
		 * 
		 * 
		 * 
		 */
		
	}

}
