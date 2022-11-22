package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;


public class SquareController {
	
	private Shape s = new Shape();
	
	
	
	public double calcPerimeter(double height, double width) {
		s = new Shape(4, height, width); //모양타입 변호와 받은 매개변수를 매개변수 있는 생성자로 초기화 시킨 것
		return height*2+width*2;
	}
	
	
	
	public double calcArea(double height, double width) {
		s = new Shape(4, height, width);
		return height*width;
	}
	
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "사각형" + s.information();
	}
 }
