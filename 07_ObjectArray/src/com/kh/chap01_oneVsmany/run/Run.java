package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.mode.vo.Book;

public class Run {
	
	public static void main(String[] args) {
//		//1.기본생성자로 객체 생성 후 setter메소드를 통해 각 필드에 값대입
//		Book bk1 = new Book();
//		bk1.setTitle("자바의 정석");
//		bk1.setAuthor("민경민");
//		bk1.setPrice(18000);
//		bk1.setPublisher("KH");
//		
//		System.out.println(bk1.information());
//		
//		
//		
//		//2.매개변수 생성자로 객체 생성과 동시에 각필드에 값을 대입
//		Book bk2 = new Book("C언어", "홍길동", 17000, "나무");
//		System.out.println(bk2.information());
//		
//		
//		//3. 사용자가 입력한 값들로 객체 생성
//		//Book bk3 = new Book(제목, 저자, 가격, 출판사);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("제목 : ");
//		String title = sc.nextLine();
//		
//		System.out.print("저자 : ");
//		String author = sc.nextLine();
//		
//		System.out.print("가격 : ");
//		int price = sc.nextInt();
//		
//		sc.nextLine();
//		
//		System.out.print("출판사 : ");
//		String publisher=sc.nextLine();
//		
//		Book bk3 = new Book(title, author, price, publisher);
//		
//		System.out.println(bk3.information());
//		
		
		//4.세개의 Book 개체가 필요하다는 가정하게 각각의 book개체를 따로따로 관리
		//단, 사용자에게 입력받은 값들로 book객체 채워넣기.
		Book bk1 = null; // 북개체 3개를 선언하고 기본값은 null로 주소값 초기화
		Book bk2 = null;
		Book bk3 = null;
		
		Scanner sc = new Scanner(System.in);
		
		//반복문으로 객체 반복
		for(int i =1; i<= 3; i++) { // 1 2 3 총 3번 반복하면서 아래 출력문과 입력을 반복해라.
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher=sc.nextLine();
			
			//bk1,2,3 각각에 값을 대입시켜줘야 출력이 가능함.
			if(i==1) {
				bk1 = new Book(title, author, price, publisher);
			}else if(i==2) {
				bk2 = new Book(title, author, price, publisher);
			}else {	
				bk3 = new Book(title, author, price, publisher);
			}
		}
		
		//호출하기 -> 각각 대입되어 있는 값을 따로따로 불러줘야 함, 반복문 사용 불가!
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		
		
		
	}
}
