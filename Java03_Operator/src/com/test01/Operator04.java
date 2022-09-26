package com.test01;
import java.util.Scanner;

public class Operator04 {
	public static void main(String[] args) {
		Operator04.test1();
		Operator04.test2();
	}
	
	//삼항연산자
	//항목이 3개: (조건식) ? 참일 때 : 거짓일 때;
	public static void test1() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("정수 하나 입력: ");
	int num = sc.nextInt();
	
	//String str = (num > 0) ? "양수다" : "양수가 아니다" ;
	
	//중첩
	String str = (num > 0) ? "양수다" : (num==0)?"0이다":"음수다" ;
	
	System.out.println(str);
	}
	
	//복합대인연산자
	//+=, -=, *=, /= , %=
	//다른 연산자와 대입연산자를 함께 사용하는 연산자
	public static void test2() {
		int num = 12;
		
		System.out.println("num: " + num);
		
		//3증가
		num +=3;
		System.out.println("num: " + num);
		
		num-=5;
		System.out.println("num: " + num);
		
		num *=2;
		System.out.println("num: " + num);
	}
}
