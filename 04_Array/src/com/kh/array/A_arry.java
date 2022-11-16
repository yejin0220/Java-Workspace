package com.kh.array;

import java.util.Scanner;

public class A_arry {

	/*
	 * 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	 *        ex) int a= 10;
	 *            a = 20 ; -> 10이라는 값은 사라짐
	 *           
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있음 (단, 같은 자료형의 값으로만 가능)
	 *       정확히 말하자면, 배열의 각 인덱스 자리에 실제값이 담김(인덱스 0 부터 시작)
	 *       예) int[] a = new int[3]  => int형의 자료가 들어갈 수 있는 공간을 3개 만든다.
	 *                                => 방, 사물함 [0] [1] [2]을 3개 만듬/ 이곳에 int값을 저장
	 *                                => 인덱스는 항상 0부터 시작한다.(중요!)
	 *                                => 배열의 크기 : 3 / 마지막 인덱스 : 2
	 *                                => 만약 배열의 크기가 100이라면? 마지막 인덱스는 99
	 *                                => 항상! 배열의 크기가 n이라면? 마지막 인덱스는 (n-1)
	 *           
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	public void method1() {
		// 배열을 왜 써야할까?
		// 만약, 변수만을 가지고 프로그래밍을 하게 되면
		// 0, 1,2, 3, 4 라는 숫자를 각각 기록 할ㄸ때?
		
		/*
		 * 변수를 이용하여 각각의 데이터를 보관하고자 할때 => 각각의 정수값을 각각의 변수를 만들어서 따로 관리해야함
		 * 
		 * int num = 0;
		 * int num1 = 1;
		 * int num2 = 2;
		 * int num3 = 3;
		 * int num4 = 4;
		 * 
		 * 출력시 일일이 출력해야하고 반복문 사용이 안됨
		 * 
		 * 
		 * 
		 * for(int i = 1; i<=5; i++){
		 *    System.out.println(num+i);     => 실행 안됨
		 *    }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 배열 사용시
		 * 1. 배열을 가지고 프로그래밍 하기
		 * 0. 1 2 3 의 데이터를 저장해야한다
		 * 
		 * 1) 배열선언방법
		 * [표현법]
		 * 자료형 [] 배열명;
		 * 자료형 배열명 [];
		 * int a; => 변수
		 * int [] a; => 배열
		 * int a []; => 배열
		 * 자료형의 값은 고정!
		 * 
		 * 
		 * 
		 * 2) 배열 할당
		 * 이 배열에 몇 개의 값들을 보관할건지, 배열의 크기를 지정해주는 과정
		 * 지정한 객수만큼 값이 들어갈 방이 생성됨.
		 * 
		 * [표현법]
		 * 배열명 = new 자료형[배열의 크기]
		 * ex) a = new int[5] 
		 * 
		 */
		
		int [] arr = new int[5]; //기본적으로 stak영역에 int[]arr이라는 값이 저장됨
		                         //new를 선언하면 heap영역에 배열의 크기만큼 값이 할당됨(데이터 값이 저장됨)
		                         //값을 설정하지 않는다면 0으로 초기화 되어 저장됨
		
		//System.out.println(arr[0]);
		
		
		/*
		 * 3. 배열의 각 인덱스(=방번호) 자리에 값 대임
		 * 
		 * [표현법]
		 * 배열명[인덱스] = 값;
		 * 
		 * arr[0] = 0;
		 * arr[1] = 1;
		 * arr[2] = 2;
		 * arr[3] = 3;
		 * arr[4] = 4;
		 * 
		 */
		
		
		//배열의 가장 큰 장점 : 반복문을 활용할 수 있다.
	
