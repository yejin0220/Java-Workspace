package com.kh.example.practice6.rrun;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.inform();
		
		Book b2 = new Book("자바의 정석", "나무", "민경민"); //첫번째 매개변수 : title, 두번째 : publisher , 세번째 : autor
		b2.inform();                                   //=> 매개변수의 순서가 달라져도 String형태로 선언했기 때문에 출력시 아무 문제 없음.
		
		Book b3 = new Book("자바의 정석", "나무", "민경민",15000,0.0);
		b3.inform();
	}

}
