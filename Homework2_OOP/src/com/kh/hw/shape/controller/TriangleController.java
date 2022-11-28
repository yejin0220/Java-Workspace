package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	
	private Shape s = new Shape();
	
	public double calcArea(double height, double width) {
		
		s.setHeight(height);
		s.setWidth(width);
		
		return height*width;
		
	}
	
	public void paint(String color) {
		
		s.setColor(color);
	}
	
	public String print() {
		
		return "삼각형" +s.information();
		
	}

}
