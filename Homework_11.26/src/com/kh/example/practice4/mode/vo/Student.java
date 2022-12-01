package com.kh.example.practice4.mode.vo;

public class Student {
	
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		 grade = 2;
		classroom = 8;
		 name = "김예진";	
		 height = 168.7;
		 gender = '여';
	}
	
	public Student() {
		
		
	}
	
	public void setGrade(int grade) {
		this.grade=grade;
		
	}
	
	public void setClassroom(int classroom)	{
		this.classroom=classroom;
	}
	
	public void setName(String name) {
		this.name= name;
				
	}
	
	public void setHeight(double height) {
		this.height=height;	
		
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}

	public int getGrade() {
		return grade;
	}

	public int getClassroom() {
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
	
	
	public void information() {
		System.out.println(name+"학생은 "+grade+"학년 "+classroom+"반 이며 키는"+height+"cm인"+gender+"학생입니다.");
	}
}
