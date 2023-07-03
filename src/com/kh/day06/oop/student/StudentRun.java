package com.kh.day06.oop.student;

import java.util.Scanner;

public class StudentRun {
	static int index = 0;
	public static void main(String[] args) {
		Student [] stdArr = new Student[2];
		finish :
		while(true) {
			int choice = printMenu();
		
		switch(choice) {
		case 1: 
			inputScore(stdArr);
			break;
		case 2: 
			printScore(stdArr);
			break;
		case 3: 
			checkPass(stdArr);
			break;
		case 4: 
			System.out.println("====== 프로그램이 종료되었습니다. =======");
			break finish;
		}
	}
}
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("======== 학생 성적 확인 프로그램 =========");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.println("======== 메뉴 입력 =======");
		int choice = sc.nextInt();
		return choice;
		
	}
	public static void inputScore(Student [] stdArr) {
		for(int i = 0; i < stdArr.length; i++) {
			Scanner sc = new Scanner(System.in);
			stdArr[i] = new Student();
			System.out.println((i+1)+ "번째 학생 정보 입력");
			System.out.println("학생 이름 입력 : ");
			stdArr[i].name = sc.next();
			System.out.println("1차 점수 입력 : ");
			stdArr[i].firstScore = sc.nextInt();
			System.out.println("2차 점수 입력 : ");
			stdArr[i].secondScore = sc.nextInt();
			}
	}
	public static void printScore(Student [] stdArr) {
		for(int i = 0; i < stdArr.length; i++) {
			System.out.println((i+1) + "번째 학생 정보 출력");
			System.out.println(stdArr[i].name + "학생의 점수는 1차 점수 : " 
					+ stdArr[i].firstScore + ", 2차 점수 : " + stdArr[i].secondScore + "점입니다.");
		}
	}
	public static void checkPass(Student [] stdArr) {
		for(int i = 0; i < stdArr.length; i++) {
			double avg = stdArr[i].getAvg();
			int num1 = stdArr[i].firstScore;
			int num2 = stdArr[i].secondScore;
			System.out.println((i+1)+ "번째, " + stdArr[i].name + "학생 확인 결과");
			if(avg >= 60) {
				if(num1 < 40) {
					System.out.println("1차 시험 재평가");
				}else if(num2 < 40) {
					System.out.println("2차 시험 재평가");
				}else {
					System.out.println("통과");
				}
			}else {
				if(num1 < 60) {
					System.out.println("1차 시험 재평가");
				}
				if(num2 < 60) {
					System.out.println("2차 시험 재평가");
				}
		}
		}
	}
}