package com.kh.example.practice4.model.vo;

public class Student {
	

	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{//초기화 블럭
		grade =3;
		classroom=15;
		name = "김찐";
		height = 168.7;
		gender = '여';
	}
	
	public Student() {
		
		
	}
	
	//setter를 통해 값을 저장
	public void setGrade(int grade) { //저장을 의미 하기 때문에 void사용,
		this.grade=grade;
	}

	public void setClassroom(int classroom) {
		this.classroom=classroom;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height=height;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	
	//getter을 통해 값을 불러옴
	public int getGrade(){
		return grade;
	}
	
	public int getClassroom(){
		return classroom;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public char getGender() {
		return gender;
	}
	
	//information메서드를 통해 값 추출
	public void information() {
		//000학생은 0학년 0반이고, 키는 00.00cm이며 0학생입니다.
		System.out.printf("%s학생은 %d학년 %d반이고, 키는 %.1fcm이며, %s학생입니다.",name, grade, classroom, height, gender);
	}
	
}

