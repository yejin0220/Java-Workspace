package com.kh.chap03_clss.run;

import com.kh.chap03_clss.mode.vo.*;

public class Run {

	public static void main(String[] args) {
		
		Product p1 = new Product(); //heap영역에 product변수 생성
		p1.setpName("아이폰14");
		p1.setPrice(1400000);
		p1.setBrand("애플"); //=> brand에 "애플"로 값이 이미 초기화 되어 있어서, brand명 지정시 애플 상품이라면 초기화하지 않아도 됨.
		
		System.out.println(p1.information());
		
		Product p2 = new Product();
		p2.setpName("갤럭시 z플립4");
		p2.setPrice(1350000);
		p2.setBrand("삼성");
		
		System.out.println(p2.information());
		
		Member m1 = new Member();
		m1.changName("김예진");
		m1.printName();
	}

}
