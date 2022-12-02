package com.kh.chap02_String.controller;

	//String은 불변클래스(변하지 않는 클래스)
	//수정하는 순간 기존의 값이 담져있는 공간에서 수정되지 않음
public class A_StringPoolTest {


	//생성자를 통해 문자열 담기
	public void method1() {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2);
		//str1과 str2의 주소값이 동등비교 연산이되어 false값이 나옴
		
		System.out.println(str1);
		System.out.println(str2);
		//문자열 값만 출력됨
		
		//String 클래스의 toString()메소드의 경우 실제 담겨있는 문자열을 반환하도록 오버라이딩이 되어있음.
		
		System.out.println(str1.equals(str2));
		//str1과 str2의 문자열이 동등비교 연산이 되어 true값이 나옴
		//String클래스의 equals메소드의 경우 주소값 비교가 아닌 문자열을 비교하도록 오버라이딩 되어 있음.
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//해시코드는 오브젝트에 있을때 10진수로 변경해주는 것
		//=> String클래스에서 해시코드는 실제담긴 "문자열"을 기반으로 주소값을 10진수로 변경해주기 때문에 동일하게 나온다.
		//따라서 현재 str1에는 "hello"가, str2에는 "hello"가 담겨있기때문에 출력된 주소값이 동일
		//String클래스의 hashcCode()메소드의 경우 주소값 기반이 아닌 실제 담긴 문자열을 기반으로 해시코값을 반환하도록 오버라이딩 되어있음.
	
		
		
		
		//정말 주소값을 알고 싶을때 사용하는 메소드  System.identityHashCode(참조변수(레퍼런스변수));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	//2.문자열을 리터럴(값)으로 생성
	//리터럴값이 상수풀에 올라감	
	public void method2() {
	
		String str = new String("hello");//heap영역에 별도의 주소값 할당되고 그 안에 hello값이 대입되어 있음
		
		String str1 ="hello"; //문자열을 해시코드로 변환한 값이 StringPool에 담겨있음, 그 주소값에 안에 hello대입되어있음
		String str2 ="hello"; //생성된 참조변수는 다르지만, 문자열이 동일하기 때문에 주소값이 동일함.
		//StringPool : 동일한 문자열 존재 불가
		
		System.out.println(str1==str2);
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
		
		
		
		
	}
	
	public void method3( ) {
		
		
		String str = "hello";
		System.out.println(System.identityHashCode(str));
		
		str = "goodbye";
		System.out.println(System.identityHashCode(str));
		
		str+="abc"; //=> str = str+"abc"
		System.out.println(System.identityHashCode(str));
		
		//문자열 같은 경우 값을 대입할때마다 주소값이 바뀐다.(불변의 법칙)
		//값이 변경될때마다 소멸되는 것이 아니라, 상수풀에 담긴 주소값에 계속 남아있음
		
		
		/*
		 * 기존의 상수들의 연결이 끊긴 문자열들은 가비지 콜렉터가 알아서 정리해줌
		 * 불변이라고 해서 수정이 아예 안되는게 아니라 기존의 그 자리(원래있던 주소값)에서 수정되는 개념이 아니라는 것
		 * 매번 새로운 주소값을 참조하게 됨
		 * 
		 * 
		 */
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
