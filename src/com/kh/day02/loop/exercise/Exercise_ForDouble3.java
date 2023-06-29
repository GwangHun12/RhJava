package com.kh.day02.loop.exercise;

public class Exercise_ForDouble3 {
	public static void main (String [] args)
	{
		for(int k = 0; k < 10; k++) {
			for(int i = 0; i < k+1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		int count = 1;
//		for(int k = 0; k < 10; k++) {
//			for(int i = 0; i < count; i++) {
//				System.out.print("*");
//			}
//			count++;
//			System.out.println();
//		}
	}
}
