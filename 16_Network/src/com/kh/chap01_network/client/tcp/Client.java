package com.kh.chap01_network.client.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	
	public void clientStart() {
		//1. 서버의 IP주소와 서버가 정한 "포트번호"를 매개변수로 하여 "클라이언트용 소켓"객체 생성
		
		int port = 30027;
		String str = null;
		String serverIP =null;
		Socket socket = null;
		
		
		
	try {
		//현재(로컬)환경의 ip주소를 알아내는 부분
		serverIP =InetAddress.getLocalHost().getHostAddress();
		System.out.println(serverIP);
		
		//서버에 연결을 요청하는 구문(요청하고자 하는 서버의 ip주소와port번호를제시하면서 소켓 생성)
		socket = new Socket(serverIP, port);
		//서버와 연결이 실패한다면 null값 반환, => 즉, null이면 실패
		if(socket != null) {
			//2. 서버와의 입출력 스트림 오픈
			InputStream is = socket.getInputStream(); //서버로부터 "메세지 받기 성공"값을 입력 받을 스트림
			OutputStream os = socket.getOutputStream(); //서버로 위의 값을 출력하는 스트림
			
			//3. 보조스트림을 통한 성능 개선
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			PrintWriter pw = new PrintWriter(os, true);
			
			//4. Scanner를 통해 값을 입력받고, 스트림을 통해 입출력하도록 하기
			Scanner sc = new Scanner(System.in);
			do {
				
				System.out.println("서버에 보낼 내용 : ");
				str = sc.nextLine();
				
				pw.println(str);
				
				if(str == null || "exit".equals(str)) {
					System.out.println("접속종료!");
					break;
					
				}
				
				String message = br.readLine();
				System.out.println("받은메세지 : "+message);
			}while(true);
			
			//5. 통신종료(스트림, 소켓 닫기)
			pw.close();
			br.close();
			socket.close();
		}
		
		
		
	} catch (UnknownHostException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
		
		
		
		
		
	}

}
