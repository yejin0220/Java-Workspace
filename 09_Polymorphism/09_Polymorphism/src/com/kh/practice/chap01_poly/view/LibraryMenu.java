package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	
	private LibraryController lc = new LibraryController() ;
	private Scanner sc = new Scanner(System.in);
	
	
	
	public void mainMenu() {
		
		System.out.print("이름");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별 : ");
		char gen = sc.nextLine().charAt(0);
		
				
				
		Member mem = new Member();
		mem.setAge(age);
		mem.setName(name);
		mem.setGender(gen);
		lc.insertMember(mem);
		
		//회원등록부
		
				
		while(true) {
			
			System.out.println("======메뉴======");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : System.out.println(lc.myinfo()); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 9 : return; //현재 LibraryMenu종료 후 나를 호출했던 곳으로 돌아감
			
			}
			
		}
		
	}
	
	public void selectAll() {

		Book [] bList = lc.selectAll();
		for(int i =0; i<bList.length; i++) {
			System.out.println(i+"번 도서 : "+bList[i]);
			
		}
	}
	
	
	public void searchBook( ) {
	
		sc.nextLine(); //=> 메인메뉴에서 nextInt로 숫자를입력 받았기 때문에 허공에 남은 입력버퍼 없애줘야 함.
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		
		Book[] searchList=lc.searchBook(keyword);
		
		for(int i =0; i<searchList.length; i++) {//null값이 저장되어 있음
			if(searchList[i] != null) {
				System.out.println(i+"번 도서 : "+searchList[i]);
				
			}
			
		}
		
	}
	
	public void rentBook() {
	
		selectAll();
		
		System.out.print("대여할 도서 선택  : ");
		int index = sc.nextInt();
		
		int result = lc.rentBook(index);
		
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(result ==1) {
			System.out.println("나이제한으로 대여 불가능입니다.");
		
		}else {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
			
		}
		
			
		
		
	}

}
