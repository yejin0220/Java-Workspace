package com.kh.cahp01.condition;

import java.util.Scanner;

public class A_If {
	
	
	/*
	 * 기본적으로 프로그램의 진행은 순차적으로 진행됨.
	 * 단, 이 순차적인 흐름을 바꾸고자 한다면 제어문을 이용해서 직접 제어가 가능함.
	 * 
	 * 선택적으로 실행시키고자 할때 => 제어문
	 * 반복적으로 실행시키고자 할때 => 반복문
	 * 그 외에는 -> 분기문
	 * 
	 * [조건문]
	 * 조건식을 통해 결과값이 참이냐 혹은 거짓이냐를 판단해서 그에 해당하는 코드를 실행
	 * 
	 * [조건식]
	 * 반드시 결과는 true/false여야함.
	 * 보통의 조건식에는 비교연산자, 논리연산자를 주로 사용함.
	 * 
	 * 조건문은 크게 if문(단독, if else, if~else if, 중복if), switch문으로 나뉨
	 * 
	 * 
	 * 
	 * 
	 */

	//삼항연산자를 조건문으로 바꿔보기
	
	public void method1() {
		/*
		 * 단독 if문
		 * 
		 * [표현법]
		 * if(조건식) {
		 * 		조건식이 true인 경우 실행할 코드 -> 만약 조건식이 true라면 실행해!
		 * }
		 * => 조건식의 결과가 참일 경우 중괄호 블록 안의 코드가 실행
		 * => 조건식의 결과가 거짓일 경우 중괄호 블록 안의 코드가 무시되고 넘어감.
		 * 
		 */
		
//사용자에게 정수값을 입력받은 후 "양수다", "양수가 아니다"를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		//삼항 조건식 : num>0 ? "양수입니다." : "음수입니다.";
		if(num>0) {
			System.out.println("양수입니다."); //양수입니다. 출력을 먼저 적고 if블럭으로 감싸주기(마감)
		}
		
		if(num<=0) {
		System.out.println("양수가 아닙니다.");
		}
		
		
	
		
		
	}

	
	public void method2() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		/*
		 * if-else 문
		 * 조건문이 true가 아니라면 실행되는 조건문
		 * 
		 * if(조건식){
		 * ..조건식이 true일 경우 실행될 코드
		 * } else {
		 * ..조건식이 false일 경우 실행될 코드
		 * }
		 * 
		 */
		
