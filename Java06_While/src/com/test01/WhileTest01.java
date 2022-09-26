package com.test01;
import java.util.Scanner;

public class WhileTest01 {
	public static void main(String[] args) {
		//WhileTest01.testWhile();
		//WhileTest01.testWhile2();
		//WhileTest01.testWhile3();
		//WhileTest01.testWhile4();
		WhileTest01.testwhile4_2();
	}
	
	public static void testWhile() {
		int i= 1;
		while(i<=10) {
			System.out.println((i+"번째 반복문 수행중..."));
		i++;
		}
		System.out.println(i);
	
	}
	
	public static void testWhile2() {
		//문자열의 인덱스별로 문자를 출력
		String str = "ABCDE";
		
		int index = 0;
		int k = 1 ;
		
		while(k <=5) {
			char ch = str.charAt(index);
			
			System.out.println(" index " + index + " : " + ch);
			k++;
			index++;
		}
	}
	
	public static void testWhile3() {
		//1부터 입력받은 수 까지 정수들의 합
		int sum = 0;
		System.out.println("정수 하나 입력: ");
		int num = new Scanner(System.in).nextInt();
		int i = 1;
		while(i <= num) {
			sum += i;
			
			i++;
		}
		System.out.println("합계: " + sum);
	}
	
	public static void testWhile4() {
		int i = 1;
		
		while(true) {
		System.out.println(i);
		i++;
		
		if(i==10) {
			break;
		 }
		}
	}
	public static void testwhile4_2() {
		//키보드로 4를 입력 받을 때 까지 반복,
		//4가 입력되면 while문 종료
		
		while(true) {
			System.out.println("정수를 입력하세요");
			int k = new Scanner(System.in).nextInt();
		
			if(k == 4) {
				System.out.println("종료");
				break;
			}
		}
		
	}
}
	