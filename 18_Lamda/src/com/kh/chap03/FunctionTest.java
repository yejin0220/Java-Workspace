package com.kh.chap03;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import com.kh.model.vo.Product;

public class FunctionTest {
	/*
	 * Function 인터페이스의 특징
	 * 1. 타입변환
	 * ex) 컬렉션에서 특정값만 뽑거나, 연산할 떄 사용됨
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		Product p = new Product("갤럭시 z플립 4", 1350000, 1000);
		
		//1. Function<T, R> : T형을 인자로 받아서 U형값을 리턴.
		//product객체에서 가격에 대한 정보만 쏙 빼기
		Function<Product, Integer> function; //가격에 대한정보만 빼오려면 정수형으로 받아와야함
		function = (product) -> {
			return product.getPrice();
		};
		 System.out.println(function.apply(p));
		 
		 
		 //2. BiFunction<T, U, R> : T,U값 두개를 인자로 받고 R을 리턴
		 BiFunction<Integer, Integer, Double> bifunction; //클래스가 들어가야하기 때문에 기본 자료형은 안됨
		 bifunction = (num1, num2) -> {
			return num1*(double)num2; 
		 };
		 
		 System.out.println("z플립 1000대의 가격은 = "+bifunction.apply(p.getPrice(), p.getStock())); 
		 
		 //그외
		 //3)****Function<T> : ****를 인자로 받아서 T형을 리턴
		 //4)****toYYYYFunction : ****를 받아서 YYYY를 리턴
		 //5)to****Function<T> : T를 받아서 ****를 리턴
		 //6)to****BiFunction<T,U> : T,U 인자를 받아서 ***를 리턴
		 
		 
		 //객체 배열을 통한 람다식 실습
		 //1)핸드폰 객체배열 만들기
		 ArrayList<Product> pList = new ArrayList<>();
		 pList.add(new Product("갤럭시 z플립4", 1350000, 55));
		 pList.add(new Product("갤럭시 z플립3", 1300000, 50));
		 pList.add(new Product("갤럭시 z폴드4", 120000, 55));
		 pList.add(new Product("갤럭시 z폴드", 1100000, 40));
		 pList.add(new Product("아이폰 14", 1450000, 30));
		 pList.add(new Product("아이폰 13", 1150000, 25));
		 
		 //2)해당상품들을 모두 팔게되면 남는 이윤을 계산할 수 있는 람다식 생성.
		 //  이윤계샨 => (Product.가격*Product.재고)
		 //  매개변수로 Product를 인자로 받아야함. 그리고 결과값은 int자료형으로 반환해야함
		 ToIntFunction<Product> toIntFunction;
		 toIntFunction = (product) -> {
			 return product.getPrice()*product.getStock();
			 
		 };
		 
		 //4)일반메소드 호출
		 printProduct(pList, toIntFunction);
		 
		 
	}
	
	
		//3) 생선한 람다식 함수를 활용한 객체배열 관리용 일반메서드 생성하기.
		public static void printProduct(ArrayList<Product> pList, ToIntFunction<Product> toInFunction) {
			
			for(Product p : pList)
			System.out.printf("%s상품의 현재 가격은 %d원 이며, 모두 판매했을때 이윤은 %d입니다.", p.getpName(),p.getPrice(), );
		}
	

}
