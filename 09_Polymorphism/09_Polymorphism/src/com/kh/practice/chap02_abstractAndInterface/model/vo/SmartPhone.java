package com.kh.practice.chap02_abstractAndInterface.model.vo;

public abstract class SmartPhone {
	
	private String maker;

	public SmartPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String printinformation() {
		return maker+"에서 만들어졌고, 재원은 다음과 같다.";
	}

}
