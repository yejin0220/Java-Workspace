package com.kh.chap02_inherit.mode.vo;

public class Vehicle {
	
	
	//탈것에서는 공통적으로 사용되는 내용
	private String name;
	private double milege;
	private String kind;
	
	public Vehicle () {
		
		
	}
	
	public Vehicle(String name, double milege, String kind) {
		this.name=name;
		this.milege=milege;
		this.kind=kind;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setMilege(double milege) {
		this.milege=milege;
	}
	
	public void setKind(String kind) {
		this.kind= kind;
	}
	
	public String getName() {
		return name;
	}
	
	public double getMilege() {
		return milege;
	}
	
	public String getKind() {
		return kind;
	}
	
	public String information() {
		return "name : "+name+", milege : "+milege+", kind : "+kind;
	}
	
	public void howToMove () {
		System.out.println("움직인다.");
	}
}
