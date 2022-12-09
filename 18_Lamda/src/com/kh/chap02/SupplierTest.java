package com.kh.chap02;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

import com.kh.model.vo.Product;

public class SupplierTest {

	/*
	 * Supplier 인터페이스 특징
	 * 1. 주로 생산자 역할을 띈 함수를 작성할때 사용
	 * 2. 매개변수가 없음, 리턴값은 있음
	 * 3. 내부적으로 get***()메서드 존재
	 *  
	 */
	
	//1)Supplier<T> : T형을 반환 /T에는 클래스라면 다 들어갈 수 있음
	static Supplier<Product> Supplier = () -> {return new Product("아이폰 14", 1400000, 100);};
	//static Supplier<Product> Supplier = () ->  new Product("아이폰 14", 1400000, 100); => 문제없음
	
	
	//2)****Supplier : ***형 반환
	static BooleanSupplier isTrue = () -> false;
	
	
	
	
	public static void main(String[] args ) {
		System.out.println(Supplier.get());
		System.out.println("z플립 사고 싶습니까?"+isTrue.getAsBoolean());
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
