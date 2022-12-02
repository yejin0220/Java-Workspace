package com.kh.practice.numRange.view;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {

	public void menu() {
		// 사용자에게 두 정수를 입력 받아 NumberController의 checkDouble()에
		// 매개변수로 넘겨주어 반환 값을 출력함
		// 이 때 checkDouble()메소드를 호출하는 부분부터 try~catch를 이용하여 예외 처리
		//정수1 : 55
		//정수2 : 5
		//55은(는) 5의 배수인가 ? true
				
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		try {
			if(!(num1 >= 1 && num1 <= 100 && num2 >=1 && num2 <=100)) {
				throw new NumRangeException("1과 100사이의 값이 아닙니다.");
			}
			System.out.printf("%d은(는) %d의 배수인가 ? %s \n", num1 , num2 ,new NumberController().checkDouble(num1, num2));
		
		}catch(NumRangeException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
