package com.kh.chap04_assist.run;

import com.kh.chap04_assist.medol.dao.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
	 
		BufferedDao  bf = new BufferedDao();
		bf.fileSave();
		bf.fileRead();

	}

}
