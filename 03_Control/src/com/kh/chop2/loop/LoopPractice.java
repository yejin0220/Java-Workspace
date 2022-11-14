package com.kh.chop2.loop;

import java.util.Scanner;

public class LoopPractice {

public void practice1() {
		
//		사용자로부터 한 개의 값을 입력 받아 
//      1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다. 
		// 만일, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//	
//		ex.
//		1이상의 숫자를 입력하세요 : 4         1이상의 숫자를 입력하세요 : 0
//		1 2 3 4                        1 이상의 숫자를 입력해주세요.
//		                               1이상의 숫자를 입력하세요 : 8
//		                               1 2 3 4 5 6 7 8
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 개의 값을 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = 1; i<=num; i++) {
				System.out.print(i+" ");
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
			practice1();
		}
		
				
	}

	
	public void practice2() {
		
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		
//		단, 입력한 수는 1보다 크거나 같아야 합니다. 
		
//		만일 , 1 미만의 숫자가 입력됐다면  “1 이상의 숫자를 입력해주세요”가 출력되면서 
//		다시 사용자가 값을 입력하도록 하세요.
//	
//		ex.
//		1이상의 숫자를 입력하세요 : 4        1이상의 숫자를 입력하세요 : 0
//		4 3 2 1                       1 이상의 숫자를 입력해주세요.
//		                              1이상의 숫자를 입력하세요 : 8
//		                              8 7 6 5 4 3 2 1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 개의 값을 입력하세요 : ");
		int num = sc.nextInt();
	
		if(num>=1) {
			for(int i =num; i>0; i--) { //i값에 num을 대입 -> 사용자가 입력한 값부터 1까지 1씩 감소.
				System.out.print(i+" ");
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
			practice2();
		}
		
		
		
		
	}
	
	
	public void practice3() {
		

//	1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.

//	ex.
//	정수를 하나 입력하세요 : 8
//	1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
//		int sum = 0;
//		for(int i =1; i<=num ; i++) { //i값이 1부터 num값까지 1씩 증가하면서 반복된다.
//			if(i==num) {
//				System.out.print("=");
//			}else {
//				System.out.print("+");
//			}
//			sum += i;
//			System.out.print(sum);
//		}
//		
//		
		
		
		
		
		
		
		
		
//		
//		int sum = 0;
//		for(int i = 1; i<=num;i++) {
//			if(i==num) {
//				sum += i;		
//				System.out.printf("%d",i);
//				System.out.print("+");
//				if(i==num) {
//
//					System.out.printf("=");
//				}
//
//			}
//		
//	  
//			
//		
//		} System.out.print(sum);
//		
		
		
		
		
		
	}
	
	public void practice4 () {
		
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 
//		만일, 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서
		//=> 모든 숫자들이 양수값이 입력되어야 함.
//		다시 사용자가 값을 입력하도록 하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번쨰 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1>0 && num2>0) {
			if(num2>num1) { //두번쨰 숫자가, 첫번째 숫자보다 클때 : 첫번쨰 4/두번째 8 =? 45678
				for(int i = num1; i<= num2; i++) { //첫번쨰 숫자부터, 두번쨰숫자까지, 1씩 증감하기를 반복
					System.out.print(i+" "); // 4 5 6 7 8
			
				}
			}else { //만약, 첫번째 숫자가 두번째숫자보다 클때  => 첫째 8 / 둘째 4
				for(int i = num2; i<= num1; i++ ) { //두번쨰숫자부터 첫번쨰 숫자까지, 1씩 증감
					System.out.print(i+" "); // 
				}
			}
			
			
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
			practice4();
		}
		
		
		
		
	}
	
	public void practice5 () {
		
		
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.단 , 9를 초과하는 숫자가 입력됐다면
//		“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 단을 입력하세요(숫자만) : ");
		int num = sc.nextInt();
		
		
		if(num>=2 && num<=9) {
			for(int i = num; i<=9; i++) {
				System.out.printf("========================%d단================= \n", num);	
			
				for(int j= 1; j<=9; j++) {
					System.out.printf("%d X %d = %d \n",i, j,(i*j));
				}
			}
		} else {
			System.out.println("9이하의 숫자를 입력해주세요");
			practice5();
		}
		
		
	}
	
	
	public void practice6 () {
		
//		사용자로부터 시작 숫자와 공차를 입력 받아
//		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
//		단, 출력되는 숫자는 총 10개입니다.
//		* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
//		ex) 2, 7, 12, 17, 22 …
//		5 5 5 5 => 여기서 공차는 5
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("공차 : ");
		int num1 = sc.nextInt();
		
		for(int i = 1; i <=10; i++) {
			System.out.print(num+ " ");
			num = num+num1;
		}
	
	
	}
	
	public void practice8() {
		
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		*
//		**
//		***
//		****
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		
		
		for(int i= 1; i<=num; i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	
	public void practice9() {
		
		
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		****
//		***
//		**
//		*
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc. nextInt();
		
		
		for(int i = num; i>=1; i--) {   //사용자가 입력한 값부터 1까지 감소하여 반복해야함.
			for(int j = 1 ; j<=i; j++ ) { //*은 1부터 사용자가 입력한 값까지 반복하여 출력
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
//		
//		for (int i = num; i<=1; i--) {
		
//			for(int j = 1; j<5 ; j++ ) {  ****
//		       System.out.print("*");
//             	} System.out.println();
//		
//		for(int j = 1; j<4 ; j++ ) {  ***
//	       System.out.print("*");
//      	} System.out.println();		
		
		
			
		
	}
	
	
	public void practice10() {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc. nextInt();
		
		
		for(int i = 0; i<num; i++) { // i가 0부터 사용자가 입력한 값 까지 반복
			for(int j = 1; j<num-i; j++) { //만약 4을 입력했다면? -> 1 2 3까지는 공백이 찍힘 
				System.out.print(" "); 
			} 
			
			for(int j = 1; j<2+i ; j++) { // 만약 4를 입력했다면? -> 첫번째for문에서 i값은 3이 설정되어 있기 때문에 2+i는 5 //따라서 1부터 4까지 *이 찍힘
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
 	
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc. nextInt(); //4를 입력하였다.
		
		
		for(int i=0; i<num; i++) {//0 1 2 3 으로 4번 반복할 예정
			
			for(int j = 0; j<i; j++) {//num 에는 4가 저장되어 있으므로 i값은 3 => 0 1 2 에 공백이 추가
				System.out.print(" ");
			}
			for(int j =0; j<num-i;j++) { 
				System.out.print("*");
			}
			System.out.println();
			
					
			
			
		}
		
		
		
		
		
		
		
//		
//			for(int j = 0; j < 4; j++) {  //0 1 2 3    
//				System.out.print("*");   // ****
//			
//		}
//		System.out.println();
//		
//		
//		
//		// ***
//		for(int j = 0; j<1; j++) { //j가 0에 해당된다면 0에만 공백을 추가
//			System.out.print(" ");
//		}
//		for(int j =0; j<3;j++) { //0에는 공백이 찍히고, 12에는 *이 찍힘
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		
//		//  **
//		for(int j = 0; j<2; j++) { //j가 0과 1에 해당된다면 0과1에만 공백을 추가
//			System.out.print(" ");
//		}
//		for(int j =0; j<2;j++) { //0과1에는 공백이 찍히고, 12에는 *이 찍힘
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		
//		
//		
//		
				
		
	}
	
	
	public void practice12() {
		
		
//		ex.
//		정수 입력 : 4
//		 *
//		***
//	   *****
//	  *******
		
		
	Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc. nextInt();  //4를 입력했다면?
		
		for(int i = 0; i<num; i++) {
			for(int j = 0; j<(num-1)-i; j++) { //공백의 값은 3 2 1 순으로 감소되고 있음.
				System.out.print(" ");
			}
			
			for(int j = 0; j<1+2*i; j++) {  //별은 1 3 5 7 9의 순으로 증가되고 있음  //1+2*0 , 1+2*1, ====
				System.out.print("*");
			}
	        System.out.println();
		}
		
		
//		
//		
//		
//		for(int j = 0; j<3; j++) { //j의 값은 0 1 2를 거치며 3번 반복을하고, 공백을 출력
//			System.out.print(" ");
//		}
//		
//		for(int j = 0; j<1; j++) {  //별은 012공백 뒤에 딱 한번만 찍힘
//			System.out.print("*");
//		}
//        System.out.println();	
//		
//        
//        
//        
//        
//        for(int j = 0; j<2; j++ ) { //j의 값은 0과 1에 공백이 출력
//        	System.out.print(" ");
//        }
//        for(int j = 0; j<3; j ++) {//j의 값은 01공백 뒤에 012 *이 세번 출력됨
//        	System.out.print("*");
//        }
//        
//      
//		
//        for(int j = 0; j <1; j ++) {
//        	System.out.print(" ");
//        }
//        for(int j = 0; j<5; j++) {
//        	System.out.println("*");
//        }
//		
//		
		
		
		
	}
	
	
	public void practice13() {
		
		
		
		
	Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc. nextInt();
		
		
		if(num>=2) {
			int count = 0;
			for(int i =2; i<=num; i++) { //2부터 내가 입력한 숫자까지 소수인지 아닌지 검사
				boolean isPrime = true;
				//i값이 소수인지 아닌지 검사(실수 본인과 1을 제외한 그 사이의 숫자들로 나누었을때 나머지가 없을경우 정수, 나머지가 있을 경우 실수)
				for(int j = 2; j<i; j ++) { 
					if(i%j ==0) { //만약 나머지가 0으로 떨어지는 정수
						isPrime = false; //isPirme을 false로 반복문을 종료하고, print문을 실행
					}
				}
				if(isPrime == true) { //만약 나머지가 0으로떨어지는 정수가 없을 경우true값이 나오도록 다시 실행
					System.out.print(i+" ");
					count++;
					
				}
 				//i값이 소수라면 출력을 하고 값을 1증가시킴
			}
			
			
			
			//2부터 제대로 입력을 했다면?
		    System.out.printf("\n2부터 %d까지 소수의 개수는 %d개입니다.", num, count);
			
			
		}else {
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		
		
		
	}
	
	
	public void practice18() {
		
		
		
		
	Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc. nextInt();
		
		
		
		
	
		
//		//  *(공백2, 별 1)
//		for(int j = 0; j<2; j++) { 
//			System.out.print(" ");
//		}
//		for(int j= 0; j <1; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		
//		
//		//공백1/별3
//		
//		for(int j = 0; j<1; j++) { 
//			System.out.print(" ");
//		}
//		for(int j= 0; j <3; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		
//		//공백0 별/5
//		for(int j = 0; j<0; j++) { 
//			System.out.print(" ");
//		}
//		for(int j= 0; j <5; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
		
		
		
		
		
		for(int i =0; i<num-1; i++) {//0 1 2 ..........
			
			
		}
		
		
	}
	
	
	
	
}
