package com.kh.chpa01_beforeVsafter.before.model.vo;

public class SmartPhone {
	
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String mobileAgent;
	
	public SmartPhone() {
		
		
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public void setpCode(String pCode) {
		this.pCode=pCode;
	}
	
	public void setpName(String pName) {
		this.pName=pName;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public void setMobileAgnet(String mobileAgent) {
		this.mobileAgent=mobileAgent;
	}
	

	public String getBrand() {
		return brand;
	}
	
	public String getpCode() {
		return pCode;
	}
	
	public String getpName() {
		return pName;
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getMobileAgent() {
		return mobileAgent;
	}
	
	public String information() {
		return brand+","+pCode+","+pName+","+price+","+mobileAgent;
	}
}
