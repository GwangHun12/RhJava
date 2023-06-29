package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_While {
	public void whileExercise1() {
//		while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면 
//		입력한 수의 합을 출력하시오.
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int sum = 0;
		while (input != -1) {
			System.out.print("정수 하나 입력 : ");
			input = sc.nextInt();
			sum += input;
		}
		System.out.println("입력하신 수의 합은 " + (sum + 1) + " 입니다.");
		// for(;;) {}
		
		// 두번째 방법
//		while(true) {
//			System.out.print("정수 하나 입력 : ");
//			input = sc.nextInt();
//			if(input != -1) {
//				// 계산
//			}else {
//				break;
//			}
//		}
	}
	
	public void whileExercise2() {
//		while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
//		1 ~ 100 사이의 홀수의 합 : 000
		int sum = 0;
		int i = 0;
		while(i < 100) {
			if(i % 2 != 0) {
				sum += i;
			}		
			i++;
		}
		System.out.println("1 ~ 100 사이의 홀수의 합 : " + sum);	
	}

}
