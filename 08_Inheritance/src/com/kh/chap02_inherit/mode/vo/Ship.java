package com.kh.chap02_inherit.mode.vo;

public class Ship extends Vehicle{
	
	private int propeller;
	
	public Ship() {
		
		
	}
	
	public Ship(String name, double milege, String kind, int propeller) {
		super(name, milege, kind);
		this.propeller=propeller;
	}

	public int getPropeller() {
		return propeller;
	}

	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}
	
	@Override
	public String information() {
		return super.information()+", propeller : "+propeller;
	}
	
	
	@Override
	public void howToMove() {
		System.out.println("프로펠러를 돌려서 움직인다.");
	}
}
