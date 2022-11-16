package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {

	/*
	 * 분기문 : break, countinue
	 * -> 단독적으로 혼자서는 사용을 하지 못하고, 반복문과 함게 사용해야함
	 * 
	 * break; : break문을 만나는 순간 현재 속해있는 반복문을 빠져나감.
	 * -> 즉, 가장 가까운 반복문만 빠져나감
	 * 
	 * 주의할 점 : switch문 안의 break와는 다른 개념
	 *           switch문 안의 break는 해당 switch문만 빠져나가는 용도.
	 *           
	 * 
	 * 
	 */
	
	public void methid1() {
	 //매번 반복적으로 발생되는 랜덤값(1~100) 출력
	//그 랜던값이 3의 배수일 경우에만 반복문을 종료
		
		while(true) {
			//랜덤값 뽑아오기
			int random =(int)(Math.random()*100+1);
			
			//랜덤값 출력
			System.out.println("random : "+random);
			//랜덥값이 3의 배수인지 검사.
			if(random%3==0){    //케이스에 따라서 한 번만 추출될 수도 있고, 여러번 추출될 수도 있음.
				break;   
			}
		}
	 
	 
 }
	
	public void methid2() {
		
		//매번 사용자에게 문자열을 입력 받은 후, 해당 문자열의 길이를 출력하라. => 무한반복문 , 입력유도문을 while밖에 입력하면 매번 반복이 안됨.-> 안에 입력
		//단, 사용자가 입력한 문자열이 "exit"인 경우 반복문을 종료.
		
		
		Scanner sc = new Scanner(System.in);
		
		//문자열의 경우 동등비교 연산이 불가능 하기 때문에 반드시!!! str.equals("") 메소드를 사용해줘야 함.
		
		
		while(true) {
			System.out.print("문자열 입력 : ");     //매번 사용자에게 입력받기 때문에 while문 안에 입력해야함.
			String str = sc.nextLine();
			
			if(str.equals("exit")) {    //사용자가 입력한 문자열이 exit인경우 반복문 종료
				break;
			}
			
			System.out.println(str+"의 길이는 : "+str.length());
		}
		
		
		
		
		
	}
	
	
	public void methid3()  {
		//매번 반복적으로 사용자에게 양수를 입력 받아 1~사용자가 입력한 수까지 출력
		//다만 정상적으로 양수를 입력했을 시, 1~사용자가 입력한 수까지 출력을 하고 종료.
		
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("양수입력 : ");
			int num = sc.nextInt();
			
			if(num>0) { //양수로 제대로 입력한 경우 ->1 부터 num까지 출력 후 종료.
				for(int i =1; i<=num;i++) {
					System.out.print(i+" ");
				}
				break;
			}
			
			
		 else {                                         //잘못 입력시 -> 다시 입력하라는 출력문 ->
			System.out.println("잘못입력했습니다. 다시 입력하세요.");
		}
	
		
		
		
		
	}
	
	}
}
	
	
	

