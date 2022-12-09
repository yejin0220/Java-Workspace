package com.kh.enumBasic;

public class EnumRun {
	/*
	 * Enum => Enumeration(열거)의 약자형.
	 * 기존에 사용하던 상수를 정의하는 방법중 final static와 같은 기능함.
	 * 문자열 혹은 숫자들을 나타내는 기본자료형을 Enum을 통해서 표현할수 있다.
	 * 
	 * 1 -> true , true -> true, 'Y' -> true 
	 * 
	 * 1 -> 일반게시판, 2 -> 썸네일 게시판 , 3 -> xxx게시판
	 * 
	 */
	public static final String MONDAY = "MON";
	public static final String TUESDAY = "TUE";
	public static final String WENDSEDAY = "WEN";
	public static final String THURDAY = "THU";
	public static final String FRIDAY = "FRI";
	public static final String SATURSDAY = "SAT";
	public static final String SUNDAY = "SUN";
	/*
	 * 위처럼 상수를 정의했을때 단점
	 * 1) 가독성 떨어짐
	 * 2) 오타가났을때 원하는결과가 나오지 않을수 있음.
	 * 3) monday라는 문자열을 저장하고 싶을 경우-> 새롭게 선언해줘야함.
	 * 4) 상수필드가지고 반복문을통해 값을 가져올수 없음.
	 */
	enum EnumTest{
		MONDAY, // static , final키워드를 붙이지 않았는데 자동으로 추가해줌.
		TUESEDAY,
		WENDSEDAY,
		THURSDAY,
		FRIDAY,
		SATURSDAY,
		SUNDAY
	}
	
	public static void main(String[] args) {
		//상수에 담긴값 생성하는방법.
		System.out.println(EnumTest.MONDAY);
		System.out.println(EnumTest.MONDAY.name());
		
		//enum으로 만들어둔 클래스는 임포트없이 사용가능.
		System.out.println(Day1.MONDAY);
		
		//enum필드안에 담긴값을 반환해주는 메소드
		System.out.println(Day2.MONDAY.shortName());
		System.out.println(Day3.SUNDAY.day());
		
		// enum에서 사용가능한 메서드들
		// 1) valueOf => 일치하는 이름의 enum값들을 가져옴.
		System.out.println(Day3.valueOf("MONDAY"));
		// 2) values() => 열거형 상수(enum)들을 배열형태로 리턴
		
		for(Day3 day : Day3.values())
		{		
			System.out.println(day.name());
		}
		System.out.println("====================================================");

		// 3) 직접추가한 메소드들
		System.out.println(Day3.valueOfShortName("SAT"));
		System.out.println(Day3.valueOfDay(4));
		
		Day4.SATURSDAY.printDay();
		Day4.SUNDAY.printDay1();		
		
		/*
		 * 상수(enum) 사용하는 이유
		 * 1) 코드가 간결해져서 가독성이 좋음.
		 * 2) 데이터그룹 관리 및 연관관계 표현에 용이함
		 * 		ex) 하나의 요일에 해당하는 데이터를 (MON, MONDAY, 1, 월요일)하나의 상수필드로 합칠수 있다.
		 *		ex) true , Y , 1 
		 * 3) 상수별로 다른 메서드를 사용해야할때 쉽게 구현이가능하다.
		 * 
		 */
		
		
		
		
		
		
		
		
		
	}

}
