package com.test01;
import java.util.Scanner;

public class IfTest02 {
	//if else
	// 둘 중 한개를 선택하는 조건문, 조건이 참인 경우와 거짓인 경우에
	// 수행하는 명령을 따로 작성하는 경우에 사용한다.
	public void test() {
		int i = 20;
		
		if(i<10) {
			System.out.println(i + "는 10보다 작습니다");
		}
		else {
			System.out.println(i+"는 10보다 크거나 같습니다");
		}
	}
	public void test2() {
		//숫자 하나 입력 받아 홀수 짝수 인지 출력해보자.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 하나 입력: ");
		int num = sc.nextInt();
		
		//조건식은 반드기 t,f 나오도록 작
		if(num == 0) {
			System.out.println("0");
		}
		else if(num % 2 == 0) {
			System.out.println("짝수");
		}
		else  {
			System.out.println("홀수");
		}
		
	}
	public void test3() {
		//50보다 큰수라면 짝수인지, 홀수인지 판단하여 출력
		// 50미만의 수라면 작다라고 출력
		Scanner sc = new Scanner(System.in);
				
				System.out.println("숫자 하나 입력: ");
				int num = sc.nextInt();
				
				if(num>=50) {
					if(num%2 == 0) {
						System.out.println("50보다 큰 짝수");
					}
					else {
						System.out.println("50보다 큰 홀수");
					}
				}
				else {
					System.out.println("50보다 작다");
				}
		
	}
	public void test4() {
		//숫자 하나를 입력 받아 양수인지 음수인지 출력.
		//단, 0이면 0입니다 출력받
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 하나 입력: ");
		int num = sc.nextInt();
		
		if(num != 0) {
			if(num > 0) {
				System.out.println("양수입니다");
			}
			else {
				System.out.println("음수입니다");
			}
		}
		else {
			System.out.println("0입니다");
		}
		
	}
}
