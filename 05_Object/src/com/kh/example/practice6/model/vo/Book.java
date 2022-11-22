package com.kh.example.practice6.model.vo;

public class Book {
//
//	- title : String
//	- publisher : String
//	- author : String
//	- price : int
//	- discountRate : double
	
	private String title;
	private String publisher;
	private String autor;
	private int price;
	private double diseountRate;
	
	public Book(){
		
	}
	
	public Book(String title,String publisher,String autor ) { //setter메서드 사용하지 않고 값 매개변수에 불러올 변수 저장
		this.title=title;
		this.publisher=publisher;
		this.autor=autor;
	}

	public Book(String title,String publisher,String autor,int price,double diseountRate ) {
		this(title, publisher, autor); //위에 중복되기 때문에 바꿔 줌 
		this.price=price;
		this.diseountRate = diseountRate;
		
		
	}
	
	public void inform(){
		System.out.println(title+","+publisher+","+autor+","+price+","+diseountRate);
	}
}

