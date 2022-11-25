package com.kh.chap01_poly.part02_electronic.model.vo;

public class Tablet extends Electronic{
	
	private boolean penFlag;

	public Tablet() {
		super();
		
	}

	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(brand, name, price);
		this.penFlag= penFlag;
		
	}

	public boolean isPenFlah() {
		return penFlag;
	}

	public void setPenFlah(boolean penFlah) {
		this.penFlag = penFlah;
	}

	@Override
	public String toString() {
		return "Tablet [penFlah=" + (penFlag  ?  "있음":"없음") + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
