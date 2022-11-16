package com.kh.practice.dimension;

public class DimensionPractice {
	
	public void practice1() {
		
//		3행 3열짜리 문자열 배열을 선언 및 할당하고
//		인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
//		ex.
//		(0, 0)(0, 1)(0, 2)
//		(1, 0)(1, 1)(1, 2)
//		(2, 0)(2, 1)(2, 2)
		
		
		int [][]arr= new int [3] [3];
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length;j++) {
				System.out.printf("(%d,%d) ",i, j);
			}System.out.println();
		}
		
		
		
		
		
	}

}
