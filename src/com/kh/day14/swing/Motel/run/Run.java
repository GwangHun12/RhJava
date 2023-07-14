package com.kh.day14.swing.Motel.run;

import com.kh.day14.swing.Motel.function.MotelFunction;

public class Run {
	public static void main(String[] args) {
		MotelFunction motelfunc = new MotelFunction();
		
		finish :
		while (true) {
			int choice = motelfunc.printMenu();

			switch (choice) {
			case 1:
				motelfunc.roomIn();
				break;
			case 2:
				motelfunc.roomOut();
				break;
			case 3:
				motelfunc.roomInfo();
				break;
			case 4:
				System.out.println("프로그램이 종료되었습니다.");
				break finish;
			}
		}
	}
}
