package com.kh.practice.student.view;


import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();
	
	public StudentMenu() { 
		
		System.out.println("==============학생 정보 출력===============");
		
		Student[] sArr= ssm.printStudent();
		
		System.out.println();		
		
		
		
		
		
		System.out.println("=============학생 성적 출력================");
		
		ssm.avgScore();
		
		System.out.println();
		
		
		
		
		System.out.println("=============성적 결과 출력================");
		
//		for(  Student std :  sArr) {  //sArr배열을 반복하면서 std변수에 값을 대입
//			if(std.getScore() <StudentController.CUT_LINE) {
//				System.out.println(std.getName()+"학생은 재시험 대상입니다.");
//			}else {
//				System.out.println(std.getName()+"학생은 통과입니다.");
//			}
//	
		for(  Student std :  sArr) {
			String result = "통과";
			if(std.getScore() <StudentController.CUT_LINE) {
				result ="재시험 대상";
			}
			System.out.printf("%s학생은 %s입니다. \n",std.getName(),result);
		
		
		}
		
		
		
		
		
		
	}
	
	
}
