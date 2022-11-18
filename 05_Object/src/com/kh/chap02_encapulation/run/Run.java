package com.kh.chap02_encapulation.run;

import com.kh.chap02_encapulation.model.vo.Student;

public class Run {

	/*
	 * 7. 캡슐화 과정을 통해 완벽한 클래스의 틀을 갖추게 하기.
	 *  *캡슐화란 ? 추상화를 통해 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법 중 하나로
	 *            클래스에서의 가장 중요한 목적인 '데이터 접근 제한'을 원칙으로 외부로 부터 '데이터의 접근을 막고'
	 *            대신에 '데이터를 간접적으로 처리'할 수 있는 메소드를 클래스 내부에 작성해서 관리하는 방식
	 *   *캡슐화를 하지 않으면 ? -> 외부로 부터 집적접근이 가능하기 때문에 함부로 갑이 변질되거나 조화를 막지 못하는 문제 발생
	 *   
	 *      1) 정보은닉 : private
	 *         필드들을 외부로부터 직접 접근을 막기 위해 public 대신에 private접근제한자 사용
	 *         ex) 학생들이 본인의 성적을 함부로 바꿀 수 없고, 다른 학생의 성적이 함부로 조회되지 않도록.
	 *         
	 *      2) setter / getter 메소드
	 *         간접적으로나마 접근해서 값을 담거나, 그 값을 가져올 수 있는 메소드가 setter/getter메소드
	 *         ex) 선생님은 학생의 성적을 기록(저장)하거나 조회할 수 있는 권한이 있음
	 *         
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Student hong = new Student();
//		hong.name = "홍길동"; //접근을 하려고해도 해당 필드명이 보이지 않아서 값을 대입할 수 없다는 오류가 생김
//		hong.age = 20;                    //The field Student.name is not visible
//		hong.height = 166.6;
		
		/*
		 * 위와 같이 대입할 경우, 직접 접근이 불가능해 짐
		 * 그러면 직접적인 접근을 막은 경우 간접적으로나마 접근할 수 있는 방법?
		 * setter / getter
		 * 
		 */
		
		//setter메소드 호출
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setHeight(168.7);
		
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getHeight());
		
		System.out.println(hong.information()); //information : 해당 객체가 가지고 있는 모든 정보를 문자열로 출력
		
		
		Student min = new Student();
		min.setName("민경민");
		min.setAge(31);
		min.setHeight(180.5);
		
		System.out.println(min.information());
		
		
	}

}
