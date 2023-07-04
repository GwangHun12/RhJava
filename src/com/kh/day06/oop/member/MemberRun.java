package com.kh.day06.oop.member;

import java.util.Scanner;

public class MemberRun {

	public static void main(String[] args) {
		Member [] memArrs = new Member[3];
		finish :
			while(true) {
				int choice = printMenu();
				switch(choice) {
				case 1 : 
					inputScore(memArrs);
					break;
				case 2 :
					printScore(memArrs);
				case 3 : 
					System.out.println("프로그램이 종료되었습니다.");
					break finish;
				default : 
					System.out.println("해당 메뉴는 존재하지 않습니다.");
					break;
				}
			}
	}

	private static void checkPass(Member[] memArrs) {
		// TODO Auto-generated method stub
		
	}

	private static void printScore(Member[] memArrs) {
		// TODO Auto-generated method stub
		
	}

	private static void inputScore(Member[] memArrs) {
		// TODO Auto-generated method stub
		
	}

	private static int printMenu() {
		// 회원관리 프로그램
		// 1. 회원정보입력
		// 2. 회원정보출력
		// 3. 프로그램 종료
		// 메뉴 입력 :
		Scanner sc = new Scanner(System.in);
		System.out.println("회원관리프로그램");
		System.out.println("1. 회원정보입력");
		System.out.println("2. 회원정보출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		return 0;
	}
}
