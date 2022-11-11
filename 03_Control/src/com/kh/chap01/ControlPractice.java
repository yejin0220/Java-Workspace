package com.kh.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		
//		아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
//		종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
//		ex.
//		1. 입력
//		2. 수정
//		3. 조회
//		4. 삭제
//		7. 종료
//		메뉴 번호를 입력하세요 : 3
//		조회 메뉴입니다.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.println("메뉴번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		if(menu==1) {
		 System.out.println("입력메뉴입니다.");
		} else if(menu == 2) {
			System.out.println("수정메뉴입니다.");
		} else if(menu==3) {
			System.out.println("조회메뉴입니다.");
		} else if(menu==4) { 
			System.out.println("삭제메뉴입니다.");
		} else if (menu==7) {
			System.out.println("프로그램이 종료됩니다.");
		} 
		
		
		//switch문
		//String result = "";
		//switch(menu) {
	    //case 1 :  System.out.println("입력메뉴입니다."); break;
		//case 2 :  System.out.println("수정메뉴입니다."); break;
	    //case 3 :  System.out.println("조회메뉴입니다."); break;
	   //case 4 :  System.out.println("삭제메뉴입니다."); break;	
	   //case 7 :  System.out.println("종료메뉴입니다."); break;	
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public void practice2() {
		
//		키보드로 정수를 입력 받은 정수가 
		//양수이면서 짝수일 때만 “짝수다”를 출력하고
//		짝수가 아니면 “홀수다“를 출력하세요.
//		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
//		
//		ex.
//		숫자를 한 개 입력하세요 : -8
//		양수만 입력해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0 && num%2==0) {
			System.out.println("짝수다");
		}else if(num%2 != 0) {
			System.out.println("홀수다");
		}else if(num<0) {
			System.out.println("양수만 입력해주세요.");
		}
		
		
		
		
	}
	
	public void practice3() {
		
		
//		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
//		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
//		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
//		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
//		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		
		
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("국어 점수 : ");
	 int kor = sc.nextInt();
	 
	 System.out.print("영어 점수 : ");
	 int eng = sc.nextInt();
	 
	 System.out.print("수학 점수 : ");
	 int met = sc.nextInt();
	 
	 int sum = kor+eng+met; //합계 : sum
	 double sum1 =sum/3;    //평균 : sum1
	 
	 
	 if (kor>=40 && eng>=40 && met>=40 && sum1>=60) {
		
			 System.out.println("국어 : "+kor);
			 System.out.println("영어 : "+eng);
			 System.out.println("수학 : "+met);
			 System.out.println("합계 : "+sum);
			 System.out.println("평균 : "+sum1);
			 System.out.println("축하합니다, 합격입니다.!");
		 }else {
			 
			 System.out.println("불합격입니다.");
		 
	 }
	 
	 
	 
	 
		
	}
	
	
	public void practice4() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1월~12월 중 해당 월을 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
			case 1 : 
			case 2 :
			case 12 : System.out.println(month+"월은 겨울입니다."); break; 
			case 3 :
			case 4 :
			case 5 : System.out.println(month+"월은 봄입니다."); break;
			case 6 : 
			case 7 : 
			case 8 : System.out.println(month+"월은 여름입니다."); break;
			case 9 :
			case 10 :
			case 11 : System.out.println(month+"월은 가을입니다."); break;
			default : System.out.println(month+"월은 잘못입력된 달입니다."); 
		} 
		
		
		
		
		
		
	}
	
	
	
	public void practice5() {
		
//		아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		
//		로그인 성공 시 “로그인 성공”, 
//		아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
//		비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
//		ex 1.             ex 2.                 ex 3.
//		아이디 : minmin    아이디 : minmin         아이디 : min
//		비밀번호 : Min1234  비밀번호 : min1234      비밀번호 : Min1234
//		로그인 성공 비밀번호가 틀렸습니다. 아이디가 틀렸습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		
		System.out.println("비밀번호 : ");
		String pw = sc.nextLine();
		
		//if문 구상
		// 1. 아이디 값을 잘 입력했는지?
		// 2. 아이디 값이 잘 입력되었다면 , 비밀번호를 잘 입력했는지?
		
		if(id.equals("minmin")) { //아이디를 잘 입력했는지?
			if(pw.equals("Min1234")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
		
		
	

		
		
		
	}
	
	
	
	
	
	public void practice6() {
		
		
//		사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
//		단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//		회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//		비회원은 게시글 조회만 가능합니다
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("등급을 입력하세요 : ");
		String level = sc.nextLine();
		
		
		
		switch (level) {
		case "관리자" : System.out.print("회원관리, 게시글 관리, ");
		case "회원" : System.out.print("게시글 작성, 댓글 작성, ");
		case "비회원" : System.out.println("게시글 조회");
		
		}
		
				
	}
	
	public void practice7() {
		
		
//		키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
//		저체중/정상체중/과체중/비만을 출력하세요.
//		BMI = 몸무게 / (키(m) * 키(m))
//		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//		BMI가 30이상일 경우 고도 비만
//		ex.
//		키(m)를 입력해 주세요 : 1.65
//		몸무게(kg)를 입력해 주세요 : 58.4
//		BMI 지수 : 21.45087235996327
//		정상체중
//		
		
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요 : ");
	    double kg = sc.nextDouble();
	    
	    System.out.print("몸무게를 입력하세요 : ");
	    double cm = sc.nextDouble();
	    
	    double BMI = kg/(cm*cm);
	    String result = "";
	    
	    
	 if(BMI<18.5) {
		 result = "저체중";
	 }else if(BMI <23 ) {
		 result = "정상체중";
	 }else if(BMI<25) {
		 result = "과체중";
	 }else if(BMI<30) {
		 result= "비만";
	 }else {
		 result = "고도비만";
	 }
	 
	 System.out.println("BMI지수 : " + BMI);
	 
	    
	    
	    	
	    	
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public void practice8() {
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("피 연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println("피 연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("연산자 입력(+-*/%) : ");
		char op = sc.nextLine().charAt(0);
		

		switch(op) {
		case '+' : System.out.printf("%d %c %d = %d",num1, op, num2, (num1+num2) ); break;
		case '-' : System.out.printf("%d %c %d = %d",num1, op, num2, (num1-num2) ); break;
		case '*' : System.out.printf("%d %c %d = %d",num1, op, num2, (num1*num2) ); break;
		case '/' : System.out.printf("%d %c %d = %f",num1, op, num2, (num1/(double)num2) ); break;
		case '%' : System.out.printf("%d %c %d = %f",num1, op, num2, (num1%(double)num2) ); break;
			default : System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");		}
		
		
		
		
		
		
		
	}
	
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
