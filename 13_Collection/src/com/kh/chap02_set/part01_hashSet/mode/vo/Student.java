package com.kh.chap02_set.part01_hashSet.mode.vo;

public class Student {

	private String name;
	private int age;
	private int score;
	
	
	
	public Student() {
		
		
	}



	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) //this => 현재 객체의 주소값과 매개변수로 들어온 객체의 주소값이 동등한가 비교함
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())//현재객체 class와 비교하고자하는 매개변수의 class간의 주소값이 같은지 다른지 비교
			return false;
		Student other = (Student) obj; //Student클래스로 다운캐스팅 
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true; //모든 조건을 만족시켰을때 true값 반환
	}
	
//	@Override
//	public boolean equals(Object obj)	 { //매개변수 Object obj는 equals의 특성상 어쩔 수없이 저렇게 써줌
//		
//		//Student객체.equals(비교할 Studnet)의 필드값이 일치하냐?
//		//this 				other
//		//this. => 현재객체
//		
//		
//		Student other = (Student) obj; //다운캐스팅
//		if(this.age == other.age && this.score ==other.score&&this.name==other.name) {
//			return true;
//			
//		}else {
//			return false;
//		}
//		
//	}
//	
//	
//	//hashCode메소드 재정의 : 현재 필드값을 가지고(주소값이 아님) 해시코드를 만들어서 반환하도록 재정의
//	
//	@Override
//	public int hashCode() {//주소값을 10진수 형태로 받아와서 반환형 int
//		String hash = name+age+score;
//		return hash.hashCode();
//		
//		
//		
//		
//		
//	}

	
	
	
	
	
	
}
