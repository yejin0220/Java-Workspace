package com.kh.chap02_component.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame extends javax.swing.JFrame {

	public MainFrame() {
		
		this.setBounds(200, 200, 600, 300);
		
		
		//패널만들기
		JPanel panel = new JPanel();
		
		//JTextFiled : 기본적인 텍스트를 입력할수 있는 박스
		JTextField id= new JTextField(20); //(20) => 텍스트의 크기를 지정해줌.
		panel.add(new JLabel("ID : "));  //JLabel : 안내문구 => "ID : "ID를 입력할 수 있는 안내문구가 뜸
		panel.add(id);
		
		
		//JPasswordField  : 비밀번호를 입력할 수 있는 상자
		JPasswordField pwd = new JPasswordField(20);
		panel.add(new JLabel("PWD : ")); //=> "ID : "ID를 입력할 수 있는 안내문구가 뜸
		panel.add(pwd);
		
		
		//JTextArea : 여러줄의 텍스트를 입력할 수 있는 상자
		JTextArea info = new JTextArea(10, 30); //텍스트 상자의 크기(세로, 가로)
		panel.add(new JLabel("자기소개 : "));
		panel.add(info);
		
		//JButton : 클릭 가능한 버튼
		JButton button = new JButton("전송"); //버튼 안쪽에 보여질 문구
		
		this.add(panel, "North");
		this.add(button, "South");
		
		
		
		
		
		
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
