package com.kh.day05.run;

import java.util.Scanner;

import com.kh.day05.oop.BaseBallPlayer;
import com.kh.day05.oop.Book;
import com.kh.day05.oop.Circle;
import com.kh.day05.oop.exercise.Rectangle;

public class Run {
	public static void main(String [] args)
	{
		
		
		// ========================= Book ============================
//		Book littlePrince = new Book();
//		littlePrince.title = "어린왕자";
//		littlePrince.author = "생텍쥐페리";
		
		Book littleprince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		System.out.println(littleprince.title + ", " + littleprince.author);
		System.out.println(loveStory.title + ", " + loveStory.author);
		
		
		// ======================== Circle ====================
		Circle pizza;
//		pizza = new Circle();
//		pizza.radius = 10;
//		pizza.name = "청년피자";
		// 매개변수 생성자 활용
		pizza = new Circle(10, "청년피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
//		Circle donut = new Circle();
//		donut.radius = 2;
//		donut.name = "청년도넛";
		// 매개변수 생성자 활용
		Circle donut = new Circle(2, "청년도넛");
		area = donut.getArea();
		System.out.printf("%s의 면적은 %.2f", donut.name, area);
		
//		Circle circle = new Circle();
//		Circle circle2 = new Circle();
//		Circle circle3 = new Circle();
//		Circle circle4 = new Circle();
//		
//		circle.radius = 1;
//		circle2.radius = 2;
//		circle3.radius = 3;
//		
//		System.out.println(circle.getArea());
//		System.out.println(circle2.getArea());
//		System.out.println(circle3.getArea());
		
		
		// ========================= BaseBallPlayer (미완성) ==============================
//		BaseBallPlayer BBP = new BaseBallPlayer();
//		BaseBallPlayer BBP2 = new BaseBallPlayer();
//		BaseBallPlayer BBP3 = new BaseBallPlayer();
//		BaseBallPlayer BBP4 = new BaseBallPlayer();
//		
//		BBP.name = "추신수";
//		BBP2.name = "박찬호";
//		BBP3.name = "정근우";
//		BBP4.name = "이승엽";
//		
//		BBP.age = 40;
//		BBP2.age = 35;
//		BBP3.age = 45;
//		BBP4.age = 50;
//		
//		BBP.position = ""
//		
//		System.out.println(BBP.getArea());
//		System.out.println(BBP2.getArea());
//		System.out.println(BBP3.getArea());
//		System.out.println(BBP4.getArea());
		
		
		
		
		// ======================= Rectangle ========================
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("너비를 입력해주세요 : ");
		rect.width = sc.nextInt();
		System.out.print("높이를 입력해주세요 : ");
		rect.height = sc.nextInt();
		int result = rect.getArea();
		System.out.println("해당 사각형의 넓이는 " + result + "입니다.");
		
//		Rectangle rect;
//		rect = new Rectangle();
//		rect.width = 20;
//		rect.height = 5;
//		get.area = rect.getArea();
//		System.out.println(rect.width + "의 면적은 " + rect.getArea);
		

		
	}
}
