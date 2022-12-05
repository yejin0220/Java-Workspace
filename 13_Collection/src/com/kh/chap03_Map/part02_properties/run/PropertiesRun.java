package com.kh.chap03_Map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_Map.part01_hashMap.model.vo.Snak;

public class PropertiesRun {

	public static void main(String[] args) {
		
		
		//Properties : Map계열 => key, value 세트로 저장
		//						 단, Properties의 특징 : key, value모두 String으로 제한되어있음
		
		
		
		Properties prop = new Properties(); //key, value모두 String으로 제한되어있어 제네릭 설정 안해줘도됨
		
		//String이 아닌 값을 넣게 될 경우
		//Map 계열이기 때문에 put메서드 활용 가능
//		prop.put("다이제", new Snak("초코맛",1000));
//		System.out.println(prop);
//		System.out.println(prop.get("다이제"));
//		
//		//단, 주로 Properties를 사용하는 경우는 Properties에 담겨있는 key+value값 세트들을 파일로 기록하기 위해서 사용됨.
//		
//		try {
//			prop.store(new FileOutputStream("test,properties"), "Properties test");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		=> 에러가 남
		
		//Properties에 값을 추가할 때?
		//1. setProperties(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		//{Set=HashSet, List=ArrayList, Map=Properties} 출력 : map은 중복된 key값이라 하나만 출려되었음
		//저장순서 유지x, key값 중복 안됨
		
		System.out.println(prop);
		
		
		//값 가져오기
		//2. 
		System.out.println(prop.get("Set"));
		
		
		//3. store(OutputStream os, String Comments) : Propertied에 담긴 key-value값을 파일로 출력
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties test");
			
			
		//4. storeToXML(OutputStrea os, Stirng Comments) : Properties 
			prop.storeToXML(new FileOutputStream("test.xml"), "Properties test");
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
