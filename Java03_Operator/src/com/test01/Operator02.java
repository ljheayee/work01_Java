package com.test01;

public class Operator02 {
	//비교연산자
	// 두 값(변수)의 관계를 비교하여 따지는 연산자
	// 비교연산자는 조건을 만족하면 true, 만족하지 못하면 false 반환
	//<, >, <= , >= , == , !=
	public static void main(String[] args) {
		int a = 10, b = 20;
		
		boolean res1, res2, res3;
		
		res1 = (a == b);
		res2 = (a <= b);
		res3 = (a > b);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
		
	}

}
