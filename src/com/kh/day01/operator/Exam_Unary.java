package com.kh.day01.operator;

public class Exam_Unary {
	public static void main(String [] args)
	{
		// 단항 연산자
		int a1 = 1;
		
		// a++, ++A -> a = a + 1;
		System.out.println(a1++);  // 후위연산(나중연산)
//		System.out.println((--a)+b);
		// a가 2인 상태
		System.out.println(++a1);  // 전위연산(먼저연산)
		// a가 3인 상태
		System.out.println(a1);
		int a = 10;
		int b = 20;
		int c = 30;
		// 문제 1
		a++;
//		int a : 11, b : 20, c: 30;
		b = (--a) +b;
		// a : 10, b : 30, c : 30;
		c = (a++) + (--b);
		System.out.print("a : " + a + ", b : " + b + ", c : " + c);
		System.out.println();
		boolean flag = true;
		System.out.println(!!!!flag);
		
		int x = 100;
		int y = 33 ;
		int z = 0;
		
		x--;
		// x : 99, y : 33, z : 0;
		z = x-- + --y;    // 99 + 32 = 131 
		// x : 98, y : 32, z : 131;
		x = 99 + x++ + x;  // 99 + 98 + 99 = 296
		// x : 296, y : 32, z : 131
		y = y-- + y + ++y;    // 32 + 31 + 32
		// x : 296, y : 95, z : 131
		System.out.println("x : " + x + ", y : " + y + ", z : " + z);
	}
}
