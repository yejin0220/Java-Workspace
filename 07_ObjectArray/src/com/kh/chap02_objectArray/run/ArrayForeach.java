package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForeach {

	public static void main(String[] args) {
		
		//배열의 반복문
		int [] arr = {10, 20, 30};
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		/*
		 * 지금까지 사용했던 반복문 : for loop, 기본 반복문
		 * 새롭게 배울 반복문 : 향상된/개선된 for반복문
		 * 
		 * for each문(향상된 for문, 개선된 for문)
		 * 배열 또는 컬렉션과 사용됨
		 * 배열 또는 컬렉션의 0번 인덱스부터 마지막 인덱스 까지 순차적으로 접근할 목적일때
		 * 
		 * 초기식, 조건식, 증감식 없음
		 * 반복하는 횟수는 배열 또는 컬렉션의 크기.
		 * 
		 * [표현법]
		 * for(순차적으로 접근한 값을 담아줄 변수 선언 : 순차적으로 접근할 배열/컬렉션) { //콜론(:)을 기준으로 우측에는 내가 반복하고싶은 배열, 좌측에는 값을 대입하고자 하는 변수.
		 * 	실행할 코드
		 * }
		 * 
		 * 
		 * 
		 */
		
		
		
		int [] arr2 = {40, 50, 60};
		
		for( int num  : arr2  ) { //arr2라는 배열의 0번 인덱스 부터 순차적으로 접근하면서 int num이라는 변수에 
			                      //arr2의 각 인덱스의 값을 저장함.
			System.out.println(num);
		}
		
		
		
		
		
		///만들어둔 phone객체로 향상된 반복문
		
		Phone[] phones = new Phone[3];
		
		//phone객체배열 초기화
		phones[0] = new Phone("갤럭시","z플립3","삼성",1000000);
		phones[1] = new Phone("갤럭시","z플립4","삼성",1350000);
		phones[2] = new Phone("갤럭시","폴드","삼성",2000000);
		
		//총 합계와 평균값 구하기
		int sum =0;
		for(Phone phone : phones) { //phone객체의 phone변수 선언
			System.out.println(phone.information());
			sum += phone.getPrice();
			
		}
		
		
		
		
		//사용자에겍 구매하고자 하는 폰의 이름을 입력 받고
		//구해마고자 하는 핸드폰이 phones배열에 있으면 "00핸드폰의 가격은 000원입니다."
		//없다면 "해당핸드폰이 없습니다.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 폰 입력 : ");
		String series = sc.nextLine();
		
		int count = 0;
		for(Phone phone : phones) {
			if(phone.getSeries().equals(series)) {
				System.out.printf("%s핸드폰의 가격은 %d입니다.",phone.getSeries(),phone.getPrice());
				count++;
				break;
				
			}
		}if(count ==0) {
			System.out.println("해당핸드폰이 없습니다.");
		
	
		}
		
		
	}

}
