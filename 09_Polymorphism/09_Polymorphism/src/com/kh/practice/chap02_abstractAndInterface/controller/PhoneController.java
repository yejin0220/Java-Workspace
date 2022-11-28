package com.kh.practice.chap02_abstractAndInterface.controller;

import com.kh.practice.chap02_abstractAndInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractAndInterface.model.vo.V40;

public class PhoneController {
	
	public String[] method = new String[2];
	

	public String[] method() {
	 GalaxyNote9 gn = new GalaxyNote9() ;
	 V40 v = new V40();	
	 
	 method[0] = gn.printinformation();
	 
		
	}
	


}
