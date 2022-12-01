package com.kh.example.practice6.snak.controller;

import com.kh.example.practice6.snak.model.vo.Snak;

public class SnakController {
	
	Snak s = new Snak(); //snak이라는 s객체를 생성했음
	
	public SnakController()	{
		
		
	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장완료되었습니다."; 
		
	}
	
	
	public String confirmData() {
		s.getKind();
		s.getName();
		s.getFlavor();
		s.getNumOf();
		s.getPrice();
		return s.information();
	}
	
	

}
