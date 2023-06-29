package com.kh.day02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args)
	{
		// 구구단 출력
//		for(int k = 2; k < 10; k++) {
//			System.out.println(k + "단");
//			for(int h = 1; h < 10; h++) {
//				System.out.println(k + " * " + h + " = " + k*h);
//			}
//		}
//		System.out.println("3단");
//		for(int h = 1; h < 10; h++) {
//			System.out.println("3 * " + h + " = " + 3*h);
//		}
//		System.out.println("4단");
//		for(int h = 1; h < 10; h++) {
//			System.out.println("4 * " + h + " = " + 4*h);
//		}
		
//		for(int k = 2; k < 6; k++) {
//			for(int i = 2; i < 10; i++) {
//				System.out.println(k + "단" + i + );
//				
//			}
//		}
		
//			System.out.print("3 * 1 = 3\t");
//			System.out.print("4 * 1 = 4\t");
//			System.out.print("5 * 1 = 5\t");
//			System.out.print("6 * 1 = 6\t");
//			System.out.println();
//			System.out.print("2*2 = 4\t");
		for (int k = 1; k < 10; k++) {
			for(int h = 2; h < 10; h++) {
				System.out.print(h + " * "+k+" = "+h+"\t");
		}
		System.out.println();
	}
}
