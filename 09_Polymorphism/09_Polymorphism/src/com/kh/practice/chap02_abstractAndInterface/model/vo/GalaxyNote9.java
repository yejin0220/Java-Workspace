package com.kh.practice.chap02_abstractAndInterface.model.vo;

public class GalaxyNote9 extends SmartPhone{
	
	public GalaxyNote9() {
		super.setMaker("삼성");
		
	}
	
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
		
		
	}
	
	
	public String takeCall() {
		return "수신 버튼을 누름";
		
	}
	
	public String picture() {
		return "1200만 듀얼 카메라";
		
	}
	
	public String charge() {
		return "고속 충천, 고속 무선 충전";
		
		
	}
	
	
	public String touch() {
		return "정전식, 와콤펜 지원";
		
		
		
	}
	
	public boolean bluetoothPen() {
		System.out.println("블루투스 펜 탑재 여부 : ");		
		return true;
		
	}
	


}
