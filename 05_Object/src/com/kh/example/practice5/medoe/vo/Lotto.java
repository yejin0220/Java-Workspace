package com.kh.example.practice5.medoe.vo;

import java.util.Arrays;

public class Lotto {
	
	private int[] lotto = new int[6];
	
	{//난수가 들어갈 곳 -> 반복문을 통해 lotto배열에 순차적으로 접근해 값 대입
		for(int i=0; i<lotto.length;i++) { //lotto.length -> length는 lotto의 필드
			int random = (int)(Math.random()*45+1); //현재 인덱스 기준으로 앞 인덱스까지 값이 랜덤값인지 아닌지 검사 먼저 해야함.
			lotto[i] = random;
			for(int j =0; j<i; j++) {
				if(lotto[j] == random) {
					i--;
					break;
				}
			}
			  //0.0<=랜덤값 <1.0
			
		}
		
	}
	
	
	public Lotto() {//기본생성자
		
	}

	public void setLotto(int[] lotto) {
		this.lotto=lotto;
	}
	public int[] getLotto() {
		return lotto;
	}
	public void  information() {
		System.out.println(Arrays.toString(lotto));
	}
}
