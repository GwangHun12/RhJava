package com.kh.day09.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {
	public static void main(String[] args) {
		// 홍길동/장화/홍련/콩쥐/팥쥐 의 문자열 데이터를
		// '/' 기준으로 잘라서 홍련만 출력하시오.
		String data = "홍길동/장화/홍련/콩쥐/팥쥐/";
		StringTokenizer st = new StringTokenizer(data, "/");
		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
			String token = st.nextToken();
			if(token.equals("홍련")) {
				 System.out.println(token);
			}
		}
//		String data1 = "홍길동";
//		String data2 = "장화";
//		String data3 = "홍련";
//		String data4 = "콩쥐";
//		String data5 = "팥쥐";
	}
}
