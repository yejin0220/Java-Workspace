package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("*********메인 메뉴********");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
//		System.out.println("7. 곡명 오름차순 정렬");
//		System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			
			System.out.println("메뉴 번호 선택 : ");
		    int num = sc.nextInt();
			
		switch(num) {
		case 1 : addList(); break;
		case 2 : addAtZero(); break;
		case 3 : printAll(); break;
		case 4 : searchMusic(); break;
		case 5 : removeMusic(); break;
		case 6 : setMusic(); break;
		case 9 : System.out.println("종료"); return;
		}
			
		}
		
	}
	
	public void addList() {
		
		System.out.println("*********마지막 곡 위치에 곡 추가********");
		System.out.println("곡 명 입력 : ");
		String title = sc.nextLine();
		
		System.out.println("가수 명 입력 : ");
		String singer = sc.nextLine();
		
		
		int result = mc.addList(new Music(title, singer));
		if(result>0) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
		
	
		
		
		
		
		
		
	}
	
	public void addAtZero() {
		
		System.out.println("*********첫 위치에 곡 추가********");
		System.out.println("곡 명 입력 : ");
		String title = sc.nextLine();
		
		System.out.println("가수 명 입력 : ");
		String singer = sc.nextLine();
		
		
		
		int result = mc.addAtZero(new Music(title, singer));
		if(result>0) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
		
	
		
	}
	
	public void printAll() {
		
		System.out.println("*********전체 곡 목록 출력********");
		System.out.println(mc.printAll());
		
		
	}
	
	public void searchMusic() {
		
		System.out.println("*********특정 곡 검색********");
		System.out.println("곡 명 검색 : ");
		String title = sc.nextLine();
		Music m =mc.searchMusic(title);
		
		
		if( m == null) { //검색곡 없는 경우
			System.out.println("검색한 곡이 없습니다.");
			
		}
		else { //검색 곡 있는 경우
			System.out.println("검색한 곡은"+m.getTitle()+","+m.getSinger()+"입니다.");
		}
		
		
		
	}
	
	public void removeMusic() {
		System.out.println("*********특정 곡 삭제********");
		
		System.out.println("곡 명 검색 : ");
		String title = sc.nextLine();
		Music m =mc.removeMusic(title);
		
		
		if( m == null) { //검색곡 없는 경우
			System.out.println("삭제할 곡이 없습니다.");
			
		}
		else { //검색 곡 있는 경우
			System.out.println("삭제할 곡은"+m.getTitle()+","+m.getSinger()+"입니다.");
		}
		
		
		
		
		
	}
	
	
	
	
	public void setMusic() {
		System.out.println("*********특정 곡 수정********");
		
		System.out.println("곡 명 검색 : ");
		String title = sc.nextLine();
		
		System.out.println("수정할 곡명 : ");
		String updateTitle = sc.nextLine();
		
		System.out.println("수정할 가수명 : ");
		String updateSinger = sc.nextLine();
		
		Music m = mc.setMusic(title, new Music(updateTitle, updateSinger));
		if(m==null) {
			System.out.println("수정할곡이 업습니다.");
		}else {
			System.out.println(m.getTitle()+m.getSinger()+"의 값이 변경되었습니다.");
		}
		
		
		
		
	}
	
	
	public void ascTitle() { //asc : 오름차순 12345/ desc : 내림차순 54321
		System.out.println("*******************오름차순 정렬*******************");
		int result = mc.ascTitle();
		
		if(result>0) {
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
