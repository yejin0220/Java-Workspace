package com.kh.practice.snak.controller;

import com.kh.practice.snak.model.vo.Snak;


public class SnakController {

	Snak s = new Snak();
	
	public SnakController() {
		
	}
	
	//매개변수로 얻어온 데이터를 setter메서드를 이용해 저장하고, 저장완료되었다는 결과를 반환하는 메소드
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setnumOf(numOf);
		s.setPrice(price);
		
		return "저장 완료되었습니다.";
	}
	
	
	//저장된 결과를 반환하는 것.
	public String confirmData() {
		return s.information();
	}
	
	
}
