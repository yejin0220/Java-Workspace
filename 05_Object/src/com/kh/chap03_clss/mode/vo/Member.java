package com.kh.chap03_clss.mode.vo;

public class Member { //clss앞에 붙는 접근제한자가 무엇인지 반드시 확인하기
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	//+ changName(name:String) :void/ 이름을 입력하는 메소드
	
	public void changName(String name) {
		memberName = name;
	}
	
	//+pringName():void //이름을 출력하는 메소드
	public void printName() { 
		System.out.println("이름은: "+memberName);
	}
	
	
	public void setmemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public void setmemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	
	public void setmemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getMemberId() {
		return memberId;
	}
	
	public  String getMemberPwd() {
		return memberPwd;
	}
	public String getMemberName() {
		return memberName;
		
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	
	public String email() {
		return email;
	}
}
