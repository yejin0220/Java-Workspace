package com.kh.chap02_scheduling.scheduling;

public class Car implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()); //스레드의 이름을 알아오는 것.
		
		for(int i =0; i<20; i++) {
			
			try {
				
				System.out.println("Car driving...");
				
				
				//스레드를 일시정지시키는것 
				//한번 반복할때마다 쓰레드를 멈추게함.
				Thread.sleep(100);//스레드를 지정된 시간(ms)만큼 지연시키는 것(일시정지시키는) 메서드(예외처리 반드시 필요)
				
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			
			} 
			
		}
		
		
	}

}
