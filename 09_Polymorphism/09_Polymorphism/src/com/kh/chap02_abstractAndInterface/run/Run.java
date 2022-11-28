package com.kh.chap02_abstractAndInterface.run;

import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		
		//Sports s = new Sports(); => Sports 클래스 같은 경우 채워넣을 수 없는 빈공간이 존재하기 때문에 객체생성이 불가
		//추상클래스로 객체생성 절대 불가
		//=> 미완성된 클래스이기 때문.
		
		Sports s;//단, 객체 생성만 불가할 뿐, 레퍼런스 변수로는 사용가능
		//Sports 클래스는 Football클래스의 부모
		s = new Football();//즉, 다형성을 적용해서 자식객체를 받아주는 용도로는 사용가능
		
		Sports[] arr = new Sports[2];
		arr[0] = new Football();
		arr[1] = new Basketball() ;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i].rule(); //만약 rule을 호출하고자 한다면 호출전에는 abstract rule로 이동하지만 호출시 자식 클래스에 재정의된 rule이 호출됨(자식클래스에 rule이라는 추상메서드가 포함되어 있다는 가정하에)
		}
		
		/*
		 * 추상클래스
		 * - 미완성된 클래스 abstract Class
		 * - 객체생성 불가.(단, 레퍼런스 변수로는 선언가능)
		 * - 추상메소드가 존재하는 순간 반드시 추상 클래스로 정의
		 * 	(일반필드 + 일반메소드 + [ 추상메소드(생략가능)])
		 * 
		 * 
		 * 
		 *  단, 추상메소드가 굳이 없어도 추상 클래스로 둘 수 있긴 함
		 *  언제? => 클래스가 아직 구체적으로덜 구현된 상태인것으로 보이는 경우(개념적)
		 *  	 => 현재 이 클래스를 객체 생성이 불가하게끔 하고자 할때(개술적)
		 * 
		 *  
		 *  
		 *  - 객체생성불가
		 *  단, 레퍼런스 변수로는 사용가능(다형성 적용 가능)
		 *  
		 *  
		 *  
		 *  
		 *  추상메소드
		 *  -미완성된 메소드록 몸통부 {}가 구현되어 있지 않은 메소드
		 *  -자식클래스에서 오버라이딩을 통해 완성됨(강제로 오버라이딩 해야함)
		 *   	=> 오버라이딩 하지 않은 경우 에러 발생
		 *   	=> 메소드 사용의 통일성 확보 목적
		 *   	=> 표준화된 틀을 제공할 목적
		 * 
		 * 
		 * 
		 */
		
	}

}
