package com.kh.practice.snak.model.vo;

public class Snak {
	
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	public Snak() {
		
		
	}
	
	
	public Snak( String kind,  String name,String flavor,int numOf,int price ) {
		this.kind=kind;
		this.name=name;
		this.flavor=flavor;
		this.numOf=numOf;
		this.price=price;
		
	}
	
	 public void setKind(String kind) {
		 this.kind=kind;
	 }

	 public void setName(String name) {
		 this.name=name;
	 }
	 
	 public void setFlavor(String flavor) {
		 this.flavor=flavor;
	 }
	 
	 public void setnumOf(int numOf) {
		 this.numOf=numOf;
	 }
	 
	 public void setPrice(int price) {
		 this.price=price;
	 }
	 
	 
	 public String getKind() {
		 return kind;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public String getFlavor() {
		 return flavor;

	 }
	 
	 public int getNumOf() {
		 return numOf;
	 }
	 
	 public int getPrice() {
		 return price;
	 }
 	 
	 //빵(케이크- 블루베리)1개 15000원
	 public String information() {
		 return kind+"("+name+" - "+flavor+") "+numOf+"개 "+price+"원";
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
