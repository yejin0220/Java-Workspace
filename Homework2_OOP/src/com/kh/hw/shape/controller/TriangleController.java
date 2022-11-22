package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	
	private Shape s = new Shape();
	
	public double calcAter(double height, double width) {
		s= new Shape(3, height, width); //모양타입 변호와 받은 매개변수를 매개변수 있는 생성자로 초기화 시킨 것
		return height*width/2;
	}

	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String pritnt() {
		return "삼각형" + s.information();
	}
	
	

}
