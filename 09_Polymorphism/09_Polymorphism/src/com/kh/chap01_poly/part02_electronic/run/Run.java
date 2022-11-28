package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.Controller.ElectronicController1;
import com.kh.chap01_poly.part02_electronic.Controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.*;

public class Run {
	//납품업체
	public static void main(String[] args) {
	
		
		//1. 메소드의 매개변수의 다형성(부모타입레퍼런스로 자식객체를 받아줌)을 적용시키기 전.
		
//		
//		ElectronicController1 ec = new ElectronicController1();
//		//생성과 동시에 이 클래스의 필드값(desk, note, tab)들이 메모리 영역에 null 값으로 추가됨.
//		
//		//Desktop d = new Desktop("삼성", "데탑", 800000, "Gforce 1070");
//		ec.insert(new Desktop("삼성", "데탑", 800000, "Gforce 1070"));
//		ec.insert(new Notebook("엘지", "그램", 1500000, 4));
//		ec.intsert(new Tablet("애플","아이패드",600000, true));
//		
//		
//		Desktop d = ec.selectDsktop();
//		Notebook n = ec.selectNotebook();
//		Tablet t =ec.selectTabel();
//		
//
//		System.out.println(d);
//		System.out.println(n);
//		System.out.println(t);
		
		
		
		
		//2. 다형성을 적용한 후.
		ElectronicController2 ec = new ElectronicController2();
		
		ec.insert(new Desktop("삼성","데탑",990000,"Gforce 1070"), 0);
		ec.insert(new Notebook("엘지","그램",2000000,4), 1);
		ec.insert(new Tablet("애플","아이패드",500000,true), 2);
		
//		for(int i = 0; i <3;i++) {
//			System.out.println(ec.select(i));
//		}
		
		Electronic[] elec  = ec.select();
		for(int i =0; i<elec.length; i++) {
			System.out.println(elec[i]);
		}
		
		
		/*
		 *다형성을 사용하는 이유
		 * 1. 부모타입의 객체배열로 다양한 자식들을 받아줄 수 있음
		 *	   => 부모타입 하나만으로 다양하 자식객체들을 다룰 수 있음
		 *
		 * 2. 메소드의 매개변수나 반환형에 다형성을 적용하게 되면 메소드 갯수가 확 줄어든다.
		 * 
		 * 
		 * 
		 * 
		 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	

}
