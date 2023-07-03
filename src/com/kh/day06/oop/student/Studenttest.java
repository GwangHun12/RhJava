package com.kh.day06.oop.student;

import java.util.Scanner;

public class Studenttest {
	private String name;
	private int firstScore;
	private int secondScore;
	
	public Studenttest() {}
	
	public Studenttest(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	public double getAvg() {
		double avg = (double)(this.firstScore + this.secondScore)/2;
		return avg;
	}

	public String getName() {
		return this.name;
	}
	public int getFirstScore() {
		return this.firstScore;
	}
	public int getsecondScore() {
		return this.secondScore;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public void setsecondScore(int secondScore) {
		this.secondScore = secondScore;
	}

}