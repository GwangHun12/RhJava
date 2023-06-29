package com.kh.day03.array.exercise;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Filter;

public class Exercise_Array1 {

	public void exercise1() {
		// 양수 5개를 입력받아 배열에 저장하고, 제일 큰수를 출력하는 프로그램을 작석하라.
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
	}

	public void exercise2() {
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고
		// 평균을 구하는 프로그램을 작성하라.
		int arrs[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int avg = 0;
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
			avg += arrs[i];
		}
		System.out.println("평균 : " + (double) avg / arrs.length);
	}

	public void arryCopyExercise() {
		// 사용자에게 주민번호를 입력 받은 후
		// 성별자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오
		// 230515-1231514 -> 230515-1******
		char arrs[] = new char[14];
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력해주세요 : ");
		String memberNum = sc.next();
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = memberNum.charAt(i);
		}
		char[] copy = new char[14]; // 깊은 복사의 시작
		for (int i = 0; i < arrs.length; i++) {
			if (i < 8) {
				copy[i] = arrs[i]; // 성별자리 전까지 차례대로 값을 대입
			} else {
				copy[i] = '*'; // 성별자리 이후엔 *로 값 대입
			}
		}
		// 배열출력
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}

	}

	public void lottoExercise() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 6개. 로또 번호의 범위는 1 ~ 45
//		Random rand = new Random();
//		int arrs[] = new int[6];

//		// 랜덤값 6개받기
//		for (int i = 0; i < arrs.length; i++) {
//			arrs[i] = rand.nextInt(45) + 1;
//			for (int j = 0; j < i; j++) {
//				if (arrs[j] == arrs[i]) {
//					i--;
//				}
//			}
//		}
//
//		// 정렬
//		for (int i = 0; i < arrs.length; i++) {
//			for (int j = 0; j < arrs.length - 1; j++) {
//				if (arrs[j] > arrs[j + 1]) {
//					int temp = arrs[j];
//					arrs[j] = arrs[j + 1];
//					arrs[j + 1] = temp;
//				}
//			}
//		}
//
//		// 배열출력
//		System.out.println();
//		for (int i = 0; i < arrs.length; i++) {
//			System.out.print(arrs[i] + " ");
//		}
		
		
		
//		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
//		// 단, 결과는 오름차순으로 정렬
//		// 로또 번호는 6개. 로또 번호의 범위는 1 ~ 45
		
		int [] lottoNums = new int[6];
		Random rand = new Random();
		// radn.nextInt(10) -> 0부터 9까지
		// 1부터 45까지 -> ??
		// 0부터 44까지 => rand.nextInt(45)+1
//		int count = 1;
//		int check = 1;
		// 중복없이 1 ~ 45 사이의 랜덤한 수를 6개 뽑는 것
		for(int i = 0; i < 6; i++) {
			lottoNums[i] = rand.nextInt(45)+1;
			for(int e = 0; e < i; e++) {
				if(lottoNums[i]==lottoNums[e]) {
					i--;
					break;
				}				
			}
//			count++;
//			check++;
//			if(lottoNums[2]==lottoNums[1]) {
//		}
//		} catch(InputMismatchException e) {
//			System.out.println("");
//			rand.nextInt();
//		}

		}
		// 버블정렬 해보기
		// for의 변수가 증가하기만 하면됨 
		// 단, 안에 있는 for문의 조건식의 최대값은 감소(-i)해야함.
		for(int i = 0; i < lottoNums.length-1; i++) {
			for(int j = 0; j < (lottoNums.length-1)-i; j++) {
				// 왼쪽이 크면 자리 바꾸기
				if(lottoNums[j] > lottoNums[j+1]) {
					int tmp = lottoNums[j];       // 왼쪽에 있는 값이 지워지기 전에 킵해 놓음
					lottoNums[j] = lottoNums[j+1];   // 오른쪽에 있는 놈을 왼쪽에 대입함.
					lottoNums[j+1] = tmp;           // 킵해놓은 것을 오른쪽에 대입함.
				}
				
			}
		}
		for(int i = 0; i < lottoNums.length; i++) {
			System.out.print(lottoNums[i]+ " ");
		}
	}
}
