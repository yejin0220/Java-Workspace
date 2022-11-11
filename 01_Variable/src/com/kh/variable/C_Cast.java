package com.kh.variable;

public class C_Cast {
	/*
	 * 형변환 : 값의 자료형을 바꾸는 개념
	 * 
	 * 컴퓨터 상에서의 값 처리 규칙
	 * 1. 대입연산자(=)를 기준으로 왼쪽과 오른쪽은 같은 자료형이여야함.
	 *    => 즉, 같은 자료형에 해당하는 값만 대입이 가능함.
	 *    => 다른 자료형의 값을 대입하고자 한다면 "형변환"이 필수로 이루어져야함.
	 * [표현법] 자료형 변수명 = (바꿀 자료형) 값;
	 * 
	 * 2. 같은 자료형끼리만 연산 가능.
	 *    => 즉, 다른 자료형기리 연산을 수행하고 싶으면 한 구문은 "형변환"을 해야함.
	 * [표현법] 값+(바꿀자료형) 값;
	 * 
	 *  
	 *--형변환의 종류---
	 * 1. 자동형변환 => 자동으로 형변환이 진행되기 때문에 내가 직접 형변환할 필요가 없다.
	 *            => 작은 바이트의 자료형 -> 큰 바이트의 자료형으로 변경할 경우 자동으로 진행됨
	 *            
	 * 2.강제(명시적)형변환 => 자동형변환이 이뤄지지 않아 내가 직접 강제로 형변환을 해야하는 경우
	 *                 => 큰 바이트의 자료형 -> 작은 바이트의 자료형으로 변경할 경우 직접 변환해야함
	 * 
	 * [표현볍] (바꿀자료형) 값;
	 * 
	 * (바꿀자료형) == 형변환연산자 == cast연산자
	 * 
	 * 
	 * *주의사항
	 * -boolean은 형변환 불가.
	 *  
	 * 
	 *
	 */
	
	//자동형변환 : 작은 바이트의 자료형이 큰 바이트의 자료형으로 형변환 되는 경우
	public void autoCasting() {
		
		//1.int(4byte) ->  double(8byte)
		int i1 = 10;
		double d1 = /*(double)*/ i1; //자동으로 형 변환 되어 있음(double)생략 가능
		                             //컴퓨터 포장용상자에 휴대폰을 담은 꼴과 비슷함(큰 박스에 작은 물건을 채움)
		                             //그런데 int는 정수, double은 실수 자료형임
		                             //이 경우 d1 은 10 -> 10.0으로 형변환이 됨

	    System.out.println("d1 : "+d1);
	
	
	   int i2 = 12;
	   double d2 = 3.3;
	
	   double result = i2 + d2; //int가 자동으로 double로 형 변환되어 있는 상태임 -> 12.0+3.3으로 실행됨 => 15.3
	
	   System.out.println("result : "+result);
	
	
	
	
	
	    //2.int(4byte) -> long(8btye)
	    int i3 = 1000;
	    long l3 = /*(long)*/ i3;
	    
	    long l4 = 2000L; //2000이라는 값은 int지만, 작은 바이트에서 큰 바이트로 자동 형 변환이 되어서 L을 붙이지 않아도 됨
	                     
	    
	    //3. 특이케이스 long(8byte) -> float(4byte)
	    //정수가 실수로 담길때에는 큰 사이즈의 정수여도 작은 사이즈의 실수 변수에 대입이 가능하다.(자동형변환)
	    //아무리 4byte float라고 해도 long형보다 담을 수 있는 값의 범위가 더 크기 때문.
	    //float형이 실수이기 때문에 long형보다 표현 가능한 범위의 수가 더 커서 자동형변환이 이뤄짐.
	    
	    long l5 = 10000000000L;
	    float f5 = /*float*/ l5;
	    
	    System.out.println("f5 : "+f5);
	    
	    
	    //4. 특이케이스 char(2byte) <-> int(4byte) : 양방향 변환 가능
	    char ch = 65;
	    System.out.println("ch : "+ch);
	   
	    int num = 'A';
	    System.out.println("num : "+num);
	    
	    /*
	     * char의 범위는 0~65*** : 각 문자마다 고유의 정수값이 정해져음, 따라서 쌍방향 및 양방향 전환이 가능하다./음수값은 오류가 난다.
	     * 참고 : 아스키코드표(0~127, 영문자, 대소문자, 숫자, 특수문자)
	     *       유니코드표(0~65***, 영어, 숫자, 특수문자, 한글, 그 외 언어들)
	     */
	    
	    System.out.println((int)'진');
	    
	    char sum = 'A'+10; //A:65+10->75//아스키코드표에 있는 75라는 숫자가 가리키는 문자를 반환하게 됨//문자+숫자는 문자 다음으로 몇 번째에 오는 문자를 출력할 수 있음
	                      //문자와 정수사이 연산이 가능함
	    System.out.println(sum);
	    
	    //5. 특이케이스 byte와 short간의 연산
	    byte b1 = 1;
	    byte b2 = 10;
	    
	    //byte로 연산시 연산결과의 정수값은 무조건 int로 취급한다.
	    //int는 byte보다 크기가 크기 때문에 반환이 안됨
	    byte b3 = (byte)(b1+b2); //int는 byte보다 크기 때문에 강제로 형변환을 해줘야 함
	    
	}
	
	
	
