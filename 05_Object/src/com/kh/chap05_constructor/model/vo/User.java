package com.kh.chap05_constructor.model.vo;

public class User {

	//필드부
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	//생성자부
	/*
	 *생성자
	 *[표현법]
	 *public 클래스명(매개변수(생략가능)) {
	 *		//해당 생성자를 통해서 객체 생성시 실행하고자 하는 코드;
	 *}
	 *
	 *생성자를 사용하는 목적
	 *1. 객체를 생성해주기 위한 목적
	 *2. 객체생성 뿐만 아니라 매개변수로 전달된 값을 곧바로 필드로 대입(초기화)시킬 목적
	 *
	 *생성자 작성시 주의사항
	 *1. 반드시 클래스명과 동일해야함(대/소문자 구분)
	 *2. 반환형이 존재하지 않는다.(메소드와 유사하게 생겨서 헷갈릴 수 있음) ex)void, int ....
	 *3. 여러개 생성이 가능하지만 매개변수가 중복되면 안된다.
	 *4. 매개변수 생성자를 명시적으로 작성하게 되면 기본생성자를 JVM이 자동으로 만들어주지 않는다.
	 *	 즉, 어찌됐던간에 기본 생성자는 항상 작성하는 습관들 들이자.
	 * 
	 * 
	 */
	
	// 필드가 없는 기본 생성자부
	public User()  { //생성자 -> 기본생성자 매개변수 없음, 매개변수가 있는 생성자를 작성할 경우 : 반드시 맨 처음에 작성해두는 습관을 들여야 함.
		/*
		 * 기본생성자(매개변수가 없는 생성자)
		 * 단지 객체를 생성(메모리 영역에 공간확보)만을 위한 목적으로 할때 사용함.
		 * 기본 생성자를 생략하는 경우 => 오류나지 앟음.
		 * JVM이 클래스를 컴파일 할때 기본 생성자가 없는 경우 항상 만들어 주기 때문에.
		 * 단, 매개변수가 있는 생성자가 이미 클래스 안에 작성되어 있는 경우 반드시 기본생성자도 함께 작성해줘야 한다.
		 * 그러니 기본 생성자를 작성하는 습관을 들이자
		 * 
		 * 
		 */
		System.out.println("이거 출력 되나?");
		
	}
	
	//필드가 있는 생성자부
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd= userPwd;
		this.userName=userName;
		
		
		
	}
	public User(String userId, String UserPwd, String userName, int age, char gender) {
		this(userId, userPwd, userName);
		/*
		 * 생성자 내부에 생성자끼리 중복되는 코드가 있는 경우, this()생성자를 통해 같은 클래스 내에 있는 다른 생성자 호출이 가능
		 * 단, 반드시 생성자 내부 첫 줄에 기술해야함!
		 */
		
		
		this.age = age;
		this.gender=gender;
	}
	
	
	//메서드부.
	public void setUserID(String userID) {
		this.userId=userID;
		
	}
	
	public void setUserpwd(String  userPwd) {
		this.userPwd=userPwd;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setAge(int age) {
		this.age=age;
	
	}
	public void setGender(char gender) {
		this.gender=gender;
		
		
	}
	
	public String getUserId() {
		return userId;
	}
	
	public String getUserPws() {
		return userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getAge( ) {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String information() {
		return userId+" "+userPwd+" "+userName+" "+age+" "+gender+" ";
	}
	
	
	
	
	
	
	
	
	
	
	
}
