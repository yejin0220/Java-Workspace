package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		
		while(true) {
			
			System.out.println("====도형 프로그램====");
			System.out.print("3. 삼각형");
			System.out.print("4. 사각형");
			System.out.print("9. 프로그램 종료");
			
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 3 : triangleMenu(); break;
			case 4 : squareMenu(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못된 번호 입니다. 다시 입력하세요"); return;
			
		}
		}
		
	}
	
	public void triangleMenu( ) {
		
		System.out.println("====삼각형====");
		System.out.print("1. 삼각형 면적");
		System.out.print("2. 삼각형 색칠");
		System.out.print("3. 삼각형 정보");
		System.out.print("9. 메인으로");
		
		System.out.print("메뉴 번호");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : 
		case 2 : 
		case 3 :
		
		}
		
		
	}
	
	public void squareMenu() {
		
		
		
		
	}
	
	
	public void inputSize(int type, int menuNum) {
		
		
		
	}
	
	
	public void printInformation(int type) {
		
		
		
		
	}
}
