package com.kh.day04.dimarray.exercise;

public class Exercise_DimArray {
	public void exercise1()
	{
//		5 4 3 2 1 
//		10 9 8 7 6 
//		15 14 13 12 11 
//		20 19 18 17 16 
//		25 24 23 22 21 
		int [][] arrs = new int [5][5];
		int k =1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = arrs.length-1; j >=0; j--) {
				arrs[i][j] = k;
				k++;
			}			
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(arrs[i][j] + " ");			
			}
			System.out.println();
		}
//		arrs[0][j] = 1;
//
//		for(int i = 0; i < arrs.length; i++) {
//			for(int j = 0; j < arrs[i].length; j++) {
//				System.out.printf("%2d", arrs[i][j]);
//			}
//			System.out.println();
//		}
//		for(int i= 0; i < 5; i--) {
//			for(int j = 0; j < 5; j--) {
//				System.out.print(arrs[i][j] + " ");
//			}
//			System.out.println();
//		}
		
	}
	public void exercise2()
	{
		int [][] arrs = new int [5][5];
		int k =1;
		for(int j = 0; j < arrs.length; j++) {
			for(int h = arrs.length-1; h >= 0; h--) {
				arrs[h][j] = k;
				k++;
			}
		}
			for(int j = 0; j < 5; j++) {
				for(int h = 0; h < 5; h++) {
					System.out.print(arrs[j][h] + " ");			
			}
			System.out.println();					
		}
	}
//		arrs[h][0] = 1; 
//		for(int i = 0; i < arrs.length; i++) {
//			for(int j = 0; j < arrs[i].length; j++) {
//				System.out.printf("%2d", arrs[i][j]);
//			}
//			System.out.println();
//		}
//	}
	public void exercise3()
	{
//		5 10 15 20 25 
//		4 9 14 19 24 
//		3 8 13 18 23 
//		2 7 12 17 22 
//		1 6 11 16 21 
		int [][] arrs = new int [5][5];
		int k =1;
		for(int h = 0; h < arrs.length; h++) {
			for(int s = 0; s < arrs.length; s++) {
				arrs[s][h] = k;
				k++;
			}			
		}
		for(int h = 0; h < 5; h++) {
			for(int s = 0; s < 5; s++) {
				System.out.print(arrs[h][s] + " ");			
		}
		System.out.println();					
	}
}
//		for(int i = 0; i < arrs.length; i++) {
//			for(int j = 0; j < arrs[i].length; j++) {
//				System.out.printf("%2d", arrs[i][j]);
//			}
//			System.out.println();
//		}
//	}
	public void exercise4()
	{
		int [][] arrs = new int [5][5];
		int k =1;
		for(int s = 0; s < 5; s++) {
			if(s % 2 == 0) {
				for(int m = 0; m < 5; m++) {
					arrs[s][m] = k;
					k++;
				}			
			}else {
				for(int m = 4; m < 0; m--) {
					arrs[s][m] = k;
					k++;
				}	
			}
			
		}
//		for(int s = 0; s < 5; s++) {
//			for(int m = 0; m < 5; m++) {
//				System.out.print(arrs[s][m] + " ");			
//		}
//		System.out.println();					
//	}
//}
//		public void exercise4() {
//			int arrs[][] = new int[5][5];
//			int k = 1;
//			for (int i = 0; i < arrs.length; i++) {
//				if (i % 2 == 0) {
//					for (int j = 0; j < arrs[i].length; j++) {
//						arrs[i][j] = k;
//						k++;
//					}
//				} else {
//					for (int j = arrs.length - 1; j >= 0; j--) {
//						arrs[i][j] = k;
//						k++;
//					}
//				}
//			}
//			// 출력
//			for (int i = 0; i < arrs.length; i++) {
//				for (int j = 0; j < arrs[i].length; j++) {
//					System.out.printf("%2d ", arrs[i][j]);
//				}
//				System.out.println();
//			}
//		}
//		for(int i = 0; i < arrs.length; i++) {
//			for(int j = 0; j < arrs[i].length; j++) {
//				System.out.printf("%2d", arrs[i][j]);
//			}
//			System.out.println();
//		}
//	}
	public void exercise5()
	{
//		 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
//		 4년간 전체 평점 평균을 출력하라.
//		 (3.3 3.4), (3.5 3.6), (3.7 4.0), (4.1 4.2)
		double [][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		double sum = 0;
		for(int k = 0; k < score.length; k++) {
			for(int h = 0; h< score[k].length; h++) {
//				System.out.printf("%2.1f ", score[k][h]);
				sum += score[k][h];
			}
			System.out.println();
		}
		int frontLength = score.length;
		int backLength = score[0].length;
		double result = sum / (frontLength * backLength);
		System.out.printf("4년 전체 평점 평균은 : %.2f\n", result);
//		score[0][0] = 3.3;
//		score[0][1] = 3.4;
//		
//		score[1][0] = 3.5;
//		score[1][1] = 3.6;
		
		
	}
}
