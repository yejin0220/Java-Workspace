package com.kh.chap02_inherit.mode.vo;

public class Car extends Vehicle{
	
	
	private int tire;
	
	
	public Car() {
		
		
	}
	
	public Car(String name, double milege, String kind, int tire) {
		super(name, milege, kind);
		this.tire=tire;
		
		
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}
	
	
	
	@Override
	public String information() {
		return super.information()+", tire : "+tire;
	}
	
	
	@Override
	public void howToMove() {
		System.out.println("엑셀을 밟아 바뀌를 굴려서 움직인다.");
	}
	
	
	
	
	
	
	
	
	
}
