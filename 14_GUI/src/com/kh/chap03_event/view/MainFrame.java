package com.kh.chap03_event.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends javax.swing.JFrame {
	
	
	
	public MainFrame() {
		//간단한 계산기 만들어보기(기능을 하는)
		
		//계산기의 사이즈
		this.setBounds(200, 200, 300, 200);
		
		
		this.setTitle("계산기"); //기능의 이름
		this.setResizable(false); //사이즈를 마음대로 변경할 수없음
		
		
		JPanel inputPanel = new JPanel();   //사용자에게 값을 입력받는 입력용 패널
		JPanel resultPanel = new JPanel(); //사용자에게 결과값을 출력해주는 출력용 패널
		
		//입력용패널에 부착할 내용
		JTextField num1 = new JTextField(15);
		JTextField num2 = new JTextField(15);
		
		inputPanel.add(new JLabel("첫번 째 정수 : "));
		inputPanel.add(num1);
		inputPanel.add(new JLabel("두번 째 정수 : "));
		inputPanel.add(num2);
		
		//버튼을 담아둘
		JPanel btnPanel = new JPanel();
		
		JButton plusBtn = new JButton("+");
		JButton minusBtn = new JButton("-");
		
		btnPanel.add(plusBtn);
		btnPanel.add(minusBtn);
		
		inputPanel.add(btnPanel);
		
		
		//결과물 패널에 부착할 내용
		JTextField result = new JTextField(15);
		resultPanel.add(new JLabel("결과 : ")	);
		resultPanel.add(result);
		
		
		//각버튼에 이벤트 걸어주기(이벤트 연결)
		//plusBtn  클릭시 => 두개의 정수값을 가져온 후 덧셈 연산 결과를 resultText상자에 출력
		plusBtn.addActionListener(new ActionListener()	{
			@Override
			public void actionPerformed(ActionEvent e) {
				//plus버튼 클리시 실행할 내용
				int value1 = Integer.parseInt(num1.getText());
				int value2 = Integer.parseInt(num2.getText());
				result.setText(value1+value2+""); // ""를 통해 문자열로 변경해주기
			}
		});
		
		//ActionListener : 인터페이스이기 때문에 곧바로 생성이 불가
		//ActionListener이라는 인터페이스 안에 actionPerformed를 @Override해서 해당 메소드 안에 실행코드를 입력하고
		//지정한 Component의 액션이 발생했을 때, 실행코드가 작동
		
		//단, 여기서 생성을 하고 싶다면 "미완성된 메소드"를 완성시키면서 생성 => 익명 클래스 방식
		
		
		
		//minus버튼 클릭시 => 두개의 정수값을 가져온 후 뺄셈연산 결과를 result텍스트 박스에 출력.
		minusBtn.addActionListener(new ActionListener( ) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int value1 = Integer.parseInt(num1.getText()); //JLbel안에 입력하는 문자는 String형태이기 때문에 원하는 자료형으로 바꿔줘야함.
				int value2 = Integer.parseInt(num2.getText());
				result.setText(value1-value2+"");
				
			}
			
			
			
			
			
		});
		
		
		
		
		
		
		JLabel title = new JLabel("두개의 정수를 입력하세요 : ",0); // 0: 가운데 정렬
		
		this.add(title, "North");
		this.add(inputPanel, "Center");
		this.add(resultPanel, "South");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	

}
