package com.kh.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args)
	{
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 변수 word에 초기화
		// 영어 대문자 확인 : true
		int a = 50;
		int b = 30;
		
//		boolean result1, result2, result3, result4;
//		result1 = (a!=b)&&(a<b);
//		result2 = (a<b) || (a==b);
//		result3 = (a>b) && (a!=b);
//		result4 = (a>b) || (a==b);
//		System.out.println("result1의 결과값 : " + result1);
//		System.out.println("result2의 결과값 : " + result2);
//		System.out.println("result3의 결과값 : " + result3);
//		System.out.println("result4의 결과값 : " + result4);
//				
//		int a1 = 70;
//		int b2 = 55;
//		boolean result5, result6, result7, result8, result9, result10;
//		result5 = (a1==b2)||(a1++<100);
//		result6 = (a1<b2) && (--b2<55);
//		result7 = (a1!=b2) && (b2--< a++);
//		result8 = (a++!=b2) || (b2++>85);
//
//		System.out.println("result5의 결과값 : " + result5);
//		System.out.println("result6의 결과값 : " + result6);
//		System.out.println("result7의 결과값 : " + result7);
//		System.out.println("result8의 결과값 : " + result8);
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
//		String words = sc.next();
//		System.out.println("문자열 확인 : " + words);
		// 문자열에서 첫번째 인덱스값을 자르니까 문자가 됨
		char word = sc.next().charAt(0);
		System.out.println("문자 출력 : " + word);
		boolean result = (word >= 'A') && (word <= 'Z');
		System.out.println("영어 대문자 확인 : " + result);
	}
}
