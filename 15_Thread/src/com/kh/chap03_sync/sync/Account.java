package com.kh.chap03_sync.sync;

//공유자원으로 사용
//1개의 계좌
//2개의 ATM기-> atm1/atm2

public class Account {
	
	private int balance = 1200;
	
	
	public int getBalance() {
		return balance;
		
	}
	
	
	//출금 메서드 -> 출금했을때 남은 돈 얼마?
	public  void withdraw(int money)	 {
		
		synchronized(this) { //동기화 시킬 객체 : 현재 계좌 객체
			
			String thName = Thread.currentThread().getName();
			System.out.println("현재 잔액은 ? "+balance);
			
			if(money <= balance) { //잔액보다 적게 출금할때
				balance -= money;
				System.out.printf("[%s] %d원 출금  >>> 잔액 : %d원 남았습니다. \n", thName, money, balance);
				
			}else { 
				System.out.printf("[%s] %d원 출금시도  >>> 잔액이 부족합니다. \n", thName, money);
			}
		}
	}
	
	
	
	
	
	
	
	
}
