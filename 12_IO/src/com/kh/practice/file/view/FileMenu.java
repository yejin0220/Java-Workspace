package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("********My Note********");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			
			System.out.print("메뉴 번호 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			
			switch(num) {
			case 1 : fileSave(); break;
			case 2 : fileOpen(); break;
			case 3 : fileEdit(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요"); 
			
		}
		}
		
		
		
	}
    
	public void fileSave() {

		StringBuilder sb = new StringBuilder();
		//sb.appen() : 입력한거 계속 저장
		//while문이 진행되는 동안 sb값은 초기화되면 안되기 때문에 while문 밖에 선언
		while(true) {
			
			System.out.println("파일에 저장할 내용을 입력해주세요");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			
			System.out.println("내용 : ");
			String str = sc.nextLine();
			
			if(str.equals("ex끝it")) {
				break;
			}
			sb.append(str+"\n"); //사용자가 입력한 값이 "ex끝it"이 아니라면 sb에 사용자가 입력한 값 계속 저장
			
		}
		
		//while문이 두개로 나눠진 이유? : 위에 작성한 내용은 쭉 유지되어 있어야함(내용은 유지되어야하고, 제목은 수정할 수 있음)
		
		while(true) {
		System.out.println("저장할 파일명을 입력해주세요(ex. mtFile.txt) :");
		String file = sc.nextLine();
		
		//존재하는 파일인지 아닌지 검사 후, 덮어쓰기 혹은 이어쓰기 진행
		if(fc.checkName(file) ) { //file이라는 이름이 존재하는 경우
			System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
			char yes = sc.nextLine().charAt(0);
			
			if(yes == 'y' || yes == 'Y') { //덮어씌우기
				fc.fileSave(file, sb);
			}else { //이어쓰기
				System.out.println("파일명을 다시 입력해주세요."); //저장할 파일명을 다시 입력할 수 있도록 continue작성.
				continue;
			}
			
			
		}else {//file이라는 파일명이 존재하지 않는 경우
			fc.fileSave(file, sb);	
		}
		break;
		}

		
		
	}
	
	public void fileOpen() {
		
		System.out.print("열 파일 명 : ");
		String file = sc.nextLine()	;
		if(fc.checkName(file)) { //true라면 파일이 있음
			System.out.println(fc.fileOpen(file)); //.toString은 굳이 작성안해도 println이 자동으로 변환시켜 줌
		
		}else { //flase라면 파일이 없음
			System.out.println("없는 파일입니다. ");
		}
		
		
		
		
	}
	
	public void fileEdit() {
		
		System.out.print("수정할 파일 명 : ");
		String file = sc.nextLine();
		
		if(fc.checkName(file)) { //파일이 있는 경우
			

			StringBuilder sb = new StringBuilder(); //변경할 파일의 명
			
			while(true) {
				
				System.out.println("파일에 저장할 내용을 입력해주세요");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				
				System.out.println("내용 : ");
				String str = sc.nextLine();
				
				if(str.equals("ex끝it")) {
					break;
				}
				sb.append(str+"\n"); //사용자가 입력한 값이 "ex끝it"이 아니라면 sb에 사용자가 입력한 값 계속 저장
				
			}
			fc.fileSave(file, sb);
	

			
			
			
			
		}else {//파일이 없는경우 출력문 출력 후 메인메뉴로 돌아감(무한반복 중)
			System.out.println("없는 파일입니다.");
		}
		
	}

}
