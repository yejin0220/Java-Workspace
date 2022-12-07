package com.kh.chap03_sync.sync;

public class Consumer implements Runnable {
	
	private Buffer buffer;
	
	public Consumer() {
		
		
		
	}
	
	public Consumer(Buffer buffer) {
		this.buffer=buffer;
		
		
	}
	
	
	@Override
	public void run() {
		//get데이타 호출
		for(int i =1; i<=10; i++) {
			
			try {
				buffer.getData();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} //0.1초간 일시정지
			
		}
		
		
	}
}
