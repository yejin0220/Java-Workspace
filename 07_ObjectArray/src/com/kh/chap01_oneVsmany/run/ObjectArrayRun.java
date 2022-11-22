package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.mode.vo.Book;

public class ObjectArrayRun {

	
	public static void main(String[] args) {
		
		//객체 배열 선언
		Book [] arr = new Book[3]; 
		
		Scanner sc = new Scanner(System.in);
		
		//3개의 전체 도서 정보를 입력받은 후, 각 객체 배열의 인덱스에 해당 객체를 생성하기./반복문 사용.
	
		for(int i=0; i<arr.length; i++) {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			arr[i] = new Book(title, author, price, publisher);
		}
		
		//출력하기
		for(int i =0;i<arr.length; i++) {
			System.out.println(arr[i].information());
		}
		
		//사용자에게 검색할 도서제목을 입력받아, 각 전체 도서들의 제목과 일일이 비교하여 일치하는 도서의 가격을 알려주는 메소드
		
		System.out.print("검색할 책 제목 : ");
		String searchTitle = sc.nextLine();
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i].getTitle().equals(searchTitle)) { //반복을 진행할 객체 배열, 반복을 진행하면서 그 안에 담겨있는 값이 사용자가 입력한 값과 일치하는지?
				System.out.println(arr[i].getPrice()); //arr[i]번째에 저장되어 있는 가격을 불러오면 됨
				
			}
		}
		
		
		
	}
}

