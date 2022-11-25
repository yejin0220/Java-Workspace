package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	
	private Member mem = null;
	private Book [] bList = new Book[5];
		
	//초기화블럭
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);

	}
	
	
	public void insertMember(Member mem) {
		this.mem=mem; //전달받은 mem주소값을 통해 LibraryController의 mem에 대입
	}
	
	public Member myinfo( ) {
		 
		return mem ; //회원 레퍼런스(mem) 주소값 리턴

		
	}
	
	public Book[] selectAll() {
		return bList; // 도서 전체 목록 (bList) 주소값 리턴
	}
	
	
	
	//전달받은 키워드(String keyword)가 포함된 도서가 여러 개가 존재할 수 있으니 검색된 도서를 담아줄 Book 객체 배열을 새로	이 생성하고
	//for문을 통해 bList 안의 도서들과 전달받은 키워드를 비교하여 포함하고 있는 경우 새로운 배열에 차곡차곡 담기 → 그 배열 주소 값 리턴

	public Book[] searchBook (String keyword) {//책의 제목을 입력하면 문자열을 받아오는 매개변수
		Book [] books = new Book[5];
		
		int index = 0;
		for( Book bk:  bList ) {
			if(bk.getTitle().contains(keyword)) { //검색한 키워드를 포함(CONTAINS)하고 있으면 TRUE, 한글자도 없으면 FALSE
				books[index++] = bk; //books 의 인덱스가 0부터 순차적으로 증가하면서 반복되며 나온 bk의 값을 대입해줌.
				
			}
						
		}
		return books; 
		
		}
		
		
		

	//result를 0으로 초기화 한 후 전달받은 인덱스의 도서가 만화책인 경우 회원의 나이와 해당 만화책의 제한 나이를 비교하여 회원 나이가 더 적은 경우 result를 1로 초기화
	//아니면 전달받은 인덱스의 도서가 요리책인 경우 해당 요리책의 쿠폰 유무가 유일 경우 회원의 couponCount를 1증가 시킨 후 result 2로 초기화 	→ result 리턴

	public int rentBook(int index) {
		int result = 0;
		Book bk = bList[index];
		// bk == Cookbook / anibook
		
		if(bk instanceof AniBook) {
			if(mem.getAge() < ((AniBook) bk).getAccessAge()) { //회원나이가 더 적으면 1을 대임
				result =1;
			}
		}else {
			if(((CookBook)bk).isCoupon()) { //요리책의 쿠폰 유무가 유일 경우 : 회원의 쿠폰파운크를 1증가 시킨후 resultㅇ2로 초기화.
				int couponCount = mem.getCouponCount();
				mem.setCouponCount(++couponCount);
				result = 2;
				
			}
			
		}
		
		return result;
		
		
		
		
	
	}

	
}	
	

