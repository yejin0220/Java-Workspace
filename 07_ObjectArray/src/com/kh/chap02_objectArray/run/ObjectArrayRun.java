package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		Phone[]arr = new Phone[3];	
		
		
		//heap영역안에 arr이라는 객체배열 중 0번으로 이돟, new phone이라는 객체를 새로 생성후 매개변수 4가지의 필드를 생성하고나서  값을 대입함하고 주소값을 넘겨 받음 => arr의 0번인덱스에 주소값 추가
		arr[0] = new Phone(); //0번인덱스에는 새로운 phone객체가 대입되어 있음 
		arr[0].setName("아이폰");
		arr[0].setSeries("12");
		arr[0].setBrand("애플");
		arr[0].setPrice(1000000);
		 
		
		
		//heap영역아네 arr이라는 객체배열 중 1번으로 이동, new phone이라는 객체를 생성됨과 동시에 초기화 및 값대입이 이루어지고, arr1번 인덱스에 주소값 추가
		arr[1]=new Phone("아이폰","13","애플",1500000);
			
		arr[2]=new Phone("z플립4","갤럭시","삼성",1350000);
		
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i].information()); //반복하면서 각 객체에 접근해 정보를 출력
			sum += arr[i].getPrice();
			
		}
		System.out.println("총 가격 : "+sum+"원");
		System.out.println("평균가격 : "+sum/arr.length+"원"); //arr.length => 객체안의 숫자를 파악하지 못한다면 배열의 길이로 나눈는 식을 대입
	}

}
