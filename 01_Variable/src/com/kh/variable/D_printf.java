package com.kh.variable;

public class D_printf {
	
	public void printFtest() {
		
	

	
	/*
	 * System.out.println(출력하고자하는값); => 값을 출력하고 +줄바꿈(개행)까지 넣어줌
	 * System.out.print(출력하고자하는값):   => 값 출력만해줌
	 * 
	 * System.out.printf("출력하고자하는 형식", 출력하고자하는 값, 출력하고자하는 값 ......);
	 * =>f는 format(형식)을 의미
	 * =>형식에 맞춰서 값들이 출력이 되고 끝(줄바꿈x)
	 * =>문자열 안에 그 값이 들어갈 자리에 다음과 같은 형식으로 잡아줘야 하낟.
	 * 
	 * 형식
	 * %d : 정수
	 * %f : 실수
	 * %c : 문자
	 * %s : 문자열
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	//정수 테스트
	int iNum1 = 10;
	int iNum2 = 20;
	
	//iNum1 : xx, iNum2 : xx를 출력해보기
	//1.println사용
	System.out.println("iNum1 : "+iNum1+", iNum2 : "+iNum2);
	
	//2.printf사용-> 정수값의 형식 %d를 사용해서 완성/줄바꿈기능이 없으므로 직접 개행문자 추가해줄것.(\n)
	System.out.printf("iNum1 : %d, iNum2 : %d \n", iNum1, iNum2);

	
	
	
	//10+20=30 출력해보기
	//1.println을 사용해서 출력
	System.out.println(iNum1+"+"+iNum2+"="+(iNum1+iNum2)); //쌍따옴표 안에 들어가면 문자로 인식(연산하지 않음)
	
	//2.printf사용해서 출력/개행문자까지 추가
	System.out.printf("%d + %d =%d \n", iNum1, iNum2, iNum1+iNum2);
	
    System.out.printf("%5d \n", iNum1);//%5d : 5칸의 공간 중 오른쪽으로 정렬 / %와d 사이에 양수 -> 오른쪽으로 양수만큼의 공간확보 후 오른쪽 정렬
	System.out.printf("%-5d \n", iNum1); //%-5d : 5의 공간 중 왼쪽으로 정렬 / %와d 사이에 음수 -> 왼쪽으로 음수만큼의 공간확보 후 왼쪽 정렬
	
	//실수테스트
	double dNum = 4.27546789;
	System.out.printf("dNum : %f \n", dNum); //%f : 소숫점 아래 7번째줄에서 반올림 되어, 소숫점 아래 6번째까지만 출력이 됨(모든 소숫점 출력x)
	
	System.out.printf("dNum : %.7f \n", dNum); //%.1f :소숫점 아래 2번째줄에서 반올림되어, 소숫점 아래 1번째 까지만 출력이 됨 
											   //%와f사이의 .자릿수로 제어가 가능
	
	//printf : 포맷 한번으로 간편하게 출력 가능
	//단, 지정한 포맷의 갯수와 종류, 뒤에오는 변수의 객수와 종류가 정확하게 일치해야함.
	
	
	//문자와 문자열 테스트
	char ch = 'a';
	String str = "Hello~";
	
	System.out.printf("%c %s \n", ch, str); //%s 문자열 같은 경우 정수, 실수 등을 다 커버할 수 있음
	System.out.printf("%C %S \n", ch, str); //%C, %S : 영어 알파벳일 경우 대문자로 변경해서 출력
	
	
	
	
			
	
	
	}
	
	
	
}
