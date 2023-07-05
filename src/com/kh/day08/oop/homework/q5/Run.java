package com.kh.day08.oop.homework.q5;

public class Run {

	public static void main(String[] args) {
		Person kim = new Person("김씨", 10000);
		kim.buycoffee(new StarCaffe(), 5500);
		kim.printInfo();
		Person lee = new Person("이씨", 20000);
		lee.buycoffee(new CongCaffe(), 4500);
		lee.printInfo();
	}

}
