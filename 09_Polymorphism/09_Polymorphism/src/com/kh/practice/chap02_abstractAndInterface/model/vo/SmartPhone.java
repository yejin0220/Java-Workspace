package com.kh.practice.chap02_abstractAndInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	
	private String maker;

	public SmartPhone() {
	
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public abstract String printinformation() ; 
	
	

}
