package com.kh.chap01_frame.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame3 extends JFrame {
	
	public MainFrame3() {
		
		this.setBounds(200, 200, 500, 500);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel1.setBounds(0, 0, 250, 500);
		panel2.setBounds(250, 0, 250, 500);
		
		//패널 배경색 설정 -> setBackground를 통해 패널의 색상 지정
		//기본색은 투명색
		
		panel1.setBackground(Color.BLUE);
		panel2.setBackground(Color.PINK);
		//JPnel 객체 생성후 설정까지 한 후에 반드시 프레임에 직접 추가를 해줘야함.(자동부착x)
		this.add(panel1);
		this.add(panel2);
		
		this.setVisible(true); //프레임창이 보일지 안보일지
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기창
		
	}

}
