package com.kh.day08.oop.abstractpkg;

class Line extends Shape {
	// The type Line must implement the inherited abstract method Shape.draw()
	// => 추상메소드 오버라이딩  안할시에 class에 abstract 붙여야 함.
	@Override
	public void draw() {
		
	}
}

public abstract class Shape {
	
	public Shape() {}
	
	public void paint() {}
	abstract public void draw() ;
	// 1. Abstract methods do not specify a body => {}  x 
}
