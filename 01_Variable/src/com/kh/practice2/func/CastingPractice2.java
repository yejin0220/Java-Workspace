package com.kh.practice2.func;

public class CastingPractice2 {

	public void test() {
	
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1/iNum2); //2
		System.out.println((int)dNum); //2
		
		System.out.println((double)iNum1);
		System.out.println(iNum2*dNum); //작은 값에서 큰 값으로 형 변환
		
		System.out.println((float)(iNum1/iNum2));
		//System.out.println(iNum1/(double)(iNum2)); 다른 방법
		System.out.println(dNum);
		
		System.out.println((int)(fNum));
		System.out.println(iNum1/(int)(fNum));
		
		System.out.println((float)(iNum1)/fNum);//float는 소숫점 7번째 자리까지 표현 
		System.out.println((double)(iNum1)/fNum); //double은 소숫점 7번째 자리 이상까지 표현 가능
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println(iNum1+(int)(ch));
		System.out.println((char)(iNum1+ch)); //(iNum1은 10+ ch는 65)로 75라는 값이 도출되었음, 유티코드에서 75는 K를 표기/  
		
	
		
		
		
		
		
		
		
		
		
		
	}
}
