package com.kh.chop2.loop;

import java.util.Scanner;

public class B_While {
	
	/*
	 * while문
	 * [표기법]
	 * 
	 * [초기식;] //필수가 아님 
	 * while(조건식) { //조건이 true일 경우 해당구문들을 반복적으로 실행, 조건식 내용에 true를 작성시 무한 반복함
	 *        반복적으로 실행할 코드
	 *        [증감식]; //필수는 아님
	 * }
	 * 
	 * 
	 * for문과 다르게 초기식, 증감식이 필수가 아님
	 * 
	 * 분기문에서 초기식, 증감식없이 작성하는 법을 배울 예정
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public void method1( ) {
		
		//for문을 while문으로, while문을 for문으로 표현할 수 있음
		
		//[for]문
		for(int i = 0; i<5; i++) {
			System.out.println("안녕하세요.");
		}
		
		
		//[while]문
		int i = 0; //초기식 작성
		while(i<5) { //조건식 작성
			System.out.println("안녕하세요.");
			i++;//증감식 작성
		}
		
		
		System.out.println("i : "+i);  //=> while문에서 처리된 i의 값은 5 => 4까지 증감되었을때는 true로 문장이 출력됨
		                                                             //5까지 증감된 후 false가 나오기 때문에 while문 벗어남
		                                                            //최종값은 5
		
		
		
		
		
		
	}
	
	
	
	public void method2( ) {
		//1~10사이의 정수중 홀수만 출력하시요
		
		//1.for
		for(int i = 1; i<=10; i++) {
			if(i%2 != 0){
			System.out.print(i+ " ");
		}
		}
		
		
		
//		for(int i = 1; i<=0; i+=2) {
//			System.out.print(i+" ");
//		}
		
		
		
		
		System.out.println();
		
		//while
//		int i =1;
//		while(i<=10) {
//					
//			if(i%2 != 0) {
//				 System.out.print(i+" ");
//				
//			}
//			i++;
//		}
		
		int i =1;
		while(i<=10) {
			System.out.print(i+" ");
			i+=2;
		}
		
		
	}
	
	
	public void method3( ) {
		
		//1부터 랜덤값(1~100이하)까지의 총 합계를 구하여라
		
		int random = (int) (Math.random()*100+1);
		//0.0 <= 랜덤값 < 100.0
		//1.0 <= 랜덥값 <101 -> 10을 곱하고 1을 더해준 값
		//int로 형 변환을 해주기 때문에 1 <= random < 101으로 1~100까지 랜덤값 형성
		
//		int sum = 0;
//		int i = 1;
//		while(i<=random) {
//		
//			sum += i;
//			i++;
//		}
//		System.out.println("1부터 +"+random+"까지의 총 합계 : "+sum);
		
		
		
		int sum = 0;
		while(random>0) {  //만약 랜덤값이 5라면 감소연산으로 54321이 되어 0이 되면 종료.
			sum += random--; //랜덤값이 후위 연산이 되어, 5부터 4,3,2,1으로 감소되어 모두 계산될 예정.
		}
		
		System.out.println("1부터 +"+random+"까지의 총 합계 : "+sum);
		
		
		
	}
	
	
	
	public void method4() {
		//A_For 10번 매서드를 while문으로 바꾸기
		
		//각 사용자에게 문자열을 입력받아서
				//각 인덱스별로 문자를 하나씩 뽑아서 출력
				
				
			   //apple의 길이 : 5
			   //01234	
				
			   //kiwi 길이 : 4	
			   //0123
				
				//마지막 인덱스는 문자열의 길이에 -1
				//추출하고자 하는 인덱스의 값의 범위는 0~(문자열의 길이 -1)까지 매번 1씩 증가
				
				
//				Scanner sc = new Scanner(System.in);
//				System.out.println("문자열 입력 : ");
//				String str = sc.nextLine();
//				
//				//문자열의 길이를 알려주는 메소드 : 
//				System.out.println("문자열의 길이 : "+str.length());
//				
//				for(int i = 0; i<str.length(); i++) {
//					System.out.println(str.charAt(i));
//				}
		
		
		
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("문자열의 길이 : "+str.length()); //마지막 인덱스의 숫자는 문자열 길이 -1한 값.
		
		int i = 0;
		while(i<str.length()) {
			System.out.println(str.charAt(i));
			i++;
		}
		
		
	
		
	}
	
	public void method5() {
		
		/*
		 * do- while 문
		 * 
		 * [표현법]
		 * do { //조건 검사 없이 무조건 1번 do(실행!) => 조건이 맞지 않더라도 반드시 한번은 수행
		 *    실행할 코드
		 *    }while(조건식); // 조건식의 결과가 true면 실행할 코드를 다시 실행
		 *                  // 조건식의 결과가 false면 반복문을 빠져 나온다.
		 *                  
		 *                  
		 *for/while문과 do-while문의 차이점.
		 *-for/while문 : 처음 시작할때부터 조건검사를 하고, 반환 값이 true여야 실행을 함.
		 *-do-while문 : 첫 실행은 무조건 조건검사 없이 실행함.                  
		 *    
		 * 
		 * 
		 */
		
		
		
		//조건식이 맞지 않은 경우에 do-whilw문 테스트
		
		int num = 9000;
	 
		do {
			System.out.println("하잉");
		 
		}while(num == 0);
		
		
	}
	
	
	public void method6() {
		
		
		//1 2 3 4 5 출력해보기
		
		int i =1;
		
		do {
			System.out.print(i++ + " ");   //()안에 내용을 실행시키고자 할 때만 사용하는게 do-while
		}while(i<=5);
		
		
		
		
		
	}
	
	
	public void method7() {
		
		// 1~사용자가 입력한 숫자까지 총 합께
		//do while문 사용
		//"1부터 x까지의 총 합계 : xx"
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		do {
			sum += i++;     //sum은 총 합계를 계산해야하고 i값은 1부터 1씩 증가해야함 
			                 //sum += i; i++;로 코드를 작성해줘도 되지만 조금 더 간편하게 하기위하여 sum+=i++; 
			                 // -> 후위연산 증감처리해줘도 됨 => sum에 i값을 대입한뒤에 i값을 증감처리함.
			}while(i<=num);
		
		
		
		System.out.printf("1부터 %d까지의 총 합계 : %d \n ",num, sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
