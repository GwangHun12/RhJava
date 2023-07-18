package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalculatorServer {

	public static void main(String[] args) {// 서버 구동중입니다.
//		클라이언트의 연결을 기다리고 있습니다..
//		클라이언트와 연결되었습니다.
//		받은 메시지 : 23
//		받은 메시지 : 24 + 42
//		클라이언트가 종료하였습니다.
		ServerSocket serverSocket = null;
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
//			System.out.println(".");
//			Thread.sleep(1000);	// 지연...
//			System.out.println("..");
//			Thread.sleep(1000);	// 지연...
//			System.out.println("...");
//			Thread.sleep(1000);	// 지연...
//			System.err.println();
			System.out.println("서버 구동중입니다.");
			for (int i = 1; i <= 30; i++) {
				int progress = i;
				System.out.print("=");
				Thread.sleep(100);
			}
			System.out.println("100%");
			System.out.println();
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다..");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			// 받을 준비
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
//			System.out.print("보낸 메시지 : ");
//			String sendMsg = sc.nextLine();
//			dos.writeUTF(sendMsg);
			while (true) {
				// 데이터 받기
				String recvMsg = dis.readUTF();
				if(recvMsg.equalsIgnoreCase("exit")) {
					System.out.println("클라이언트가 종료되었습니다.");
					break;		 // break로 while문을 더이상 동작하지 않게.
				}
				System.out.printf("받은 메시지 : %s\n", recvMsg);
				// 24 + 42 -> 띄어쓰기 기준으로 문자열 배열을 만듬
				// 24 / + / 42
				String[] msgArrs = recvMsg.split(" ");
				if(msgArrs.length != 3) {
					String errMsg =
							"end";
					dos.writeUTF(errMsg);
					continue;
				}
				int num1 = Integer.parseInt(msgArrs[0]);	// 띄어쓰기 기준으로 문자열 배열을 만듬
				int num2 = Integer.parseInt(msgArrs[2]);	// day09 wrapperpkg
				String operator = msgArrs[1];
				String result = "";
				switch (operator) {
				case "+":
					result = 
					String.valueOf(num1 + num2);	// 변환해도 되고
					break;
				case "-":
					result =
					String.valueOf(num1 - num2);
					break;
				case "*":
					result = num1 * num2 + "";		// 문자열 추가해도 된다.
					break;
				case "/":
					result = num1 / num2 + "";
					break;
				case "%":
					result = num1 % num2 + "";
					break;
				}
				// 결과 보내고 끝
				dos.writeUTF(result);	
				dos.flush();		// 생략 가능.
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
