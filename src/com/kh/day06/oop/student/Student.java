package com.kh.day06.oop.student;

		public class Student {
		// 이름
		// 첫번째 성적
		// 두번째 성적
		// 평균 출력
		String name;
		int firstScore;
		int secondScore;
		
		public Student() {}
		
		public Student(String name, int firstScore, int secondScore) {
			this.name = name;
			this.firstScore = firstScore;
			this.secondScore = secondScore;
		}
		public double getAvg() {
			double avg = (double)(this.firstScore + this.secondScore)/2;
			return avg;
		}

//		public void getName() {
//			return this.name;
//		}
//		public int getFirstScore() {
//			return this.firstScore;
//		}
//		public int getsecondScore() {
//			return this.secondScore;
//		}

}