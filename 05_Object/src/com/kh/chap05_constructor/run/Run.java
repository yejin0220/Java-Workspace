package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.*;

public class Run {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setUserName("user01");
		user1.setUserpwd("1234");
		user1.setUserID("민경민");
		
		User user2 = new User("user01","pass01", "김철수"); //id, pwd, name 순
		
		System.out.println(user2.information());
		
	}

}
