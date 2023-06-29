package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void forExercise1() {
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
		int count = 0;
		for(int i = 1; i <= 10; i++) {
			count += i;
			if(i < 10) {
			System.out.print(i + "+");
			}
			if(i == 10) {
				System.out.print(i + "=" + count);
			}
		}
	}
	
	public void forExercise2() {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 9숫자하나 입력 : ");
		int dan = sc.nextInt();
		System.out.println(dan + "단");
		if(dan >= 1 && dan <= 9) {
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		}else {
			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다");
		}
	}
	
	public void forDoubleExercise1() {
		// 구구단 출력
		System.out.println("2단 옆에 3단, 3단 옆에 4단, 4단 옆에 5단이 되도록 작성하시오.");
		for(int k = 1;k < 10; k++) {
			for(int h = 2; h < 10; h++) {
				System.out.print(h + " * " + k + " = " + k * h + "\t");
			}
			System.out.println();
		}
	}
	
	public void forDoubleExercise2() {
		// 별찍기
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void forDoubleExercise3() {
		System.out.println("0시 0분부터 23시 59분까지 출력하기!");
		for(int h = 0; h < 24; h++) {
			for(int m = 0; m < 60; m++) {
				System.out.printf("%2d시 %2d분\n", h, m);
//				System.out.println(h + "시	" + m + "분");
			}
		}
	}

}