		if(num>0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("양수가 아닙니다.");
		}
			
		
	}
	
	
	
	
	
	
	
	public void method3() {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("정수를 입력하세요.");
		int num = sc.nextInt();
		
		/*
		 * if - else if 문
		 * 
		 * 같은 비교대사으로 여러개의 조건을 제시해야할 경우
		 * 
		 * if(조건식1){
		 *  ..조건식1이 true라면 실행시킬 코드 작성..
		 *  } else if(조건식2) {
		 *  ..조건식2가 true라면 실행시킬 코드 작성..
		 *  } else if(조건식3) {
		 *  ..조건식3이 true라면 실행시킬 코드 작성..
		 * } [else{
		 *  ..위의 모든 조건식 결과가 false라면 실행할 코드
		 *  }]
		 * 
		 * 많이 사용하면 할 수록 뒤쪽에 있는 실행문이 느려짐
		 * 
		 */
		
		
		if(num>0) {
			System.out.println("양수입니다.");
		} else if (num==0) {
			System.out.println("0입니다.");
		} else if (num<0) {
			System.out.println("음수입니다.");
		}
		
		
		
		
		
	}
	
	
	
	
	
	public void method4() {
		//사용자가 입ㄺ한 나이값을 가지고 어린이/청소년/성인 출력
		//if else if 문을 가지고 만들어보기
		//어린이 : 13세 이하 / 청소년 : 13세 초과~19세 이하 / 성인 : 19세 초과
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if(age<=13) {
			System.out.println("어린이");
		} else if (age > 13 && age<=19) {
			System.out.println("청소년");
		} /*else if (age >19) {
			System.out.println("성인");*/// -> //위의 두 조건을 만족하지않으면 최종 결과가 출력 -> 식을 굳이 쓸 필요가 없음
		  else {
				System.out.println("성인");
		}
		
		
		
		
		//다른 방법으로 풀어보기
		//어린이, 청소년, 성인에 대한 값을 담아두고 마지막에 출력문으로 출력해보기
		
		String result; //if문을 벗어난 지역변수 출력하기 1. 출력하고자 하는 박스 먼저 만들어두기
		
		if(age<=13) {
			result = "어린이";
		}
		else if (age > 13 && age<=19) {
			result = "청소년";
		}
		  else {
			  result = "성인";
		}
		
		//System.out.println(result); -> 실행안됨 : if문을 벗어난 지역변수이기 때문에 실행될 수 없음
		System.out.println(result); //-> 출력하고자 하는 박스를 if문 밖에 먼저 선언해주고 if문을 벗어난채로 출력하게 되면 가능해짐
	}
	
	
	
	
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		//사용자에게 이름, 성별을 입력받아 남자인지, 여자인지 출력하는 메서드
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		String result=""; //변수를 선언하면 공백으로 초기화를 미리미리 해주는게 좋음 -> 어떤 값도 들어갈 수 있도록 해두면 에러 발생률도 낮음
		if(gender == 'm' || gender =='M') {
			result = "남학생";
		}else if(gender == 'f' || gender == 'F') {
			result = "여학생";
		}else {
			System.out.println("잘못입력하셨습니다.");
			//만약 이 아래 코드를 실행시키고 싶지 않다면?
			//return이라는 녀석을 사용
			return; //부가기능으로 해당 일반 메서드를 빠져나감(메소드를 호출했던 곳으로 돌아감)
		}
		
		
		//0000님은 000이다.
		System.out.printf("%s님은 %s이다.",name,result);
		//-> 상단의 String result를 초기화 해두지 않으면 오류가 나기 때문에, 초기화는 필수로 작업해두기
		
		
	}
	 

	
	public void method6() {
		//특이케이스. 문자열간의 동등비교 (문자열 == 문자열)
		//사용자에게 이름을 입력 받아 민경민이라는 문자열과 일치하는지 비교해보기.
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		//동등비교 연산같은 경우 정상적으로 작동되려면 기본적으로 작업을 해주어야 함
		//String 은 참조자료형이기 때문에 기본 자료형과 작업이 이뤄지지 않음.
		if(name == "민경민") {
			System.out.println("민경민님 반갑습니다.");
		}else {
			System.out.println("민경님이 아니신가보네요?");
		}
		
		
		/*
		 * 기본자료형 : boolean, byte, short, int, long, float, double, char
		 * 참조자료형 : String //특이하게 첫 글자가 대문자이다.
		 * 
		 * 
		 * 기본자료형간 비교시 == 혹은 != 사용이 가능하지만, 참조자료형의 경우 동등비교연산시 정상적으로 연산이 안된다.
		 * 참조자료형 -> String.equls()라는 방법으로 비교를 해야함.
		 * 
		 * 
		 * 
		 */
		
		
		
		//String문자열 동등비교 연산을 하고 싶다면? if뒤에 (name.equals("")) 조건식을 넣어 동등비교 연산 가능
		if(name.equals("민경민")){ //즉 반환값이 true or false로 return해줌.
			System.out.println("민경민님 반갑습니다.");
		}else {
			System.out.println("민경님이 아니신가보네요?");
		}
		
		
		
		
	}
	
	
	public void method7() {
		
		
		Scanner sc = new Scanner(System.in);
	//양수를 입력 받고, 짝수인지 홀수인지 판별하는 프로그램
		
		System.out.print("양수 입력 : ");
		int num = sc.nextInt();
		
		if(num>0) { //양수인지 확인
			
			if(num%2==0) {
				System.out.println("짝수 입니다."); //양수이고 짝수인경우
			} else { 
				System.out.println("홀수 입니다."); // 양수이고 홀수인 경우
			}
		} else {
			System.out.println("양수가 아닙니다. 잘못 입력하셨습니다.");
			method7(); // 잘못 입력한 경우 프로그램이 종료되지 않고 다시한번 입력할 수 있도록 해당 메소드를 다시 호출해주면 다시 실행됨
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
