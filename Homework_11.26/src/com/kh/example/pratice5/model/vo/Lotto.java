package com.kh.example.pratice5.model.vo;

import java.util.Arrays;

public class Lotto {
	
	private int [] lotto = new int [6];
	
	{	
		
		for(int i =0; i<lotto.length; i++) {
			int random = (int)(Math.random()*45+1);
			lotto[i] = random;
			//lotto의 5번째 인덱스까지 값이 입력되고나서, 중복되지 않았는지 검사하려면 앞에서부터 순차적으로 검사해야함.
			for(int j = 0; j<=i; j++) {
				if(lotto[j]==random) {
					i--;
					break;
				}
			}
		}
		
	}
	
	public Lotto(){
		
		
	}

	
	public void setLotto(int[] lotto) {
		this.lotto=lotto;
	}
	
	public int[] getLotto() {
		return lotto;
	}
	
	public void information() {
		System.out.println(Arrays.toString(lotto));
	}
}
