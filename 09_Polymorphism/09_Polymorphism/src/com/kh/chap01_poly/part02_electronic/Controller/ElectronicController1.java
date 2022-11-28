package com.kh.chap01_poly.part02_electronic.Controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Notebook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

//다형성 적용전 클래스
public class ElectronicController1 {

	//용산전자상가에 새로 차린 가게
	private Desktop desk;
	private Notebook note;
	private Tablet tab;
	
	//현재 용산전자상가에 데스크탑을 납품하는 메서드
	public void insert(Desktop d) { //=> run클르스에서 사용자에게 입력한 값을 desk객체생성해서 값을 넘겨주게 됨
	  
		//desk = new Desktop("삼성","데스크탑",900000,"Geforce 1070");
		desk =d;
	}
	
	//노트북을 납품하는 메서드
	public void insert(Notebook n) {
		note=n;
	}
	
	//테블릿을 납품하는 메서드
	public void intsert(Tablet t) {
		tab=t;
	}
	
	
	public Desktop selectDsktop() {
		return desk;
	
	}
	
	public Notebook selectNotebook() {
		return note;
	}
	
	public Tablet selectTabel() {
		return tab;
	}
	
	
	
	
	
}
