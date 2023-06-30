package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Student {
	static String name;
	static int kor;
	static int eng;
	static int math;
	
	static void printStudentScore() {
		int sum = Student.kor+Student.eng+Student.math;
		System.out.println("====== 메인 메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.println("선택 : ");
		System.out.printf("국어 : %d\n", Student.kor);
		System.out.printf("영어 : %d\n", Student.eng);
		System.out.printf("수학 : %d\n", Student.math);
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", (double)(sum)/3);
	}
	static void inputStudentScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 성적 입력 =====");
		System.out.println("국어 : ");
		Student.kor = sc.nextInt();
		System.out.println("영어 : ");
		Student.eng = sc.nextInt();
		System.out.println("수학 : ");
		Student.math = sc.nextInt();
	}
}
