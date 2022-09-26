package com.example;

import java.util.Scanner;

public class Example {
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.println("첫 번째 정수: ");
		int n1 = sc.nextInt();
		System.out.println("두 번째 정수: ");
		int n2 = sc.nextInt();
		
		//결과
		System.out.println("더하기 결과:" + (n1 + n2));
		System.out.println("빼기 결과:" + (n1 - n2));
		System.out.println("곱하기 결과:" + (n1 * n2));
		System.out.println("나누기한 몫:" + (n1 / n2));
		System.out.println("나누기한 나머지:" + (n1 % n2));
		System.out.println("-----------------------------------------");
	}
	
	public void example2() {
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.println("가로: ");
		double n1 = sc.nextDouble();
		System.out.println("세로: ");
		double n2 = sc.nextDouble();
		
		//결과
		System.out.println("면적: " + (n1 * n2));
		System.out.println("둘레: " + (n1 + n2) * 2 );
		System.out.println("-----------------------------------------");
		
	}
	
	public void example3() {
		//Srting str = "abcd";
		//str.charAt();
		//java.lang.string 클래스의 charAt();
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하시오: ");
		String str = sc.next();
		
		//문자 변수 설정
		char c1 = ' ' ;
		char c2 = ' ' ;
		char c3 = ' ' ;
		
		c1 = str.charAt(0);
		c2 = str.charAt(1);
		c3 = str.charAt(2);
		
		
		
		//결과
		System.out.println("첫번째 문자: " + c1);
		System.out.println("첫번째 문자: " + c2);
		System.out.println("첫번째 문자: " + c3);
		System.out.println("입력된 글자 개수: " + str.length());
		
		
	}
}
