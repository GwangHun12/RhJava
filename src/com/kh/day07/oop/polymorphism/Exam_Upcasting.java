package com.kh.day07.oop.polymorphism;

public class Exam_Upcasting {
	public static void main(String[] args) {
		Student std = new Student();
		Person p = new Person();
		
		Person parent = new Student("일용자");
		System.out.println(parent.name);
		System.out.println(parent.id);
		// 다운캐스팅
		System.out.println(((Student)parent).grade); 	// 강제형변환
		System.out.println(((Student)parent).department);	// 강제형변환
	}
}
