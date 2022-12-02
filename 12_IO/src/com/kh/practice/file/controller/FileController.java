package com.kh.practice.file.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.kh.practice.file.model.dao.FileDao;

public class FileController {
	
	FileDao fd = new FileDao();
	
	
	
	public boolean checkName(String file) {
		return fd.checkName(file);

		
	}
	
	
	public void fileSave(String file, StringBuilder sb) {
		
		fd.fileSave(file, sb.toString()); //매개변수로 넘어온 sb를 String으로 바꾸기
		
		
	}
	
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
		//fd의 fileOpen()매개변수로 file을 넘겨주고 그 반환값을 그대로 받아 반환.
	}
	
	
	public void fileEdit(String file, StringBuilder sb) {
		
		fd.fileEdit(file, sb.toString());
		
	}

}
