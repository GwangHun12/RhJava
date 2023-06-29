package com.kh.day02.condition.exercise;

import java.util.Scanner;

public class Exercise_if1 {
	public static void main(String[]args)
	{
		// 점수와 학년을 입력 받아 60점 이상이면 합격,
		// 미만이면 불합격을 출력한다. 4학년의 경우 70점 이상이어야 합격입니다.
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt();
		System.out.print("학년을 입력하세요(1~4) : ");
		int grade = sc.nextInt();
		
//		if(grade == 4) {
//			if(score >= 70) {
//			}else 
//		}
//		if(score >= 60)
//			System.out.println("합격입니다.");
//		else
//			System.out.println("불합격입니다.");
//		else if(scre >=70)
			
//		if(score >= 60) {
//			if(grade == 4) {
//					//합격
//				if(score>= 70) {
//					System.out.println("합격입니다.");
//				}else if(score < 70) {
//					//불합격
//					System.out.println("불합격입니다.");
//				} 
//			} 
//			else {
//					System.out.println("합격입니다.");
//				} 
//		}
//		else {
//					System.out.println("불합격입니다.");
//				}
//					//합격
		if(grade < 4) {
			if(score >= 60) System.out.println("합격입니다.");
			else System.out.println("불합격입니다.");
		}
		else {
			if(score >= 70) System.out.println("합격입니다.");
			else System.out.println("불합격입니다.");
		}
				
	}
}
