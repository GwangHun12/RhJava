package com.kh.day08.oop.interfacepkg;

public class Exam_Interface {
	
	public static void main(String[] args) {
//		PhoneInterface phone = new PhoneInterfacel
		PhoneInterface phone = new SamsungPhone();
		// 업캐스팅
		phone.sendCall();
		phone.receiveCall();
		phone.printLogo();
	}
}
