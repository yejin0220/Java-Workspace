package com.kh.chap03.branch;

public class B_Continue {

	/*
	 * countinue : 반복문 안에서 사용하는 구문
	 *             countinue를 만나게 되면, 그 뒤에 어떤 코드가 있든간에 실행하지 않고 가장 가까운 반복문으로 올라감.
	 *              
	 * 
	 * 
	 */
	
	
	public void method1() {
		//1부터 10까지 홀수만 출력
		// 1 3 5 7 9
		
		//방법1
		for(int i = 1; i <10; i+=2) {
			System.out.print(i+" ");
		}
		
		//방법2
		for(int i =1; i<10; i++) {
			if(i%2 ==1) {
				System.out.print(i+" ");
			}
		}
		
		//방법3
		for(int i = 1; i < 10; i++) {  //i값이 1부터 9까지 1씩 증가함
			if(i%2==0) {               //만약 i값을 2로 나눴을때 0이 나온다면 참이기 때문에 컨티뉴 문을 만나서 다음 증감식 실행
				                      //만약 i값을 2뤄 나눴을때 0이 아니라면, 거직이기 때문에 컨티뉴문을 만나지 않고 출력문으로 빠져나간후, 다음 증감식 실행
				continue;
			}
			
			System.out.print(i+" ");
		}
		
		
	}
	
	
	
	public void method2() {
		
		
		//1부터 100까지의 총 합계
		//단, 6의 배수값은 뺴고 더해보기
		//continue문을 활용해서 코드를 작성
		//총 합계는 : 
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i%6 ==0) {
				continue;
			}
			sum+=i;
			
		}System.out.println("총 합계는 : "+sum);
		
		
	}
	
	
	
	public void method3() {
		
		//2단 부터 9단까지 출력을 하되
		//4의 배수단은 빼고 출력 하시오.
		
		for(int i =2; i<=9;i++) {
			if(i%4==0) {
				continue;
			}
			System.out.println("======================"+i+"=========================");
			for(int j=1;j<10;j++) {
				
				System.out.printf("%d X %d = %d \n",i,j,(i*j));
			}
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
