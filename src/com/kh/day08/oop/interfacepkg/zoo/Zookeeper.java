package com.kh.day08.oop.interfacepkg.zoo;

public class Zookeeper {

	public void feed(FoodInterface predator) {
		System.out.println("feed" + predator.animalFood());
	}
//	public void feed(Bear bear) {
//		System.out.println("feed" + bear.animalFood());
//	}
//	public void feed(Tiger tiger) {
//		System.out.println("feed" + tiger.animalFood());
//	}
//	public void feed(Lion lion) {
//		System.out.println("feed" + lion.animalFood());
//	}
	public static void main(String [] args) {
		Zookeeper zk = new Zookeeper();
		zk.feed(new Bear());
		zk.feed(new Tiger());
		zk.feed(new Lion());
	}
}
