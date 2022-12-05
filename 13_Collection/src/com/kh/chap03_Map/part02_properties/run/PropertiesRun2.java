package com.kh.chap03_Map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {
		
		Properties prop = new Properties(); //비어있는 상태, 내부적으로 아무 값이 없음
		//생성되어있는 문서파일에서 값을 불러오는 방법.
		
		
		try {
			//5. load(InputStream is)
			//prop.load(new FileInputStream("rest.properties"));
			
			
			
			
			//6.loadFromXML(InputStream is)
			prop.loadFromXML(new FileInputStream("test.xml"));
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(prop.getProperty("Map"));
		System.out.println(prop.getProperty("List"));

	}

}
