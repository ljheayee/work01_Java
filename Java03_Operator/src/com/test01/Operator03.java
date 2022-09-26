package com.test01;
import java.util.Scanner;


public class Operator03 {
	//논리연산
	//&& (and)
	//|| (or)
	public static void main(String[] args) {
		Operator03 test = new Operator03();
		
		test.test1();
		
	}
	public void test1() {
		//1~100 사이의 숫자인지 확인, 1<=num<=100 이렇게 사용 못함 -> 1<=변수 &&변수 <=100
		System.out.println("정수 하나 입력: ");
		int num = new Scanner(System.in).nextInt();
		
		System.out.println("1부터 100사이인지 확인: " + (1<= num && num<=100) );
		//1미만, 100 초과인 숫자인지 확인
		System.out.println("1미만, 100 초과인 숫자인지 확인: " + (1> num || num>100));
		
		System.out.println("\n\n");
		//영어문자(char) 하나만 입력받아 대문자인지 소문자인지 판단하여 출력
		
		
		System.out.println("대문자 or 소문자 확인: ");
		char ch = new Scanner(System.in).next().charAt(0);
		System.out.println("대문자: " + Character.isUpperCase(ch));
		System.out.println("소문자: " + Character.isLowerCase(ch));
		//Sytem.out.println("영어 대자 인지 확인:" +(ch >='A' && ch<='Z'));
		
		System.out.println("----------");
		//입력한 문자가 대소문자 관계없이 Y인지 확인
		System.out.println("계속 하시려면 y를 입력하세요");
		char ch2 = new Scanner(System.in).next().charAt(0);
		System.out.println("영문자 y인지 확인: " + (ch2 =='y' || ch2 =='Y'));
	}
}