package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {

		
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.

		//		ex.
//		1 2 3 4 5 6 7 8 9 10
		
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		
		
	}

	
	
	
	
	public void practice2() {
		
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.

//		ex.
//		10 9 8 7 6 5 4 3 2 1
		
		
		int [] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++ ) {
			arr[i] = 10-i;
			System.out.print(arr[i]+" ");
		}
		
		
		
		
	}
	
	
	
	public void pracitce3() {
		
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//		ex.
//		양의 정수 : 5
//		1 2 3 4 5
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int [] arr =  new int[num] ;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	
	public void practice4() {
		
//		길이가 5인 String배열을 선언하고  // 01234
//		“사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		배열 인덱스를 활용해서 귤을 출력하세요.
//		ex.
//		귤
		
		String [] arr = new String[5];
		
	
		
		for(int i = 0; i<arr.length; i++) {
			arr[0] = "사과";
			arr[1] = "귤";
			arr[2] = "포도";
			arr[3] = "복숭아";
			arr[4] = "참외";
			
		} System.out.println(arr[1]);
		
		
		
	}
	
	public void practice5( ) {
		
		
		
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고  -> char
		//검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//		ex.
//		문자열 : application
//		문자 : i
//		application에 i가 존재하는 위치(인덱스) : 4 8 
//		i 개수 : 2
		
	
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 :");
		String str = sc.nextLine();
		
		System.out.print("검색할 문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char [] arr = new char[str.length()]; //문자열에 입력 받아 넣고,
		int sum = 0; //반복되는 갯수를 저장할 값
	
		System.out.print(str+"에"+ch+"가 존재하는 위치 : ");
		

		for(int i = 0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			if(arr[i]==ch){
				System.out.print(i+" ");
				sum++;
			}
			
		    }
		    System.out.println();
		    System.out.println(ch+"의 개수 : "+sum);
		    	
	}
	
	public void practice6( ) {
		
//		“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		
//		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
//		ex.
//		0 ~ 6 사이 숫자 입력 : 4 0 ~ 6 사이 숫자 입력 : 7
////		금요일 잘못 입력하셨습니다.
		
		String [] arr = new String[7];
		
		arr[0] = "월요일";
		arr[1] = "화요일";
		arr[2] = "수요일";
		arr[3] = "목요일";
		arr[4] = "금요일";
		arr[5] = "토요일";
		arr[6] = "일요일";
	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~6사이 숫자 입력");
		int num = sc.nextInt();
		
		if(num>= 0 && num<7) {
			System.out.print(arr[num]);
			} 			else {
			System.out.println("잘못입력하셨습니다.");
		}
	
	
	
	
	
}
	
	
	public void practice7( ) {
		
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//		ex.
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2
//		총 합 : 2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");  //arr은 길이 3/ 인덱스 012
		int num = sc.nextInt();
		
		int [] arr = new int[num];
		
		int sum= 0;
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을 값 : ");	
			int num2 = sc.nextInt();
			arr[i] = num2;
			}
			
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
			sum =+ arr[i];
		}
		System.out.println();
		System.out.println("총합 : "+sum);

		

		
		
	}
	
	public void practice8() {
		
//		3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.

		//		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		다시 정수를 받도록 하세요.
//		ex.
//		정수 : 4
//		다시 입력하세요.
//		정수 : -6
//		다시 입력하세요.
//		정수 : 5
//		1, 2, 3, 2, 1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int [] arr = new int[num];
		
		if(num<3 || num%2==0) {
			System.out.println("다시입력하세요");
			practice8();
		} else{
			for(int i = 0; i<arr.length; i++) { //중간 숫자 : 5 ->2, 7 -> 3,  9->4, 11-> 5 .... => 숫자를 2로 나눴을때 몫의 값.
				arr[i] = i+1;                    
			
			}
			int value = 1;	
			for(int i = (num/2)+1 ; i<arr.length; i++) { //중간값 : 2로 나눈 후  1을 더한 값이 중간의 시작지점이 됨
				arr[i] = (num/2)+1 -value;
				value++;
			}
		
			for(int i =0 ; i<arr.length; i++) {
				System.out.print(arr[i]+(i==arr.length ? "" : ", ") );
			
			}
			
		} 
		
		
		
		
	}
	
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
//		사용자가 입력한 값이 배열에 있는지 검색하여
//		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//		단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
//		ex.
//		치킨 이름을 입력하세요 : 양념 치킨 이름을 입력하세요 : 불닭
//		양념치킨 배달 가능 불닭치킨은 없는 메뉴입니다
		
		
		//치킨메뉴 배열 만들고, 사용자에게 입력 받기
		//값이 있는지 없는지는? for문을 통해 확인하기
		
		String [] menu = {"양념", "후라이드", "고추바사삭", "레드콤보"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String chi = sc.nextLine();
		
		for(int i =0; i<menu.length; i++) {
			if(menu[i].equals(chi)) {
				System.out.println(chi+"치킨 배달 가능");   //else를 사용하면 안됨, 인덱스는 0부터 검사하기 때문에 만약 레드콤보를 입력했다면 같지 않다고 나옴.
				return;
			}
			}		
		System.out.println(chi+"치킨은 없은 메뉴입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	


