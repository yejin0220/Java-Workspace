package com.kh.chap06_method.controller;

public class Overloding {
	
	/*
	 * 메소드 오버로딩
	 *  - 한 클래스 내에 "같은" 메소드명으로 정의할 수 있는 방법.
	 *  - 매개변수의 자료형의 개수, 순서가 다르게 작성하며 ㄴ된다.
	 *  - 단, 매개변수명, 접근제한자, 반환명은 메소드 오버로딩에 "전혀" 영향을 주지 않는다.
	 * 
	 * 
	 */
	
	public void test() { 
		
		
	}
	
	public void test(int a) {
		
		
	}
	
	public void test(int a, String s) {  //두개의 매개변수를 가진 test메소드
		
		
	}
	
	public void test(String s, int a) { // 동일한 매개변수라도 매개변수의 순서만 달라져도 완전 별개의 메소드로 인식
		
		
	}
	
	public void test(int a, int b) {
		
		
		
	}
	
	//에러발생.
	//매개변수명과는 상관없이이 자료형의 갯수와 순서가 같아서 에러가 발생
	//즉, 매개변수의 자료형의 개수나 순서가 다르게 작성되어야 한다.
	//매개변수의 이름은 아무 의미가 없음, 자료형의 개수나 순서를 중요하게 파악해야함.
//	public void test(int c, int d) {
//		
//		
//	}
	
	public void test(int a, int b, String s) {
		
		
	}
	
	
	//에러발생
	/*반환형이 다르다고 해서 오버로딩이 적용되지 않음
	 * 메소드를 호출하는 시점에 매개변수가 동일하기 때문에 에러가 발생한다.
	 * 즉, 반환형과 상관없이 매개변수의 자료형의 개수와 순서가 다르게 작성되어야 한다.
	 * => 접근제한자 검사 x, 반환형 검사 x, 오로지 매개변수에 어떤 자료형이 몇개입력되어 있고 순서가 어떻게 구성되어있는지만을 검사하기 때문에.
	 */
//	public int test(int a, int b, String s) {
//		
//		return a+b;
//	}
	
	
	//에러발생
	/*접근제한자가 다르다고 해서 오버로딩이 적용되지 않음
	 *즉, 접근제한자와 상관없이 매개변수의 자료형의 개수와 순서가 다르게 작성되어야 한다.
	 * => 접근제한자 검사 x, 반환형 검사 x, 오로지 매개변수에 어떤 자료형이 몇개입력되어 있고 순서가 어떻게 구성되어있는지만을 검사하기 때문에.
	 */
//	private void test(int a, int b, String s) {
//		
//		
//	}
	
	
	
	
}
