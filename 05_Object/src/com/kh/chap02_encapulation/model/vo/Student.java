package com.kh.chap02_encapulation.model.vo;

public class Student {
	//필드부
	/*
	 * 필드 == 멤버변수 == 인스턴스 변수
	 * 
	 * 
	 * 접근제한자[예약어] 자료형 필드명;
	 *  
	 * 
	 */
	
	private String name;
	private int age;
	private double height;
	
	//생성자부
	
	//메소드부
	/*
	 * 각 기증을 구현하는 부분
	 * 
	 * 접근제한자 반환형 메소드([매개변수]) {
	 *			//기능구현
	 * 
	 */
	
	//setter -> set*** ec)setname ->  name필드에 대입시킬 값을 셋함.
	//해당 필드에 대입하고자 하는 값을 전달받아 해당필드에 대입시켜주는 기능의 메소드
	//이때, 이 메소드는 접근 가능하도록 해야하기 때문에 public 접근제한자를 사용한다.
	
	//이름 값을 기록 및 수정할 수 있는 기능의 메소드(name 필드에 값을 넣기 위한 용도)
	//대부분의 set메소드는, set+필드명 으로 작성하는 것이 규칙
	//단, 두 단어가 이어질때 카멀케이스(낙타등표기법)을 활용하여 메서드명 선언
	
	public void setName(String name) { 
		//매개변수 : 해당 메소드 호출 시 전달되는 값을 받아주기 위한 변수
		
		//name = name;//얻어온 name값을 name필드에 그대로 대임
		//매개변수 name = 매개변수 name을 대입하는 형식임.
		//왜 ? 필드명과 매개변수명이 동일한 경우{}영역 내에서는 해당 영역에서 만들어진 변수가 좀 더 우선순위가 높음.
		//객채의 name에 접근하려면 this를 사용해야한다.
		//this에는 생성된 객체의 "주소값"이 담겨 있음
		this.name = name; 
	}
	
	//나이값을 기록 및 수정할 수 있는 기능의 메소드(age필드에 값을 대입하기 위한 용도)
	public void setAge(int age) {
		this.age=age;
	}
	
	
	//키값을 기록 및 수정할 수 있는 기능의 메소드(height필드에 값을 대입하기 위한 용도)
	public void setHeight(double height) {
		this.height=height;
	}
	
	//데이터를 반환해주는 기능의 메소드 : getter 메소드
	//name필드에 담긴 값을 돌려주는 용도의 메소드
	// getter+필드명(카멀케이스)적용
	
	public String getName() {   //매개변수없음 : 이미 저장되어있는 값을 꺼내주기 위한 메소드 이기 때문에
		//public void getName => 반환하는 값이 없을 경우에 사용
		//public String getName => 반환하는 값이 있을 경우 사용
		
		
		return name;  //return 반환값 => 반환값을 나를 호출한 메서드의 위치에 전달하겠다.,반드시 작성해줘야 함.
				  
		
	}
	
	
	//age필드에 담긴 값을 돌려주는 메소드
	public int getAge( ) {
		return age;
		
	}
	
	//height필드에 담긴 값을 돌려주는 메소드
	public double getHeight(){
		return height;
	}
	
	
	//모든 필드값을 하나의 문자열로 합쳐서 돌려주는 용도의 메소드
	public String information() {
		//000님의 나이는 00살이고 키는 000입니다.
		return name+"님의 나이는"+age+"살이고 키는"+height+"입니다.";
	}
	
}
