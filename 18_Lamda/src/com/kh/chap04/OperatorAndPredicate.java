package com.kh.chap04;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.kh.model.vo.Product;

public class OperatorAndPredicate {
	
	
	/*
	 * Operator  인터페이스 특징
	 * 1. 단순연산시 사용
	 * 2. 받아온 타입, 혹은 인자를 통해 계산을 하고 해당타입 그대로 반환
	 * 
	 * Predicate 인터페이스의 특징
	 * 1. 매개변수로 넘어온 값을 "검증"할때 사용
	 * 2. 받아온 타입을 확인학 boolean값을 반환
	 *  
	 */
	public static void main(String[] args) {
		
		// Predicat<T> : T형을 인자로 받아서 true/false값을 리턴
		// Product클래스를 인자로 받아서 재고가 있다면 true, 없으면 false 반환
		
		Predicate<Product> checkStock = product -> product.getStock() > 0;
		
		
		 ArrayList<Product> pList = new ArrayList<>();
		 pList.add(new Product("갤럭시 z플립4", 1350000, 55));
		 pList.add(new Product("갤럭시 z플립3", 1300000, 50));
		 pList.add(new Product("갤럭시 z폴드4", 120000, 55));
		 pList.add(new Product("갤럭시 z폴드", 1100000, 0));
		 pList.add(new Product("아이폰 14", 1450000, 0));
		 pList.add(new Product("아이폰 13", 1150000, 25));
		
		 
		 for(Product p : pList ) {
			 if(checkStock.test(p)) { //재고가 0개보다 많다.
				 System.out.println(p.getpName()+"상품은 현재 재고가 있습니다.");
				 
			 }else { //재고가 0개이거나 더 적다.
				 System.out.println(p.getpName()+"상품은 현재 재고가 없습니다.");
			 }
		 }

	}

}
