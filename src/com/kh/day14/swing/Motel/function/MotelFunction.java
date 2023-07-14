package com.kh.day14.swing.Motel.function;

import java.util.Scanner;

public class MotelFunction {
	int roomArrs[];
	public MotelFunction() {
		roomArrs = new int[10];
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.입실");
		System.out.print("2.퇴실");
		System.out.print("3.방보기");
		System.out.println("4.종료");
		int choice = sc.nextInt();
		System.out.println("선택");
		return choice;
	}

	public void roomIn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번방에 입실하시겠습니까?");
		int roomIn = sc.nextInt();
		System.out.println(roomIn + "번방에 입실하셨습니다.");
	}

	public void roomOut() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번방에서 퇴실하시겠습니까?");
		int roomOut = sc.nextInt();
		System.out.println(roomOut + "번방에서 퇴실하셨습니다.");
	}

	public void roomInfo() {
		for()
	}
	

}
