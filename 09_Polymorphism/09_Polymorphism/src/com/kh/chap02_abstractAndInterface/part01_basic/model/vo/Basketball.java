package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public class Basketball extends Sports {
	
	/*
	 * 미완성된 클래스인 추상 클래스를 상속받게 되면, 부모 클래스에 있는 추상 메소드를강제로 오버라이딩 해줘서 완성시켜줘야 함
	 * =>extends Sports                               => public abstract void rule(); ->public void rule( )   
	 */
	
	@Override
	public void rule( ) {
		System.out.println("손으로 공을 던져 링에 넣으면 됨");
	}

}
