package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	
	
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		//모든사람이 사탕을 골고루 나눠가짐
		//인원 수와 사탕 개수를 키보드로 입력 받고, 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력
		
		System.out.print("인원 수 : ");
		int num = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num1 = sc.nextInt();
		
		
		
		System.out.println("1인당 사탕 개수 : "+(num1/num));
		System.out.println("남은 사탕 개수 : "+(num1%num));
		
		
	}
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		//키보드로입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출려ㄱ하여 확인사헤요.
		//이때 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력 처리 하세요.
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) :");
		int num = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int num1 = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num2 = sc.nextInt();
		
		sc.nextLine(); // nextInt뒤에 nextLine이 오는 경우 입력버퍼에 엔터값(\n)이 남아있기 때문에 오류가 뜸, 이를 없애기 위해 sc.nextLine();을 반드시 한 번 실행해줘야 함.
		               //IndexOutOfBoundExeoption 
			
	    System.out.print("성별(M/F) : ");
	    char ch = sc.nextLine().charAt(0);
	    
	    String result = (ch == 'M') ? "남학생" : "여학생";
	    
	    System.out.println("성적(소숫점 아래 둘째자리까지) : ");
	    double dum = sc.nextDouble();
	    	    
	    System.out.println(num+"학년 "+num1+"반 "+num2+"번 "+name+""+result +"의 성적은 "+dum+"이다.");
	    System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f 이다.", num, num1, num2, name, result, dum );
	    //삼항연산자로 중간 계산 없이 결과를 추력할 경우
	    //System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f 이다.", num, num1, num2, name, (ch='M' ? "남학생" : "여학생), dum );
	    
	      
	    
	    
		
	}
	
	
	
	
	
	public void practice3() {
		
		
		
		//나이를 키보드로 입력 받아 어린이(13세이하)인지, 청소년(13세초과~19세이하)인지, 성인(19세 초과)인지 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		
		String result = age <= 13 ? "어린이" : (age<=19 ? "청소년" : "성인");
		                                     //age>13 && age<=19 -> 굳이 age>13이라는 값을 입력하지 않아도 됨
		                                     //                  -> 이미 앞에 조건에서 age가 13과 같거나 작다면 어린이라는 값을 부여했기 때문에
		System.out.println(result);
		
		
	    
		
		
		
		
		
		
		
	}
	
	
	
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		//세 과목에 대한 합게와 평균을 구하시오
		//세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int met = sc.nextInt();
		
		int sum = eng+kor+met;
		int sum1 = (sum/3);
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+(double)sum1);
		
		String result = kor>=40 && eng>=40 && met>=40 && (sum1>=60) ? "합격" : "불합격";
		System.out.println(result);
		
		
		
		
		
		
	}
	
	
	
	public void practice5() {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String str = sc.nextLine();
		char gender = str.charAt(7);
		
		String result = (gender == '1' || gender =='3')? "남자" : "여자";
		System.out.println(result);
		
		

		
		
		
		
		
		
		
		
		
	}
	
	
	
	public void practice6() {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("변수 2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num3<num1 || num3>num2) ? true : false ;
		System.out.println(result);
		
		
		
		

		
		
	}
	
	
	
	public void practice7() { 
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num2 = sc.nextInt();
		
	
		System.out.println(num==num1 && num1==num2 ? true : false);
		
		
		
		
		
		
		
		
	}
	
	
	
	public void practice8() {
		
		
//		A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
//		인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
//		(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int num = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
        int num1 = sc.nextInt();
        
        System.out.print("C사원의 연봉 : ");
        int num2 = sc.nextInt();
        
        //인센티브 포함 연봉 계산하는 방법 : 연봉+연봉*0.4 -> 연봉*1.4
        double num3 = num*1.4;
        double num4 = num1*1;
        double num5 = num2*1.15;
        
        System.out.println("A사원의 연봉/연봉+a : "+num+"/"+num3);
        System.out.println(num3 >= 3000 ? "3000이상" : "3000미만");
        
        System.out.println("B사원의 연봉/연봉+a : "+num1+"/"+num4);
        System.out.println(num4>= 3000 ? "3000이상" : "3000미만");
        
        System.out.println("C사원의 연봉/연봉+a : "+num2+"/"+num5);
        System.out.println(num5 >= 3000 ? "3000이상" : "3000미만");
        
        
   
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
}
