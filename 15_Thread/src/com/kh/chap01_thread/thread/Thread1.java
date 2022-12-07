package com.kh.chap01_thread.thread;

//쓰레드 생성 방법
/*
 * 1. 직접적으로 Thread클래스를 상속받는 방법
 * 	  - Thread클래스 상속 후에 run() 메소드 오버라이딩
 *    - Thread1 객체를 생성 후 start()메서드를 호출
 * 
 */


public class Thread1 extends Thread {
	
	/*
	 * 쓰레드 실행시 Run메서드 호출됨
	 * 따라서 작업을 하고자 하는 코드를 반드시 RUN메서드 안에 재정의 해줘야한다.
	 * 즉, Thread클래스 안에 있는 run메서드 호추
	 * 
	 * 
	 * 
	 */
	@Override
	public void run() {
		//내가 작업할 코드를 작성
		
		for(int i =1; i<=1000; i++) {
			System.out.println(this.getName()+"["+i+"]");
			//getName() : 스레드의 이름 반환, 순차적으로 Thread-0, Thread-1, 2 ... 이름이 붙는다.
		}
	}
	
	

}
