package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int in = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num = sc.nextInt();
				
		System.out.println("더하기 결과 : "+ (in+num));
		
		System.out.print("빼기 결과 : "+(in-num));
		
		System.out.print("곱하기 결과 : "+(in*num));
		
		System.out.println("나누기 몫 결과 : "+(in/num));
	}
}
