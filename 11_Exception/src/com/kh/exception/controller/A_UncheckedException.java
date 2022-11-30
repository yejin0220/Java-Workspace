package com.kh.exception.controller;

import java.util.Scanner;

public class A_UncheckedException {

	/*
	 * RuntiomeException
	 * - 프로그램 실행시 발생되는 예외들
	 * 
	 * RuntimeException의 자식 클래스들
	 * -ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근할떄 발생하는 예외
	 * -NegativeArraySizeException : 배열의 크기를 음수로 지정할 경우 발생하는 예외
	 * -ClassCastException : 허용할 수 없는 형변환이 진행될 경우 발생하는 예외
	 * -NullPointerException : 레퍼런스가 아직 null임에도 불구하고 접근하려고 할떄 발생하는 예외
	 * -ArihmeticException : 나누기 연산시 0으로 나눌때 발생하는 예외
	 * -........
	 * 
	 * => 이러한 RuntimeException과 관련한 예외는 충분히 예상가능한 상황이기 때문에
	 * 	  예외 자체가 발생이 안되게끔 조건문으로 해결이 가능함.
	 *    따라서 굳이 예외처리를 할 필요가 없음.
	 * 
	 * 
	 */
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		//ArithmeticException : 나누기 연산시 0으로 나눌떄 발생하는 예외
		
		//사용자에게 두개의 정수값을 입력받아 나눗셈 연산 결과 출력
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		//해결방법 1. 조건문으로 처리(애초에 예외자체(num2=0)가 발생하지 않게끔 if문으로 조건검사하기) => 예외처리x
//		if(num2 == 0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}else {
//			System.out.println("나눗셈 연산 결과 : "+(num1/num2));
//			
//		}
//		System.out.println("프로그램이 종료되었습니다.");
//		
		
		
		//해결방법 2. 예외처리 구문으로 해결(예외가 발생했을 경우를 대비해서 실행할 코드(내용)를 정의해두는 것)
		/*
		 * try ~ catch문
		 * [표현법]
		 * try{
		 *  		 //예외가 발생될 수 있는 구문
		 * 
		 * } catch(발생될 예외 클래스 변수명 -> 매개변수	){
		 * 
		 * 			//예외 발생시 실행할 구문
		 * 
		 * }
		 * 
		 * 
		 */
		try {
			int num = sc.nextInt();
			System.out.println("나눗셈 연산 결과 : "+(num1/num2)); //ArithmeticException 이 발생할수도 안할 수도 있음
		
		}catch(ArithmeticException e){//만약 ArithmeticException이 발생한다면 아래 구문 출력이됨
			
			//System.out.println("0으로 나눌 수 없습니다.");
			System.out.println("0으로 나눌 수 없습니다."); //현재 발생한 오류를 추적할 수 있는 로그정보 제공
		}
		System.out.println("프로그램 종료");
		
		
		
		
	}
	
	
	public void method2() {
		
		System.out.println("정수 입력(0제외) : ");
	
		
		try {
			int num = sc.nextInt();
			System.out.println("나눗셈 연산 결과 : "+(10/num)); //ArithmeticException발생할 수 있음
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		
		}
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void method3() {
		
		//ArrayIndexOutOfBoundsException : 배여르이 부적절한 인덱스로 접근시 발생하는 예외
		//NegativeArraySizeException : 배열의 크기를 음수로 지정할 경우 발생하는 예외
		
		System.out.print("배열의 크기 :");
		int size = Integer.parseInt(sc.nextLine()); //size에 어떤 값을 입력해도 문자로 받아오기
		
//		
//		if(size>0) { //방법1. if문으로 size값이 양수값일때만 생성하도록 제어
//			
//			int []  arr = new int[Math.abs(size)]; //방법2. 항상 양의 정수값이 들어갈 수 있도록 abs메서드 사용
//			
//		}
//		
//		try {
//			int[] arr = new int [size];
//			System.out.println("100번 인덱스의 값 : "+arr[100]);
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("부적절한 인덱스로 접근했습니다.");
//		}catch(NegativeArraySizeException e){
//			System.out.println("배열의 크기를 음수로 제시할 수 없습니다.");
//		}
//		
//		
		
		
//		try {
//			int[] arr = new int [size];
//			System.out.println("100번 인덱스의 값 : "+arr[100]);
//		}catch(RuntimeException e) { //다형성을 적용하여 부모타임의 예외클래스 작성 가능.
//			System.out.println("예외가 발생하긴 했네요. 그런데 배열의 크기를 음수로 입력했거나, 부적절한"+"인덱스로 접근한 것 같습니다.");
//		}//다중 catch블럭이 줄어들었음, 정확히 어던 에러인지 알 수 없음
		
		
		
		try {
			int[] arr = new int [size];
			System.out.println("100번 인덱스의 값 : "+arr[100]);
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기를 음수로 지정할 수 없습니다.");
		}catch(RuntimeException e) { //다형성을 적용하여 부모타임의 예외클래스 작성 가능.
			System.out.println("예외가 발생하긴 했네요. 그런데 배열의 크기를 음수로 입력했거나, 부적절한"+"인덱스로 접근한 것 같습니다.");
		} //다중 catch에서는 블럭의 순서가 중요함 => 범위가 작은 자식타비의 예외 클래스를 먼저 기술해주어야 함.
		
		
		
		
		
		/*
		 * RuntimeException 관련된 예외는
		 * -조건문으로 해결 가능 => 예외 자체가 발생안되게끔 개발자가 소스코드로 핸들링 가능
		 * -예외 처리 구문으로도 해결 가능 => 예외가 발생했을때를 대비해서 그 떄 실행할 내용을 정의해두는것.
		 * 
		 * 예측이 가능한 상황 => 조건문으로 해결(권장하는방법)
		 * 예측이 불가능한 상황 => 예외처리 구문으로 해결
		 * 
		 * RuntimeException 계열은 충분히 예측 가능한 상황이기 때문에 조건문으로 해결하는것을 권장
		 * 
		 * UnchekedException => 필수로 체크하지는 않아도 예외라는 뜻. 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