		for(int i = 0; i<5; i++) {
			//0 1 2 3 4 
			arr[i] = i;       
		}
		
		
		//배열의 for문을 활용해 값을 입력, 출력도 가능함
		for(int i = 0; i<5; i++) {
			System.out.printf("%d번 인덱스의 값은 : %d \n", i,arr[i]); 
		}
		
		
		//각각의 인덱스 값을 확인하기 위해서는 []블럭을 통해 내가 확인하고자 하는 인덱스(방번호)를 제시해줘야함.
		//만약 arr에 담겨있는 전체 값을 확인하고 싶다면?
		System.out.println(arr);  //  => [I@1888ff2c 실제 arr이 heap에 저장되어 있는 주소값
		                         //실제 배열(arr)이라는 값에는 주소값이 담겨져 있음
		                         //@를 기준으로 우측은 참조하고 있는 heap영역의 주소값
		                        // [ : 배열을 의미
		                        //I : int자료형을 의미

		
		
	}
	
	
	
	
	public void method2() {
		
		int i = 10; //일반 변수, stack영역에 i는 10이라는 값이 그냥 담겨있음.
		
		int [] arr = new int [5]; // 배열 자료형// 5칸짜리 배열이 방이 생성되고 그 안에 0으로 값이 할당되어 있음
		
		/*
		 * 우선 대입 연산자 기준 왼쪽이 먼저 실행되므로 arr이라는 int형 배열 박스가 먼저 만들어짐(stack영역에)
		 * 그 다음 int[5] (5칸 짜리)방이 heap영역에 생성됨(new라는 키워드가 붙은 녀석은 heap영역에 값이 할당됨)
		 * 5칸 짜리 방이 만들어진 후에 각 방에 기본값으로(int 0)으로 데이터가 초기화 되고, 주소값이 할당됨(0x123)
		 * 마지막으로 대입연산자가 실행되면서 주소값이 arr에 할당됨
		 * 
		 * 
		 * 
		 */
		
		System.out.println("i : "+i);
		System.out.println("arr :"+arr);  //본인의 주소값 그대로 출력
		System.out.println("arr의 해시코드 값 : "+arr.hashCode()); 
		//해시코드 : 주소값을 10진수의 형태로 변환해준 것 
		
		
		double[] dArr = new double[3];  //drr에는 new double의 고유한 주소값이 출력
		System.out.println(dArr);
		System.out.println("dArr의 해코드값 : "+dArr.hashCode());
		
		
		/*
		 * 기본자료형(boolean, char, sbyte, short, int, long, float, doubld)
		 * =>실제 값(리터럴)을 바로 stack영역에 담을 수 있는 변수 => 일반 변수
		 * 
		 * 그 외 자료형(int[], double[]. short[] ....,String, Scanner, ....그외 클래스 모두)
		 * =>실제 주소값을 담고 있는 변수 => 참조 변수(레퍼런스 변수)
		 * 
		 * 
		 * 
		 */
		
		
		
	}
	
	public void method3() {
		
		int [] iArr = new int[3];  //iArr의 모든 인덱스는 0으로 초기화 되어 있음.
		
		double []  dArr = new double[3];
		
		
		for(int i = 0; i < iArr.length; i++) { //iArr의  길이까지를 출력
			System.out.println(iArr[i]);//iArr에 담겨있는 각 인덱스의 값을 출력
		}
		
		
		
		for(int i = 0; i<dArr.length; i++) {
			System.out.println(dArr[i]);
		}
		
		
		
		/*
		 * 내가 각 인덱스를 초기화 하지 않았는데도 0이라는 값들이 담겨져있는 이유?
		 * -> heap이라는 영역에는 절대로 빈공간이 존재할 수 없음
		 * -> 따라서 jvm이 각 공간에 각 자료형의 기본값으로 초기화(대입)을 시켜줌.
		 * -> heap영역에 담기는 자료형들은 jvm이 자동으로 기본값을 대입
		 * int 는 0으로, doubld은 0.0으로....
		 * 
		 * 배열의 크기를 아는 방법 : 배열명,lenght
		 * 
		 *
		 */
		
		
		
		
		
		
		
	}
	
	
	
	
	
	public void method4() {
		
		int[] arr = new int[5];
		
		//각 배열의 인덱스에다가 값을 대입하는 반복문 마들기
		for(int i = 0; i<arr.length;i++) { 
			arr[i] = i+1; // arr[0]=1, arr[1]=2, arr[2]=3, arr[3]=4, arr[4]=5 모든 방에 접근해 값을 대입할 수 있음
			
		} System.out.println(arr[4]); //-> 마지막 인덱스에 입력되어 있는 값은?
		                               //마지막 인덱스의 숫자는 길이-1 : arr의 크기(길이는) 5이고, 마지막 인덱스의 값은 길이-1이므로 4가 출력
		/*
		 * 가장 많이 보이는 오류
		 * 
		 * ArrayIndexOutOfBoundExecption 
		 * 배열의 인덱스를 벗어나서 생기는 오류
		 * 따라서 해당 인덱스 안에 있는 값으로 인덱스를 설정해줘야 함
		 * 
		 */
		
		
		
		
		
	}
	
	
	public void method5() { 
		
		int i = 0;
		String str = null;
		
		// int i2 = null; -> typeMissMath : null값을 int자료형에 넣을 수 없음
		
		int[]arr = null; // null값을 할당할 수 있음
		                 //주소값을 담을 수 있는 변수의 기본값은 null;
		                 //int형 배열을 null값으로 초기화 시킴
		
	
		//System.out.println(arr.hashCode()); //int자료형에 null값이 대입되어 있는것이지 heap영역에 주소가 생성된게 아니기 때문에 주소값을 가져올 수가 없음
		/*
		 * => 무조건 오류가발생
		 * 기본값이 null인 변수를 가지고 메소드를 호출한다거나, 특정 어딘가에 접근하고자 한다면 무조건 오류발생
		 * ->NullPointerException
		 * ex)arr.hashCode(), arr.leght() 등
		 * 
		 * 
		 */
		
		
		
		
		
	}
	
	
	public void method6() {
		
		int [] arr = new int[5]; //크기가 5인 int형 배열 선언
		
				/*반복문 활용
				 * arr[0]=2
				 * arr[1]=4
				 * arr[2]=6
				 * arr[3]=8
				 * arr[4]=10
				 * 
				 */
		
				for(int i =0; i<arr.length; i++) { 
					arr[i]= i+(i+2);
				}
				for(int i =0; i<arr.length; i++) {
					System.out.println(arr[i]);
				}
					
		//System.out.println(arr[5]);
			//arr[6] = 100;
			/*
			 * 배열의 가장 큰 단점
			 * 한번 지정한 배열의 크기는 변경 불가능 함
			 * => 배열의 크기를 변경하고자 한다면, 새롱ㄴ 배열을 다시 만들어야함.
			 * 
			 */
			
			
			
			System.out.println("================arr변경전================");
			System.out.println(arr);
			System.out.println("arr의 해시코드 값 : "+arr.hashCode());

		
			arr = new int[7];
			System.out.println("================arr변경후================");
			System.out.println(arr);
			System.out.println("arr의 해시코드 값 : "+arr.hashCode());
			/*
			 * 항상 고유한 주소값 부여, 기존에 생성되었던 주소와 절대로! 겹치지 않는다.
			 * 기존에 참조하고 있던 연결이 끊기고 새로운 곳 참조
			 * 
			 * 연결이 끊어진 기존의 배열은 heap영역에 둥둥 떠다님
			 * 일정 시간이 지나고서도 사용이 되지 않으면 "가비지컬렉터(GC)"가 삭제시켜 줌 => 자동메모리 관리
			 * 
			 * [자동메모리관리]
			 * -자바에서의 특징 : 개발자가 코드에만 신경쓸 수 있게 해줌
			 * 
			 * 
			 */
			
			
			
			//현재 연결되어 있는 고리를 끊고자 할때
			arr= null; //null : 아무것도 존재하지 않음을 의미
			

	}
	
	public void method7() {
		
		//1)배열을 선언과 동시에 할당하기(크기 지정
		int[] arr = new int[4];
		
		//2)각 인덱스에 값을 초기화(대입)
		arr [0] = 1;
		arr [1] = 2;
		arr [2] = 3;
		arr [3] = 4;
	
		
		//배열 선언 및 동시에 초기화(대입) 까지 한 번에 끝내는 방법2가지
		//방법.1
		int [] arr1 = new int[] {1, 2, 3, 4}; //arr1은 크기가 4인 배열이 생성되어 있고 각 인덱스 안에 1,2,3,4 값이 저장되어 있음
		
		//방법.2(조금 더 단순화)
		int [] arr2 = {1, 2, 3, 4 }; //arr1은 크기가 4인 배열안에 1,2,3,4 값이 저장되어 있음
		
		
		//동등비교
		System.out.println(arr1==arr2); //false
		//arr1 : arr1의 heap영역의 "주소값"
		//arr2 : arr2의 heap영역의 "주소값"
		//즉, 주소값 == 주소값 : 주소값 간의 동등비교를 수행하기 때문에 결과는 무조건 false
		//각 배열이 가지는 주소는 모두 고유한 각자의 주소를 가지고 있다.
		
		
		
	}
	
	
	
	public void method8() {
		//1. 크기 10짜리 정수 int형 배열 선언
		//2. 반복문을 활용해서 0번 인덱스 부터 마지막 인덱스 까지 순차적으로 접근하기
		//3. 값을 대입 : 랜덤값으로(1~100)
		//4. 반복문을 활용해서 0~마지막 인덱스 까지 배열에 담긴 값 출력하기
		//5. 출력예시 : arr[x] : xx
		
		
	
		
		int [] arr = new int[10];	
		

		for(int i = 0; i<arr.length ; i++) {
			arr[i] = (int)(Math.random()*100+1);  //arr자체가 정수로 선언되어 있기 때문에 따로 random변수를 선언하지 않아도 됨.
		}
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.printf("arr[%d] : %d \n",i, arr[i]);
		}
		
	
		
		
	}
	
	
	
	
	public void method9() {
	
		//1. 사용자에게 매번 키의 정보를 입력받은 후 해당 크기 만큼 문자열 배열 생성
		Scanner sc= new Scanner(System.in);
		
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		
		
		String [] arr = new String[size]; //사용자가 입력한 값 만쿰 문자열 배열 생성
		
		//2. 반복문을 사용해, 매번 사용자에게 과일명을 입력 받아 그 값을 모든 인덱스 자리에 대입 //size의 길이만큼 매번 사용자가 입력하게 하고, 입력한 값을 순차적으로 저장
		sc.nextLine();
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print("좋아하는 과일 입력 : ");
			arr[i] = sc.nextLine();
		}
	    for(int i = 0; i<arr.length;i++) {
	    	System.out.println(arr[i]);
	    }
		
	
	}
	
	
	
	public void method10() {
		// 사용자에게 문자열을 하나 입력 받은 후
		//각각의 문자들을 char 배열에 옮겨 담기
		
		//1. 사용자에게 문자열을 입력받기
		
		//2. char배열 생성해두기(배열의 크기는 == 문자열의 길이만큼)
		//3. 문자열에서 각 인덱스별로 문자를 뽑아서 char배열의 각 인덱스에 담기
		//문자열 뽑는 방법 : 문자열.charAt();
		//arr[] = 문자열.charAt();
		//char배열의 각 인덱스에 있는 값들 출력하기.
		
	
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		
		//2.char 배열 생성해두기 
		char[] arr = new char[str.length()];
		
		for(int i = 0; i<str.length(); i++) { 
			arr[i]= str.charAt(i); //arr[0] = 문자열.charAt(0) , arr[1] = 문자열.charAt(1)......
			System.out.println( str.charAt(i));	
		}
		
		
		
		
	}
	
	
	public void method11() {
		// 1. 사용자에게 배열의 길이를 입력 받은 후, 해당 크기 만큼 정수배열 생성
		// 2. 반복문을 활용해서 0번 인덱스 부터 마지막 인덱스 까지 순차적으로 접근하면서 값을 대입
		// 3. 랜덤값(1~100)대입
		
		// 4. 반복문을 활용해서 0번~마지막 인덱스까지 배열에 담긴값 출력과 동시에, 해당 인덱스에 담긴 값이 짝수인 경우 그 값의 총 합 구하기.
		
		
		// 1. 사용자에게 배열의 길이를 입력 받은 후, 해당 크기 만큼 정수배열 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num]; //사용자가 입력한 크기 만큼 정수배열 생성
		
		for(int i = 0; i< arr.length; i++) {  //i는 0부터 사용자가 입력한 정수의 길이까지 1씩증가를 하면서
			arr[i] = (int)(Math.random()*100+1); //i값에 1~100사이의 랜덤값을 대입하고
			
		}
		int sum = 0;
		for(int i = 0; i< arr.length; i++ ) { //각 정수의 길이에 대입된 랜덤값을 출력하면서(먼저 작성되어야 함), 짝수인 경우 총 합을 sum으로 출력한다. 
			System.out.printf("arr[%d] : %d \n",i,arr[i]);
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
		}
		System.out.println("총합은 : "+sum);

	}
	
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
		
		
		double [] heights = new double[3];  //3명까지만 값을 입력 받도록 함.
		
		
		//1. 반복문을 활용해 height배열의 0번 인덱스 부터 마지막 인덱스까지 반복을 진행하면서, 사용자로부터 킹 대한 정보를 입력 받아 각 인덱스에 저장.
		//2. 3명의 키에 대한 정보를 출력 시키면서 동시에 모든 키에 대한 값의 총합을 저장
		//3. 3명의 키의 총합을 출력하고, 3명키의 평균도 출력
		//4. 3명의 키 총합 : , 3명의 키 평균 : (단, 소숫점 첫 번째 자리까지 출력 %.1d)
		
		double sum = 0;
		for(int i = 0; i<heights.length;i++) {  
			System.out.print("키를 입력하시오. : ");
			heights[i] = sc.nextDouble();
		
		} for(int i = 0; i<heights.length;i++) {
			sum+=heights[i];
			System.out.println(heights[i]);
			
		}System.out.printf("3명의 키 총합 : %.1f, 3명의 키 평균 : %.1f \n",sum, (sum/3));
		
		
		
	}
}
