package com.kh.practice.file.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDao {
	
	public boolean checkName(String file) {
		
		return new File(file).isFile(); //내가 매개변수로 입력한 값이 file인지아닌지 검사해주는것.=>true이면 이미생성되어있음
																				//	=> flase이면 파일이 없음
		
	}
	
	public void fileSave(String file, String s) {
		//매개변수 s를가지고 파일안에 기록, 파일에 출력을 할 것이면 Writer를 사용
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write(s);
			bw.flush(); //혹시모를 오류 대비
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}
	
	public StringBuilder fileOpen(String file) {
		
		StringBuilder sb = new StringBuilder() ;
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			//br.readLine(); :file이 String타입이기 때문에 단독으로 사용할 수 없음
			String value = null;
			
			while((value=br.readLine()) != null) { //value값에 br.readLine 혹은 null 값이 대입됨.
				sb.append(value+"\n"); //반복을 진행할때마다 입력받은 문자를 다 value에 저장, 
				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	return sb;
		
	}
	
	
	public void fileEdit(String file, String s) {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))) {
			bw.write(s);
			bw.flush(); //혹시모를 오류 대비
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
}
