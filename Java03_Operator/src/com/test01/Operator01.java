package com.test01;

import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
		//static 메소드는 new 사용 안해도 됨
		// 클래스명.메소드명()로 실행,호출
		//Operator01.test();
		//Operator01.test2();
		Operator01.test3();
	}
	
	//!논리값: 논리값을 반대로 바꾸는 연산자
	//!true => false, !false -> true
	public static void test() {
		System.out.println("true의 부정:" + !true);
		System.out.println("false의 부정:" + !false);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나 입력: ");
		int num = sc.nextInt();
		
		System.out.println("입력한 정수가 짝수?: "+(num%2 == 0 ? "yes" : "no"));
		System.out.println("입력한 정수가 홀수?: "+(num%2 != 0 ? "yes" : "no"));
		
		System.out.println("입력한 정수가 양수?: "+(num > 0 ? "yes" : "no"));
		System.out.println("입력한 정수가 음수?: "+(num < 0 ? "yes" : "no"));
	
	}
	
	//증감연산자 ++,--
	// ++: 1씩 증가,++값, 값++ 로 사용한다.
	// --: 1씩 감소, --값,값-- 로 사용
	public static void test2() {
		int age = 19;
		
		System.out.println("현재 나이는? " + age);
		
		++age;
		System.out.println("++age 결과? " + age);
		
		age++;
		System.out.println("age++ 결과? " + age);
	
		--age;
		System.out.println("--age 결과? " + age);
		
		age--;
		System.out.println("age-- 결과? " + age);
		
		//2씩 증가
		// age += 2; -> age = age + 2
		
		int num = 20;
		int res = ++num;
		System.out.println("res: " + res);
		System.out.println("num: " + num);
		
		int num2 = 20;
		int res2 = num2++;
		System.out.println("res2: " + res2);
		System.out.println("num2: " +num2);
	}
	public static void test3() {
		int num1 = 10;
		int num2 = 3;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println( num1 * num2);
		//나누었을 때
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
	}
	
}
