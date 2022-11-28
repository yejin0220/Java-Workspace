package com.kh.chap01_poly.part02_electronic.Controller;

import com.kh.chap01_poly.part02_electronic.model.vo.*;

//다형성 적용시켰을때(부모타입으로 자식객체 받아줌)
public class ElectronicController2 {
	
	private Electronic[] elec = new Electronic[3];
	
	//insert를 통해 제품 납품
	// Electornic any : 데스크탑, 노트북, 태블릿을 담을 수 있는 다형성이 적용된 매개변수
	// int index 	  : elec배열의 index위치에 any변수를 넣기 위한 매개변수
	public void insert(Electronic any, int index) {//익게트로닉 어느 위치에 어던 제품ㅇ을 추가하냐?
		
		elec[index] = any;
		
	}
	
	public Electronic select(int index) { //어느위치에 있는 제품 선택?
	
		return elec[index];
	}
	
	
	public Electronic[] select() {
		return elec;
	}
	

}
