package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class C_DimensionalArray {
	
	//이차원 배열 : 일차원 배열 여러개를 하나로 묶은 것
	
	public void method1() {
		
		//일차원 배열 선언
		int [] arr1;
		int arr2[];
		
		//이차원 배열 선언
		int [] [] arr3;
		int arr4 [] [];
		int [] arr5 [];
		
		//이차원 배열 선언과 동시에 할당
		int [] [] arr = new int[3][5]; 
		System.out.println(arr); //주소값 출력
		System.out.println(Arrays.toString(arr[0])); //주소값 출력
		System.out.println(arr[0][0]); //값 출력
		
		System.out.println("행의 길이 : "+arr.length); //arr은 이차열 배열, 3개의 행에 5개의 열이 들어가 있음.//각 행에 5개의 방이 입력되어있음.
		
		//각 행별 열의 길이?
		System.out.println("0번 행의 열의 길이 : "+arr[0].length);
		System.out.println("1번 행의 열의 길이 : "+arr[1].length);
		System.out.println("2번 행의 열의 길이 : "+arr[2].length);
		
		/*
		 * 출력(arr[0][0]) -> 1행 1열
		 * 출력(arr[0][1]) -> 1행 2열
		 * ...
		 * 출력(arr[0][4]) -> 1행 5열
		 * --------------------------------------
		 * 
		 * 출력(arr[2][4]) -< 3행 5열
		 */
		
		//각 행과 열을 순회하며 원하는 출력문을 출력해주는 반복문
		//외부(바깥쪽) for문 => 행에 대해 지정(0행~2행) == (0행~행의크기-1) == (0행.length-1)
		//내부(안 쪽) for문 => 열에 대해 지정(0열~0열) == (0열~ 각 행별 열의크기-1) == (0열~arr[행의 인덱스].leght-1)
		for(int i = 0; i < arr.length; i++) { //행을 반복하는 외부반복문
			for(int j=0; j<arr[i].length; j++) { //각행별 열에 접근할 수 있는 내부 반복문
				System.out.println(arr[i][j]+" "); //arr의 i번째 행, j번째 열
				
			}
			System.out.println();
		}
		
		
		
	}
	
	
	
	public void method2() {
		
		//순서대로 1 2 3 4 ...15 값을 넣어보기
		int [][]arr = new int[3][5]; //arr[0][0] =1; arr[0][1] = 2;...arr[2][4] =15 //2 3 = 14 02->303-?404->5 11->6 12->7
		
		//행을 반복하는 외부 반복문
		int num =1;
		for(int i =0; i< arr.length; i++) { //행을 3번반복하는 반복문.
			for(int j =0; j<arr[i].length; j++) {
				arr[i][j]= num;
				num++;
//				System.out.print(arr[i][j]+" ");
				System.out.printf("%-3d",arr[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
	public void method3() {
		//일차원 배열 선언 및 할당과 동시에 초기화
		int []arr = {1,2,3,4,5};
		
		
		//이차원 배열 선언 및 할당과 동시에 초기화
		int [][] arr2 = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}}; //가장 안쪽의 중괄호 : 행의 크기, 그 안에 선언된 값 => 열의 크기
		
		for(int i = 0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+"\t");  //\t : 콘솔창에서 tap의 한번 공간만큼 공백이 생김 //\n은 공백
			}
			System.out.println();
		}
		
	
	}
	
	public void method4() {
		/*
		 * 가변 배열
		 * 행의 크기는 정해져 있으나, 각각의 행렬로 열의 갯수가 정해져 있지 않은 상태
		 * 이차원 배열 == 일차원 배열 여러개를 묶어놓은 형태
		 * 
		 * 즉, 묶여 이쓴 일차원 배열의 길이가 꼭 같을 필요는 없다.
		 * 
		 * 
		 * 단, 행의 크기는 생략이 불가능하고 반드시 지정해야 한다.
		 * 열 크기는 생략이 가능하다. 각행의 열의 길이가 변경 가능함.
		 * 
		 * 
		 * 
		 * 
		 */
		 
		int [][]arr = new int[3][]; // 행의 크기는 3으로 가변 배열을 만듦
		
		System.out.println(arr);             //arr의 주소값
		System.out.println(arr[0]);          //int형 2차형 배열에는 기본값이 0이 아니라, null값으로 초기화가 됨
		System.out.println(arr.length);
		//System.out.println(arr[0].length); //값을 할당해주지 않은 상태에서 length는 값이 없고 null이 입력되어 있기때문에 오류가 남.
		//아직 각 행별로 열의 크기가 지정되지 않았으믈 null값이 대입된 상태에서 특정 인덱스로 접근하려 했기 때문에 NullPointerException이 발생.
		
		arr[0] = new int[2]; // 0 0
		arr[1] = new int[] {5,6,8};
		arr[2] = new int[4];
		
		/*
		 * 00
		 * 568
		 * 0000
 		 */
		
		int value =1;
		for(int i=0; i<arr.length; i++) { //최대 행의 갯수까지 반복
			
			for(int j = 0; j<arr[i].length; j++) { 
				arr[i][j]= value++;
				
			}
			
		}
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
		
		
	}
	
	public void method5() {
		
		//char형 가변배열
		//char [] [] 가변 배열 생성
		
		char[][]arr= new char[3][]; //현재 열에는 값이 저장되어 있지않기 때문에 null이 저장되어있음
		
		/*
		 * a b c -> arr[0]
		 * d e   -> arr[1]
		 * f g h i j k ->arr[2]
		 * 
		 */
		
		//가변길이 2차원 배열 설정
		arr[0] = new char[3];
		arr[1] = new char[2];
		arr[2] = new char[6];
		
		char value = 'a';  //int와 char간의 동등비교를 통해 열에 값을 대입해주어야 함., 아스키코드로 보면 a는 65, b는 66 ...
		for(int i=0; i<arr.length; i++) { 
					
					for(int j = 0; j<arr[i].length; j++) { 
						
						arr[i][j] = value++;
						value = (char)(value+1); 
						System.out.print(arr[i][j]+"\t");
					}
					System.out.println();
				}
		
		
		
		
		
		
		
	}
	
	
	public void method6() {
		//3행 3열자리 string[][] 배열 생성 후
		//중첩 반복문을 이용해 현재 행, 열의 순번(인덱스)값이 몇인지 출력?
		//(0,0) (0,1) (0,2)
		//(1,0) (1,1) (1,2)
		//(2,0) (2,1) (2,2)
		
		String [] [] arr = new String[3][3];
		
		for(int i = 0; i<arr.length; i++) { 
			
			for(int j = 0; j<arr[i].length; j++) {
				
				System.out.printf("(%d,%d) ", i,j);
			}
			System.out.println();
		}
		
		
	}
	
	public void method7() {
		//int형 2차원 배열을 만들어
		//0번행 국어점수를 3개 입력 받고
		//1번행에는 영어점수를 3개 입력 받은 후
		//각각 반복문을 활용해서 출력
		//입력 예시 : ***점수를 입력하세요 :
		//출력 예시 : **점수 : ** ** ** 
		 
		Scanner sc = new Scanner(System.in);
		
		int [][] arr = new int[2][3];  //(0,0) (0,1) (0,2)
									  //(1,0) (1,1) (1,2)
		
		
		for(int i = 0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++ ) {
				if(i==0) {
					System.out.print("국어점수를 입력하세요 : ");
					int kor = sc.nextInt();
					arr[i][j] = kor;	
				} else{
					System.out.print("영어점수를 입력하세요 : ");
			    	 int eng = sc.nextInt();
			    	 arr[i][j]= eng;
			    	 			
			    	 
			}
		   		
		}

	
		}System.out.printf("국어점수 : %d %d %d \n",arr[0][0],arr[0][1],arr[0][2]);
		System.out.printf("영어점수 : %d %d %d \n",arr[1][0],arr[1][1],arr[1][2]);
		
		
		
	}
	
	
	}


		
		
		
		
		
		
		
		
		
		
		
		
	
	
	

