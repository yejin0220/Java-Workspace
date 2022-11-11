package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {

	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double d1 = sc.nextDouble();
		
		System.out.print("영어 : ");
		double d2 = sc.nextDouble();
		
		System.out.print("수학 : ");
		double d3 = sc.nextDouble();
		
		System.out.println("총점 : "+(int)(d1+d2+d3));
		System.out.println("평균 : "+(int)((d1+d2+d3)/3));
		
		
		
		//printf문을 사용한 방법
		int sum = (int)(d1+d2+d3);
		int sum1 = (int)(sum/3);
		
		System.out.printf("총점 : %d \n", sum);
		System.out.printf("평균 : %d \n", sum1);
		
		
		
	   
		
				
		
		
		
	}
}
