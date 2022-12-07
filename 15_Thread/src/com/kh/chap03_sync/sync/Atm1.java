package com.kh.chap03_sync.sync;

public class Atm1 implements Runnable {

	
	private Account acc;
	
	public Atm1() {
		
		
		
	}
	
	public Atm1(Account acc) {
		this.acc=acc;
		
	}
	
	@Override
	public void run() {
		
		while(acc.getBalance()> 0) { //계좌에 돈이 0원보다 많이 남아있을때 계속 출금
			int money = (int)(Math.random()*3+1)*100; //100원, 200원, 300원의 랜덤값 
			acc.withdraw(money); //출금
			
			try {
				Thread.sleep(2000); //출금 후 2초간 휴식
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName());
	}
}
