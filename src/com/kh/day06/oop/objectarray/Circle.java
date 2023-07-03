package com.kh.day06.oop.objectarray;

public class Circle {
	int radius;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {     // void가 아닌 다른 문자열을 쓸시 return해줘야함
		double area = 3.14*radius*radius;
		return area;
	}
}
