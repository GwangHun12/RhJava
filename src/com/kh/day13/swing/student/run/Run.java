package com.kh.day13.swing.student.run;

import java.util.Scanner;

import com.kh.day13.swing.student.controller.StudentController;
import com.kh.day13.swing.student.view.StudentView;

public class Run {
	public static void main(String[] args) {
		StudentView view = new StudentView();
		StudentController sController = new StudentController();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			choice = view.studentMenu();
			switch(choice) {
			case 1: 
				std = view.inputInfo();
				sController.addStdInfo(std);
			}
			
		} while(choice !=0);
	}
}
