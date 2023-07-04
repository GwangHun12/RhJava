package com.kh.day07.oop.inheritance;

import com.kh.day07.oop.Point.ColorPoint;
import com.kh.day07.oop.Point.Point;

public class Exam_Inheritance {
	public static void main(String [] args) {
		// (x, y)의 한점을 표현하는 Point클래스와 이를 상속받아 색을 가진 점을 표현하는
		// ColorPoint 클래스를 만들고 활용해보자
		// ctrl + shift + o  =  all import 
		Point p = new Point(1, 2);
//		p.set(1, 2);
		p.showPoint();
		ColorPoint cp = new ColorPoint(3, 4, "red");
//		cp.set(3, 4);
//		cp.setColor("red");
		cp.showColorPoint();
		ColorPoint cp2 = new ColorPoint(5, 6, "blue");
		cp2.showColorPoint();
	}
}


	
