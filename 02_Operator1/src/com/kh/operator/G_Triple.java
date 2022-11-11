package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	/*
	 * 삼항연산자 : 3개의 항목을 가지고 연산하는 연산자.
	 * 
	 * [표현법]
	 * 
	 * 조건식 ? "조건식이 true일 경우 결과값" : "조건이 false일 경우의 결과값"
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public void method1() {
		//사용자가 입력한 정수값이 양수인지 아닌지 판별 후, 양수라면 양수입니다. 아니라면 양수가 아닙니다. 출력
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("정수값을 입력 : ");
		int num = sc.nextInt();
		
		String result = (num>0) ? "양수입니다." : "양수가 아닙니다.";
		System.out.println(num+"은(는)"+result);

       //산술연산이 삼항연산보다 우선순위가 높아서 괄호로 묶어줘야 한다.
		System.out.println(num+"은(는) "+(num <= 0 ? "양수가 아닙니다. " : "양수입니다."));
	}

	public void method2() {
		
		//사용자가 입력한 정수값이 짝수인지 홀 수 인지 판별 후 출력
		//xx는 짝(홀)수입니다. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값을 입력 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		System.out.println(num+"은(는)"+result);
		
		System.out.println(num+"은(는)"+(num%2==0 ? "짝수입니다." : "홀수입니다."));
		
		
		
		
		
		
	}
	
	
	
	public void method3() {
		
		//사용자로부터 영문자 하나를 입력받아 대문자인지, 아닌지 판별 후 출력하시오.
		//아스키코드표 활용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자를 한개만 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		//ch라는 변수가 아스키코드상에 존재하는 숫자만 되면 됨
		
		String result = (ch >= 'A' && ch <= 'Z')? "대문자입니다" : "대문자가아닙니다."; //'A'와'Z'대신에 이들을 가리키는 숫자를 집어 넣어도 상관 없음
		
		System.out.printf("%c는 %s \n",  ch, result);
		
		
		
		
		
		
	}
	
	
	
	   //삼항 연산자 중첩 사용
		public void method4() {
			
			//method1()의 내용을 보완할 예정
			//사용자가 입력한 정수값이 양수인지, 0인지, 음수인지를 판별
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("정수값 입력 : ");
			int num = sc.nextInt();
			
			String result = (num > 0 ? "양수입니다." : (num == 0 ? "0입니다." : "음수입니다."));
			
					
			System.out.println("사용자가 입력한 값인" +num+"은"+result);
					
	
	
		}
	
	
	public void method5() {
		
		//두개의 정수값과 +,- 의 문자를 입력받아
		//+일 경우 두 정수값의 덧셈 연산한 결과
		//-일 경우 두 정수값의 뺄셈 연산한 결과
		//둘다 아닐 경우 잘못입력했습니다. 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산자 입력(+ or -) ");
		char op = sc.nextLine().charAt(0);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		//nextInt뒤에 nextLine위 오면 입력버퍼가 남아 있기 때문에 nextLine먼저 입력
		
		String result = ((op == '+' )?  (num1+num2)+"" : ((op == '-') ? (num1-num2)+"" : "잘못입력했습니다."));
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
	
}
