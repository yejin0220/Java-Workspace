package com.kh.hw.shape.view;

import java.util.Scanner;
import com.kh.hw.shape.controller.*;

public class SapeMenu {
	
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new  SquareController();
	private TriangleController tc = new TriangleController();
	
	
		public void inputMenu() {
			
			while(true){
				
			
			System.out.println("=============도형프로그램============");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch (num) {
			case 3 : triangleMene(); break;
			case 4 : squareMenu(); break;
			case 9 : return;
			default : System.out.println("잘못된 번호입니다. 다시 입력하세요."); 
			}
			}
				
		
		}
		
		public void triangleMene() {
			while(true) {
				System.out.println("========삼각형========");
				System.out.println("1. 삼각형 면적");
				System.out.println("2. 삼각형 색깔");
				System.out.println("3. 삼각형 정보");
				System.out.println("9. 메인으로");
				
				System.out.print("메뉴번호 : ");
				int num = sc.nextInt();
				
				switch(num) {
				case 1: inputSize(3,1); break; //삼각형 메뉴의 1번으로
				case 2: inputSize(3,2); break; //삼각형 메뉴의 2번으로
				case 3: printInformation(3); break; //삼각형의 정보로
				case 9: return; //메인으로
			
				}
								
			}
	
			
		}
		
		
		
		public void squareMenu() {
			while(true) {
				System.out.println("========사각형========");
				System.out.println("1. 사각형 둘레");
				System.out.println("2. 사각형 면적");
				System.out.println("3. 사각형 색칠");
				System.out.println("4. 사각형 정보");
				System.out.println("9. 메인으로");
				
				System.out.print("메뉴번호 : ");
				int num = sc.nextInt();
				
				switch(num) {
				case 1: inputSize(4,1); break; 
				case 2: inputSize(4,2); break; 
				case 3: inputSize(4,3); break;
				case 4: printInformation(4); break; 
				case 9: return;  
				}
								
			}
		}
		
		
		public void inputSize(int type, int menuNum) {
			double d =0.0;
			if(type ==3) {
				if(menuNum==1) {
					System.out.print("높이 : ");
					int height = sc.nextInt();
					
					System.out.print("너비 : ");
					int width = sc.nextInt();
					
					System.out.println("삼각형의 면적 : ");
					d = tc.calcAter(height, width);
				
					
				}else {
					sc.nextLine(); //맨위 메소드 마지막이 nextInt로 받아왔기 때문에 입력버퍼에 공백이 남아있음
					
					System.out.println("삼각형의 색깔을 입력하세요 : ");
					String color = sc.nextLine();
					tc.paintColor(color);
					System.out.println("색이 변경되었습니다.");
					
				}
								
			}else {
				if(menuNum==3) {
					sc.nextLine();
					System.out.print("색깔을 입력하세요 : ");
					String color = sc.nextLine();
					tc.paintColor(color);
					System.out.println("색이 변경되었습니다.");
				}else{
					System.out.print("높이 : ");
					int height = sc.nextInt();
					
					System.out.print("너비 : ");
					int width = sc.nextInt();
					if(menuNum==1) {
						System.out.println("사각형의 둘레 : ");
						d=scr.calcPerimeter(height, width);
					}else {
						System.out.println("사각형의 면적 : ");
						d=scr.calcArea(height, width);
					}
					
					
				}
			}
			
		}
		
		public void printInformation(int type) {
			
			String result ="";
			
			
			if(type ==3) {
				result =tc.pritnt();
				
			}else {
				result = scr.print();
			}
			System.out.println(result);
		}
	}
	
	

