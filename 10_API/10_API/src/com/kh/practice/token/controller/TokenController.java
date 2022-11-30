package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	
	public TokenController() {	
		
		
	
	}

	
	
	public String afterToken(String str) {
		StringTokenizer stn = new StringTokenizer(str, " ");
		
		//방법1.String 클래스 이용
//		String result = "";
//		while(stn.hasMoreTokens()) {
//			result += stn.nextToken();
//		}
		
		//방법2.
		StringBuilder sb = new StringBuilder();
		while(stn.hasMoreTokens()) {
			sb.append(stn.nextToken());
		}
		
		
	}
	
	public String firstCap(String input) {
		//매개변수로 받아온 input의 첫 버째 글자만 대문자로 바꾼 문자열 반환
		//apple =>Apple
		//a, pple => a(A)+pple
		//substring(0.1)
		
		String upper = input.substring(0, 1).toUpperCase(); //0이상 1미만의 인덱스 범위를 짤라오고나서, 짤라온 문자를 대문자로 변환해주고, upper에 대입을 해줌
 		return upper+input.substring(1); //1번 인덱스부터 인덱스 끝까지 반환
 										 //대문자로 변환한 문자 + 0번 인덱스를 제외한 1번 인덱스부터 끝까지 반환
		
	}
	
	public int findChar(String input, char one) {
		//매개변수의 문자가 문자열 안에 몇개 들어가있은지?
		int count = 0;
		
		//방법1. 
//		for(int i =0; i<input.length();i++) {
//			if(input.charAt(i); == one) {
//				count++;
//			}
//		}
//		return count;
		
		//방법2
		//tocharArray 활요압ㅇ법
		char[] arr = input.toCharArray(); //apple =? {'a', 'p', 'p', 'l', 'e'}로 변환
	
		for(char c : arr) {
			if(c == one) {
				count++;
			}
		}return count;		
//		
		
	}
}
