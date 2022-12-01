package com.kh.example.practice3.model.vo;

public class Circle {
	
	//필드부
	private double PI=3.14; 
	private int radius = 1; 

	{//초기화 블럭
		
		
	}
	
	
	//생성자부
	public Circle() {
		
		
		
	}
	
		
	public void setRadius(int Radius) { //int Radius : 내가 변경하고자 하는 매개변수를 불러와야함 -> 1씩 증가시키고 싶음.
		this.radius=radius;
	}
	
	
	public int getRadius() {
		return radius;
	}
	
	
	public void  incrementRadius() { //반지름을 1증가하는 역할을 하는 메소드
		radius+=1; //반지금을 1씩 증가해라
		getAreaOfCircle();
		
		getSizeOfCircle();
	}
	
	//원의 둘레 : 2*반지릅*원주율
	public void getAreaOfCircle() {
		System.out.println(2*PI*radius);
	}
	
	//원의 넓이 : 반지릅*반지릅*원주율
	public void getSizeOfCircle() {
		System.out.println(PI*radius*radius);
	}
	
	
	
	
}
