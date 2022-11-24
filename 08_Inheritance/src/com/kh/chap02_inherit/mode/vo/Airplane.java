package com.kh.chap02_inherit.mode.vo;

public class Airplane extends Vehicle{
	
	private int tire;
	private int wing;
	
	public Airplane() {
		
		
		
	}
	
	
	public Airplane(String name, double milege, String kind, int tire, int wing) {
		super(name, milege, kind);
		this.tire=tire;
		this.wing=wing;
		
	}


	public int getTire() {
		return tire;
	}


	public void setTire(int tire) {
		this.tire = tire;
	}


	public int getWing() {
		return wing;
	}


	public void setWing(int wing) {
		this.wing = wing;
	}

	
	@Override //사용하나 안하나 큰 차이는 없으나 추후 유지보수에 있어서 유용함
			  //오버라이딩된 메소드위에 관례적으로 써줘야함, 이게 오버라이딩된건지 안된건지 확인하기 위해서	
	public String information() {
		return super.information()+", tire : "+tire+", wing : "+wing;
	}
	
	
	@Override
	public void howToMove() {
		System.out.println("바퀴를 떼굴떼굴 굴리면서 달리다가 날개를 피면서 움직인다.");
	}
	
	
	
	
}
