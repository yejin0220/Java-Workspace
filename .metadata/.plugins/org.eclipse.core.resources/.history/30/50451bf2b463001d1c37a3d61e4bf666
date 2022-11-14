package com.kh.chop2.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * <반복문>
	 * 프로그램의 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜줌.
	 * 
	 * 크게 두 종류로 나뉨(FOR문, WHILE문(DO-WHITLE))
	 * 
	 * [표현법]
	 * for(초기식; 조건식; 증감식) { // for안에 들어가는 문장들은 세미콜론을 활용해 구분, 무조건 세미콜론(;)이 있어야함.
	 *                          반복적으로 실행시키고자 하는 코드 작성;
	 * }                         
	 * 
	 * -초기식 : 반복문이 시작될때 "초기에 딱 한번만 실행"되는 구문
	 *         (반복문에서 사용할 변수를 선언 및 초기화 할때 사용)
	 *         ex)int i = 0;
	 * 
	 * -조건식 : 반복문이 수행될 조건을 작성하는 구문
	 *         조건식의 결과가 true이면 반복문 실행 //
	 *         조건식의 결과가 false이면 반복문을 멈추고, 빠져나옴
	 *         (보통 초기식에 제시된 변수를 가지고 조건식을 작성)
	 *         
	 * -증감식 : 반복문을 제어하는 변수값을 증감시키는 구문
	 *         (보통 초기에 제시된 변수를 가지고 증감식을 작성)
	 *         ex) i++, --i 등..
	 *              
	 *                 
	 *                 
	 * for문을 만나는 순간
	 * 초기식(딱한번 실행) -> 조건식(조건 검사) -> true일 경우 실행할 코드 실행 -> 증감식
	 *                 -> 조건식(증감으로 인해 달라진 숫자로 조건검사) -> true일 경우 실행할 코드 실행 -> 증감식
	 *                 -> 조건식(증감으로 인해 달라진 숫자로 조건검사) -> true일 경우 실행할 코드 실행 -> 증감식
	 *                 -> 조건식(증감으로 인해 달라진 숫자로 조건검사) -> true일 경우 실행할 코드 실행 -> 증감식
	 *                 -> ----무한 반복 ----
	 *                 -> 조건식(증감으로 인해 달라진 숫자로 조건검사) -> false일 경우 실행할 코드 실행xxxx
	 *                 
	 * 매번 조건식의 조건검사 결과값을 가지고 조건이 true일 경우만 반복해서 실행한다.
	 * 
	 * 알아둘것 :
	 * for문 안에 초기식, 조건식, 증감식 각각 생략이 가능하긴 함.
	 * 단, 반드시 ;은 작성해줘야 함 -> 빈값이더라도 세미클론(;)은 입력해줘야 함.
	 * 
	 */
	
	
	
	
	public void method1() {
		//안녕하세요를 5번 반복해서 출력하고 싶은 경우
		
		System.out.println("안녕하세요");
		
		
		for(int i=0; i <=4 ; i++) {
			System.out.println("안녕하세요");
		}
		
		
//		int i = 0;
//		for(;i<=4 ; i++ ) {
//			System.out.println("야호~");
//		}
		//초기식, 조건식, 증감식이 없더라도 문법적 오류는 아니지만, 무한반복으로 실행됨
		
		
		for(int i = 11; i<16;i++); {
			System.out.println("무야호~");
		}
		
		for(int i =1; i<10; i+=2) {
			System.out.println("반갑습니다.");
		}
		
		
		
		
		
	}
	
	
	
	public void method2() {
		//1~5까지 출력이 되는 반복문
		//조건 : i의 값이 1~6보다 작을때 까지 1씩 증가할 동안반복을 수행
		//1 2 3 4 5
		
		for(int i = 1; i<6; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i =5; i>0 ; i--) {
			System.out.print(i+" ");
		}
		
		
		
		
		
	}
	
	
	
	public void method3() {
		//i의 값이 1에서부터 10사이의 홀수만 출력
		// 1 3 5 7 9
		
		
		for(int i = 1; i<=10; i+=2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i = 1; i<=10; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		
		
		
		
	}
	
	
	public void method4() {
		
		
		//1 2 3 4 5 6 7 8 9 10
		for (int i = 0; i <=9; i++) {
			System.out.print(i+1+" ");
		}
			
		
	}
	
	
	
	
	public void method5() {
		
		//산술연산 + 반복문
		//1~10까지의 총 합계
		
		//방법1. 1~10까지의 합계를 담을 변수 int sum = 1+2+3+4+5+6+7+8+9+10; 
		
		//방법2. int sum = 0; 을 선어 ㄴ후
				//sum+1
				//sum+2
				//sum+3
				//...
		
		int sum = 0; //지역변수라 for문 안으로 들어가면 최종적으로 출력이 안되기 때문에 for문 밖에 초기화로 선언해주기.
		for(int i =1; i <=10; i++) {
		  sum+= i;
		}
		
		System.out.println("1부터 10까지의 총 합계 : "+sum);
		
		
		
		
	}
	
	public void method6() {
		//1에서부터 사용자가 입력한 숫자까지 모두 더해서 출력해보기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양수 값 입력 하시오 :");
		int num = sc.nextInt();
		
		if(num >0 ) { //양수를 입력한 경우
			int sum = 0;
			for(int i=1; i<num; i++) {
				sum += i;
			}
			System.out.println("1부터 "+num+"까지의 총 합계 : "+sum);
			
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	public void method7() {
		
		//1부터 매번 달라지는 랜덤값(1~10사이의 정수)까지의 총 합계
		
		/*
		 * java.lang.math 클래스에 이미 정의되어 있는random()메소드를 호출하여 매번 다른 랜덤값을 얻어올 수 있음
		 * 
		 * static -> 객체시간에 자세히 다뤄볼 예정
		 * 
		 * 
		 * random() : 0.0~0.9999999999999999....사이의 실수 랜덤값 발생
		 * 0.0 <= 랜덤값 < 1.0
		 * 
		 * 
		 * 
		 */
		// Math m = new Math(); -> 실행할 수 없음
		// Math.random();  즉시 호출 하면 됨
		
		//int random = (int) Math.random();
		
		//0.0 <= 랜덤값 < 1.0
		//우선 10 곱해보기
		//0.0 <= 랜덤값 <10.0
		//1을 더해보자
		// 1.0 <= 랜덤값 < 11.0
		//소숫점만 버려버리면, 원하는 범위의 정수 랜덤값을 가져올 수 있음
		//1 <= 랜덤값 <= 10
		
		//[표현법]
		//Math.random() *  출력을 하고자하는 갯수 + 시작하고 싶은 수 
		//시작 수 ~(시작수+출력을 하고자하는 갯수)
		
		int random = (int)(Math.random() *10+1);
		System.out.println(random);
		
		int sum = 0;
		for(int i = 1; i<=random; i++) {
			sum += i ;
			
		}
		System.out.printf("1부터 %d까지의 총 합은 %d입니다", random, sum);
		
		
		
		
		
	}
	
	public void method8() {
		
		//반복문 + String
		String str = "hello";
		
		//문자열에 있는 문자 하나하나 뽑아보기		
		/*
		 * h => str.charAt(0);
		 * e => str.charAt(1);
		 * l => str.charAt(2);
		 * l => str.charAt(3);
		 * o => str.charAt(4);
		 * 
		 * 공통점 :  str.charAt
		 * 차이점 : (숫자)
		 * 규칙 : 1씩 증가하고 있다는 점
		 * 
		 * 반드시 규칙을 찾기
		 * 우선 반복적으로 str.charAt을 호출하고 있음
		 * 인덱스에 해당하는 숫자만 0부터 1씩 4까지 증가함
		 */
		
		for(int i = 0; i<=4; i++) {
			System.out.println(str.charAt(i));
		}
		
		
		
		
		
		
		
		
	}
	
	
	public void method9() {
		//각 사용자에게 문자열을 입력받아서
		//각 인덱스별로 문자를 하나씩 뽑아서 출력
		
		
	   //apple의 길이 : 5
	   //01234	
		
	   //kiwi 길이 : 4	
	   //0123
		
		//마지막 인덱스는 문자열의 길이에 -1
		//추출하고자 하는 인덱스의 값의 범위는 0~(문자열의 길이 -1)까지 매번 1씩 증가
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();
		
		//문자열의 길이를 알려주는 메소드 : 
		System.out.println("문자열의 길이 : "+str.length());
		
		for(int i = 0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		
		
		
	}
	
	
	public void method10() {
		
		//구구단 출력해보기(2단)
		
		/*
		 *2 X 1 =2 
		 *2 X 2 =4
		 *2 X 3 =6
		 * 2 X 4 =8
		 * 2 X 5 =10
		 * 2 X 6 =12
		 * 2 X 7 =14
		 * 2 X 8 =16
		 * 2 X 9 =18
		 * 
		 * 공통점 : 2X 0 = 00의 형태
		 * 차이점 : 곱해지는 숫자와 답
		 * 규칙 : 2씩 곱해지면서 답이 달라
		 * 
		 */
		
		for(int i = 1; i<=9; i++) { //뒤에 곱해지는 1~9까지의 수
			System.out.printf("%d X %d = %d \n",2,i,(2*i) );
			
			
		}
		
		
	}
	
	public void method11() {
		
		//사용자가 입력한 단을 출력
		
		//단수가 2단~9단까지의 범위가 아니라면 : 잘못입력했습니다.(2~9사이의 정수입력)
		
		//제대로 입력했다면 해당 단수를 출력
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 단을 입력하세요 : ");
		int num = sc.nextInt();
		
	    if(num>=2 && num<=9) { //2~9까지의 범위를 입력했다면?
	    	for(int i =1; i<=9; i++ ) {
	    		System.out.printf("%d X %d =%d \n", num, i, (num*i));
	    	}
	    	
	    }else {
	    	System.out.println("잘못입력했습니다.(2~9사이의 정수입력)");
	    }
		
		
	}
	
	
	public void method12() {
		
		//중첩 반복문
		//1~5까지 연이어서 출력
		// 1 2 3 4 5가 출력되도록 반복문 사용 -> 3번출력
		
		
		for(int i = 1; i<=3; i++) {
			
			for(int j = 1; j<=5 ; j++) { //중첩 for문에 만약 i를 변수로 선언한다면, 이미 for 문 밖에 i가 선언되어 있으므로 사용 불가, 다른 변수로 변경해줘야 함
				System.out.print(j+" "); // 1 2 3 4 5로 출력
			}
			System.out.println();	// 만약 반복된 출력문이 옆으로 연달아 출력되지 않도록 엔터값을 넣어줌
		}
		

		
	}
	
	public void method13() {
		
		//****
		//****
		//****
		//****
		//콘솔창에 위와 같은 모양이 찍히게 하기
		//중첩반복문으로 출력해보기
		
		
		for(int i = 1; i<=4; i++) {
			for(int a = 1; a<=4; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	
	public void method14() {
		
		//1*** ==> 1행 1열일때 숫자 1 //만약 첫번째 자리가 숫자 1이라면 나머지자리는 *
		//*2** ==> 2행 2열일때 숫자 2
		//**3* ==> 3행 3열일때 숫자 3
		//***4 ==> 4행 4열일때 숫자 4
		
		//중첩반복문
		//하나하나의 행을 외부 반복문으로 보기, 외부반복문 4행까지
		
		
		
		
//		for(int i = 1; i<=4; i++) {
//			if(i==1) {
//				for(int a=2; a<=4; i++) {
//					
//					System.out.println("*");
//				}
//		
//		}
//		
//		}
			
		
		for(int a =1;a<5;a++) {  //4번을 반복하는것.
			for(int i = 1; i<=4; i++) { //1 2 3 4 의 순으로 숫자가 써지는것. 
	              if(i==a) {  //i가 라면 숫자가 써지는것. // 
	            	  System.out.print(i);  //i에 숫자가 1이라면 1을 제외한 숫자자리에 *가 입력
					
				}else {
					System.out.print("*");
				}
			}	
			System.out.println();
		}
		
//		//*2**	
//		for(int i = 1; i<=5; i++) {
//			if(i==2) {
//				System.out.print(i); i에 숫자 2가 입력되면, 2를 제외한 숫자자리에 *가 입력
//			}else {
//				System.out.print("*");
//			}
//			
//		}
//		//**3*
//		for(int i = 1; i<=5; i++) {
//			if(i==3) {
//				System.out.print(i);
//			}else {
//				System.out.print("*");
//			}
//			
//		}
//		//***4
//		for(int i = 1; i<=5; i++) {
//			if(i==4) {
//				System.out.print(i);
//			}else {
//				System.out.print("*");
//			}
//			
//		}
		
		
		
		
		
		
		
	}
	
	public void method15() {
		//구구단2단 ~9단까지 모두 출력하는 중첩 반복문
		
		int dan = 2;
		
		System.out.printf("--- %d 단 --- \n", dan);
		
		
		for(int i = 1; i<=9;i++  ) {
			System.out.printf("%d X %d = %d \n",dan, i, (dan*i)); 
		}
		System.out.println();
		
		
//-====================================================================================		
		
		
		
		for(;dan<=9;dan++) {
			//초기식 앞에 2로 설정되어 있어서 생략  
			 System.out.printf("--- %d 단 --- \n", dan);    //9개의 단 앞에 몇 단인지를 알려주는 문구
				
				
				for(int i = 1; i<=9;i++  ) { 
					System.out.printf("%d X %d = %d \n",dan, i, (dan*i));  //구구단을 2단 부터 9단까지 출력해주는 공식
				}
				System.out.println();
		}
			
		        
		
		
		
		
	}
	
	
	
	
}
 