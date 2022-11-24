package com.kh.chpa01_beforeVsafter.before.model.vo;

public class Desktop {

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean allInOne;
	
	
	public Desktop(){
		
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
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne=allInOne;
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
	
	public boolean getAllInOne() {
		return allInOne;
	}
	
	public String information() {
		return brand+","+pCode+","+pName+","+price+","+allInOne;
	}
	
	
	
	
	
}
