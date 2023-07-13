package com.kh.day13.Motel.model;

public class Motel {
	private int number;
	
	public Motel() {
		
	}
	public Motel(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "number : " + this.number;
	}
	
}
