package com.kh.practice.chap02_abstractAndInterface.model.vo;

public class V40 extends SmartPhone{
	
	public V40() {
		super.setMaker("LG");
		
		
		
	}
	

	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
		
		
	}
	
	
	public String takeCall() {
		return "수신 버튼을 누름";
		
	}
	
	public String picture() {
		return "1200, 1600만 트리플 카메라";
		
	}
	
	public String charge() {
		return "고속 충천, 고속 무선 충전";
		
		
	}
	
	
	public String touch() {
		return "정전식";
		
		
		
	}
	
	public boolean bluetoothPen() {
		
	System.out.println("블루투스 펜 탑재 여부 : ");		
	return false;
	}
	


}
