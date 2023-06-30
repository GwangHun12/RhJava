package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram2 {
	Student student = new Student();
	public static void main(String [] args)
	{
		
//		====== 메인 메뉴 ======
//				1. 성적입력
//				2. 성적출력
//				3. 종료
//				선택 : 1
//				====== 성적 입력 =======
//				국어 : 100
//				영어 : 90
//				수학 : 80
//				====== 메인 메뉴 ======
//				1. 성적입력
//				2. 성적출력
//				3. 종료
//				선택 : 2
//				====== 성적 출력 ======
//				국어 : 100
//				영어 : 90
//				수학 : 80
//				총점 : 270
//				평균 : 90.00
		
		finish :
		while(true) {
			Scanner sc = new Scanner(System.in);
			printMenu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				Student.inputStudentScore();
				break;
//			국어 : 100
//			영어 : 90
//			수학 : 80
			case 2 : 
				Student.printStudentScore();
			break;
//			1. 성적입력
//			2. 성적출력
//			3. 종료
//			선택 : 2
			case 3 : 
				showGoodByte(); 
				break finish;
			default : printException();
			}
		}
		
	}
	static void printMenu() {
		System.out.println("====== 메인 메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.println("선택 : ");
	}
	
	
	
	
	
	public static void showGoodByte() {
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	public static void printException() {
		System.out.println("잘못입력하셨습니다. 메뉴를 선택해주세요.");
	}
}
