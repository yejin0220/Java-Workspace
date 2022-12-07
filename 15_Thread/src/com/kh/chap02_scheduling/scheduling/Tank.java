package com.kh.chap02_scheduling.scheduling;

public class Tank implements Runnable{

	
	
	@Override
	public void run() {
		
		
		System.out.println(Thread.currentThread().getName()); //현재실행중인 스레드를 반환받고 이름을 알아옴
		
		for(int i =0; i<20; i++) {
			
			try {
				
				System.out.println("tank shooting");
				Thread.sleep(100);
				
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}
	
	
}
