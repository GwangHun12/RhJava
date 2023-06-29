package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_Calulator {
	public static void main(String [] args)
	{
		for(;;) {
			
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 하나 더 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0);
		int result = 0;
		switch(operator) {
		case '+' : 
			result = num1 + num2;
			break;
		case '-' : 
			result = num1 - num2;
			break;
		case '*' : 
			result = num1 * num2;
			break;
		case '/' : 
			result = num1 / num2;
			break;
		case '%' : 
			result = num1 % num2;
			break;
		}
		System.out.print(num1 + " " + operator + " " + num2 + " = " + result);
		}
	}
}
