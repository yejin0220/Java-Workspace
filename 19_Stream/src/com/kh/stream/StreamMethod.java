package com.kh.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMethod {

	public static void main(String[] args) {

		//stream에서 원하는 값을 얻어내기 위한 메소드들
		
		//1)filter : 조건에 맞는 값만 추려주는메소드
		String [] foods = {"마라탕", "마라탕","김치찜","김치찜","삼겹살","피자","김밥","짜장면"};
		
		//음식이름이 "마"로 시작하는 음식만 추리기
		Arrays.stream(foods)
		.filter(food -> food.charAt(0) == '마') //food에 마로 시작하는 음식만 넣어주기
		.forEach(System.out ::println);
		
		System.out.println("======================중복값 제거==========================");
		
		//2)distinct () : 중복값을 제거해주는 메소드
		List<String> arr =Arrays.asList(foods); //컬렉션 만들기
		
		arr.stream()
		.distinct()
		.filter(food -> food.charAt(0)=='마')
		.forEach(System.out :: println);
		
		
		//3)map관련 메소드들
		//3_1) map**** : 현재 요소를 ***로 대체하여 스트림 반환
		System.out.println("=====================맵관련==============================");
		arr.stream()
		   .map( food -> {
			   if(food.equals("피자")) {
				   return food+"맛없다.";
			   }else {
				   return food+"맛있다.";
			   }
		   })
		   .forEach(System.out :: println);
		
		
		//3_2) flatMap*** : 특정요소가 여러개의 요소로 대체되는 스트림 반환
		List<String> arr2 = Arrays.asList("마라탕 훠궈 양꼬치 김밥");//["마라탕 훠거 양꼬치 김밥]
		
		//스페이스바 기준으로 각각의 요리를 String 요소로 만들기
		arr2.stream()
			.flatMap(food -> Arrays.stream(food.split(" ")))
			.forEach(System.out :: println);	
		
		//3_3) as***Stream() , boxed : 형변환 관련 메소드
		int [] iArr = {1, 3,5,7,9};
		
		//double로 형변환하여 출력
		Arrays.stream(iArr)
			.asDoubleStream()
			.forEach(System.out :: println);
		
		
		
		Arrays.stream(iArr)
			.boxed()
			.forEach(i -> System.out.println(i.hashCode()+" ")); //i는 int가아니라 integer를 나타냄
		
		
		//4)sorted() : 정렬
		
		//5)루프메서드
		//5_1) forEach : 최종처리 스트림  -> 마지막에 호출해야 정상적으로 작동 함
		//5_2) peek    : 중간처리 메서드  ->  중간에 호출해야 정상적으로 작동 함
		
		System.out.println("=====================peek======================");
		arr.stream()
			.distinct()
			.filter( food -> food.length() == 3 ) //결과값이 3글자인 값만 남기겠다
			.peek(food->System.out.println("남아있는 음식은 ?" +food))
			.forEachOrdered(System.out :: println);
			
		/*
		 * 6) 집계함수들
		 *    스트림의 마지막에 사용한다.
		 *    count() : 갯수 반환
		 *    sum() : 합계 반환.
		 *    max() : 최대값 반환
		 *    min() : 최소값 반환
		 *    
		 *    
		 * 7) 그외
		 * 	  findFirst() : 스트림의 첫번째 요소 반환
		 * 	  findAny() : 스트림에 값이 있다면 아무값이나 반환
		 * 	  orElse(대체값) : 값이 저장되어있지 않다면 대체값 설정가능
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
