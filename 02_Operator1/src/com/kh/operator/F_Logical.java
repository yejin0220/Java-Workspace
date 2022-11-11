package com.kh.operator;

import java.util.Scanner;

public class F_Logical {

	/*
	 * 논리연산자-이항연산자
	 * 두개의 논리값을 연산하는 연산자
	 * 논리값과 논리값 사이에 논리연산자가 들어감  : 논리값 (연산자) 논리값 -> 결과값도 논리값
	 * 
	 * AND 연산자(&&) : 논리값 && 논리값
	 *                -> 왼쪽, 오른쪽의 논리값이 둘다  TRUE여야만 최종결과가 TRUE가 반환됨
	 *                
	 * OR 연산자(||) : 논리값 || 논리값 
	 *               -> 왼쪽, 오른쪽 논리값 중 어느 하나라도 TRUE면 최종결과가 TRUE.              
	 * 
	 * 
	 * 
	 */
	
	
	public void method1() {
		
		//사용자가 입력한 정수값이 양수이면서(이고) 짝수인지 확인하기.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값을 한 개 입력 :");
		int num = sc.nextInt();
		
		boolean result = (num >0) && (num%2 ==0);
		//%% 의미 : 그리고, ~이면서, ~이고
		
		System.out.println("사용자가 입력한 값이 양수이면서 짝수입니까? "+result);
		
	}
	
	
	public void method2() {
		
		//사용자가 입력한 정수값이 1이상 100이하의 수인지 확인하기.
		//사용자가 입력한 값이 1이상 100이하입니까? true/false
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("정수값을 한 개 입력 :");
		int num1 = sc1.nextInt();
		
		boolean result1 = (num1>=1) && (num1<=100);
				
		System.out.println("사용자가 입력한 값이 1이상 100이하입니까? :" + result1);
		
		/*
		 * &&(AND): 그리고, ~이면서, ~이고, 뿐만 아니라 의 경우 사용
		 *         -> 두개의 조건 모두 true여야 결과값도 true
		 *         -> 둘 중 하나라도 false일 경우 결과값도 false
		 *          
		 * 
		 */
		
		
		
	}
	
	
	
	public void method3() {
		
		//사용자가 입력한 값이 y "이거나" Y인지 확인하기.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계속 진행하시려면 y 또는 Y를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		
		System.out.println("사용자가 입력한 값이 y 또는 Y입니까? : "+result);
		
		
		/*
		 * ||(OR) : 또는, ~이거나
		 * 
		 * 두개의 조건 중, 하나라도 TRUE일 경우 최종 결과값은 true
		 * 두개의 조건이 모두 false일 경우 최종 결과값은 false
		 * 
		 */
		
		
	}
	
	
	
	public void method4() {
		
		int num1 = 10;
		
		//boolean result1 = false && ( num1>0 ); //논리값 중 이미 false가 있기 때문에 뒤에 조건은 확인하지 않고 결과값은 false값이 반환  
		boolean result1 = false && ( ++num1 > 0 ); //조건식을 실행시킨 후에 결과값을 도출 -> num1: 11
		System.out.println(num1);
		
		/*
		 * 뒤의 비교연산 구문이 Dead code라고 끈다.
		 * 실행할 때 오류는 나지 않지만, result결과값이 어차피 false인데 왜 작성한 구문인지 물어보는것.
		 * 
		 */
		
		
		
		
		boolean result2 = true || (++num1 > 0); //무수히 많은 논리값 중 하나라도 true가 있다면, 남은 조건은 확인하지 않고 결과값은 true값이 반환됨
		System.out.println(num1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
