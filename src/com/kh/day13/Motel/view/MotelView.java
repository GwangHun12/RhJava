package com.kh.day13.Motel.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day13.Motel.model.Motel;

public class MotelView {

	public int motelMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("모텔 관리 프로그램");
		System.out.print("1.입실   ");
		System.out.print("2.퇴실   ");
		System.out.print("3.방 보기   ");
		System.out.println("4.종료");
		System.out.println("선택");
		int choice =sc.nextInt();
		return choice;
	}

	public int inputMotelNum() {
		// TODO Auto-generated method stub
		System.out.println("몇번방에 입실하겠습니까?");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	public int outputMotelNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번방에서 퇴실하시겠습니까? : ");
		int number = sc.nextInt();
		return number;
	}

	public void displaySuccescc(String msg) {
		System.out.println(msg);
	}
	public void displayError(String msg) {
		System.out.println(msg);
	}

	public void showAllMotelList(List<Motel> category) {
		// TODO Auto-generated method stub
		for(Motel motel : category) {
			System.out.println(category + "번방에서 퇴실하셨습니다.");
		}
	}
	


}
