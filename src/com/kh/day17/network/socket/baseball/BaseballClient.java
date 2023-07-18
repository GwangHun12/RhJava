package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseballClient {

	public static void main(String[] args) {
//		클라이언트 소켓을 생성하였습니다.
//		/127.0.0.1
//		게임 준비 완료
//		--> 4 2 1
//		0스트라이크 0볼
//		--> 1 2 3
//		0스트라이크 1볼
//		--> 2 3 4
//		1스트라이크 0볼
//		--> 5 3 8
//		2스트라이크 0볼
//		--> 5 3 7
//		1스트라이크 1볼
//		--> 7 3 8
//		3스트라이크 0볼
//		축하합니다. 아웃입니다!
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		DataOutputStream dos = null;
		InputStream is = null;
		DataInputStream dis = null;
		String address = "127.0.0.1";
		int port = 8888;
		try {
			Socket socket = new Socket(address, port);
			System.out.println("클라이언트 소켓을 생성하였습니다.");
			System.out.println("/" + address);
			System.out.println("게임 준비 완료");
//			System.out.print("--> ");
//			String input = sc.nextLine();
//			 입력한거 보내주기

			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			is = socket.getInputStream();
			dis = new DataInputStream(is);

			while (true) {

				System.out.print("--> ");
				String input = sc.nextLine();
				dos.writeUTF(input);
				dos.flush();

				String recvMsg = dis.readUTF();
				System.out.println(recvMsg);
//				if(recvMsg.equals("3스트라이크 0볼")) {
				if(recvMsg.startsWith("3")) {
					System.out.println("축하합니다. 맞췄습니다.");
					break;
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