	//강제(명시적)형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 형변환 할 경우.
	public void forceCasting() {
		//1.double(8byte) => float(4bte)
		float f1 = 4.0f; //실수값을 float자료형으로 저장하고 싶다면 반드시 f를 붙여줘야 함.
		
		double d2 = 8.0;
		float f2 = (float)(d2); //(float)가 강제 형변환 연산자가 됨
		
		
		
		//2. double(8byte) -> int(4byte)
		double d3 = 10.89;
		int i3 = (int)(d3); //10.89라는 실수값은 10으로 변환 됨(반올림, 반내림 없음 그냥 정수값만 처리함)
		System.out.println("i3 : "+i3);
		
		int iNum = 10;
		double bNum = 5.89;
		
		//iNum이 double형으로 우선 변환이 됨 (10->10.0)
		//10.0+5.89=15.89 실수값이 반환 됨
	    //연산결과가 실수(double)자료형이므로 int형에 대입이 불가능합.
		//해결방법 1. 연산결과를 int형으로 맞춰서 강제 형변환
		int iSum = (int)(iNum+bNum); //iNum+bNum 에서 iNum은 double로 자동 변환되어 실수로 계산되었으나 int로 출력 하기 위해서는 형변환을 해줘야 함.
		
		
		
		//해결방법 2. 덧셈 연산전에 dNum변수를 미리 int형으로 강제 형변환
		//          자동형변환은 작은 바이트 변수가 큰 바이트 변수로 형변환 되기 떄문에 큰 바이트인 dNum변수를 강제로 int형으로 변환시킨 것
	    int iSum2 = iNum+(int)bNum; //괄호안에 있는 연산자가 가장 먼저 처리 되어 dNum을 정수형으로 미리 변환시켜주어 int iSum2 출력 가능
	    
	    
	
	    
	   //실수값을 정수형으로 강제형변환시 소수점 아래 부분은 버려짐(데이터손실 발생)
	   //해결방법 3. 애초에 결과값을 double형 변수에 담기(데이터 손실없이 정확한 값이 담김)
	   double dSum = iNum+bNum;
	   System.out.println("iSum : "+iSum+", iSum2 : "+iSum2+", dSum : "+dSum);
	    
	   
	   /*데이터 손실테스트*/
	   int iNum2 = 290;
	   byte bNum2 = (byte)(iNum2); 
	   //byte가 표현하는 값은 -128~127까지만
	   
	   System.out.println("bNum2 : "+bNum2);//34가 출력 됨 -> 256의 데이터가 손실되었음.
	   
	 
	   
	   
	}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	

}
