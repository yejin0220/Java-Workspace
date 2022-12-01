package com.kh.example.practice3.model.vo;

public class Circle {
	
	private static final double PI = 3.14;
	private int radius = 1;
	
	public void Circle(){
		
	}
	
	public void setPI(double PI) {
		this.radius=radius;
	}
	
	public double getPI() {
		return radius;
	}
	
	public void incremebtRadies() {
		radius++;
		getAreaOfCircle();
		getSizeOfCircle( );
	}
	
	public void getAreaOfCircle() {
		System.out.println(PI*radius*2);
		
	}
	
	public void getSizeOfCircle( ) {
		System.out.println(PI*radius*radius);
		
		
	}
}
