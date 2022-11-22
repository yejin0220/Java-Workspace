package com.kh.practice.snak.view;

import java.util.Scanner;

import com.kh.practice.snak.controller.*;

public class SnakMenu {
	
	private Scanner sc =  new Scanner(System.in);
	private SnakController scr = new SnakController();

	
	public void menu() {
	System.out.println("스낵류를 입력하세요.");
	
	System.out.print("종류 : ");
	String kind = sc.nextLine();
	
	System.out.print("이름 : ");
	String name = sc.nextLine();
	
	System.out.print("맛 : ");
	String flavor = sc.nextLine();
	
	System.out.print("개수 : ");
	int numOf = sc.nextInt();
	
	System.out.print("가격 : ");
	int price = sc.nextInt();
	
	String result = scr.saveData(kind, name, flavor, numOf, price);
	System.out.println(result);
	
	sc.nextLine();
	
	System.out.print("저장한 정보를 확인하시겠습니다?(y/n) : ");
	char ch = sc.nextLine().charAt(0);
	
	if(ch == 'y' || ch == 'Y') {
		System.out.println(scr.confirmData());
	}
			
	}


}
