package com.kh.chap01_frame.view;

import javax.swing.JFrame;

public class MainFrame2 extends JFrame{

	
		//프레임 생성하는 방법2.
		//javax.swing.JFrame 클래스를 "상속"받아서 기본 생성자에서 프레임에 대한 설정변경
	
	public MainFrame2()	{
		
		
		//현재 객체(this) == 프레임
		this.setTitle("MainFrame2");
		
		//프레임의 크기와 위치를 한번에 설정하는 방법(JFrame안에 있는 메서드)
		this.setBounds(300, 200, 800, 500);
		
		//프레임의 사이즈 재조정 여부 지정 (기본값 true => 재조정 할 수 있음/false => 함부로 재조정 불가)
		this.setResizable(false);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
}
