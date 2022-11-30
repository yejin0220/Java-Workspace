package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
	
		
		/*
		 * Wrapper클래스
		 * => 기본 자료형을 객체로 포장해주는 클래스들을 래퍼클래스라고 함.
		 * 
		 * 기본자료형  	<-------->   Wrapper클래스
		 * boolean					 Boolean
		 * char						 Character
		 * byte						 Byte
		 * short					 Short
		 * int						 Integer
		 * long 	 				 Long
		 * float					 Float
		 * double					 Double	
		 * 
		 * 
		 */
		
		int num1 =10;
		int num2 = 15;
		
		//일반 기본 자료형에서 객체 자료형의 메소드를 활용하고 싶을떄 =? Wrapper클래스로 변환하여 사용하면 된다.
		//자동 형변환이 일어남
		//기본자료형 => Wrapper 자료형 (Boxing) //int라는 작은 자료형의 박스를 Integer라는 큰 박스로 감싸줌
		
		Integer i1 = num1;
		Integer i2 = num2;
		
		//System.out.println(num1.equals(num2));
		System.out.println(i1.equals(i2));//false값
		System.out.println(i1.hashCode());//현재담고있는 값 그대로 출력
		System.out.println(i2.compareTo(i1)); 
		//a.compareTo(b) : a와 b를 비교해서, a가 b보다 크면 1
		// 								  a가 b보다 작으면 -1								 
		//								  a와 b가 같으면 0 	
		
		//배열.sort()
		//컬렉션.sort()
		
		
		//Wrapper 자료형 => 기본자료형(UnBoxing)
		int num3 = i1;//i1 -> integer자료형이지만 에러 나지 않음
		int num4 = i2;
		
		//기본 자료형 <==> String
		String str1 = "10"; //=> 숫자가 아닌 문자로 10 출력
		String str2 = "15.3"; //=>15.3
		
		System.out.println(str1+str2); // 10 15.3 출력
		
		//방법1. String --> 기본 자료형 : 파싱한다
		//		바꿀자료형Wrapper클래스.parse***(변환할 문자열)
		int i = Integer.parseInt(str1); //숫자 10으로 변환
		double d = Double.parseDouble(str2); //실수 15.3으로 변환
		
		System.out.println(i+d); //변환된 숫자 10과 15.3이 합해진 결과 출력
		
		
		//방법2. 기본자료형 --> String
		//		10      --> "10"
		//		15.3    --> "15.3"
		// String.valuOf(변환할 기본 자료형의 값) : String타입으로 반환
		String strI = String.valueOf(i);
		String strI2 = i+"";
		String strI3 = Integer.valueOf(i).toString();
		
		String strD = String.valueOf(d);
		 
		
	}

}
