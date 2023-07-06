package com.kh.day09.objectpkg;

public class Exam_ObjectProperty {

class Point {
		
	}

	public static void print(Object obj) {
		System.out.println("클래스 이름 : " + obj.getClass().getName());
		System.out.println("해시 코드 값 : " + obj.hashCode());
		System.out.println("객체를 문자열로 만들어 출력 : " + obj.toString());
		System.out.println("객체 출력 : " + obj);
	}
	public static void main(String[] args) {
		// Object 클래스의 equals() 메소드 : 내용비교
		String javaStr = "Java";
		String javaStr2 = "Java";
		String javaStr3 = new String("Java");
		String [] strArrs = new String[10];
		strArrs[0] = "Java";
		strArrs[1] = "Java";
//		if(javaStr == "Java") {
//		if(strArrs[0] == strArrs[1]) {
		if(javaStr == javaStr3) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
	}
}
