package com.test01;

public class WhileTest03 {
	public static void main(String[] args) {
		//1. 1~100 까지의 숫자를 역순으로 출력하자.
		//prn01();
		//2. 1~100 까지의 숫자를 2의 배수 출력하자.
		//prn02();
		//3. 1~100 까지의 숫자를 7의 배수의 갯수와 총 합을 출력하자.
		prn03();
	}
	
	public static void prn01() {
		int i = 100;
		while(i>0) {
			System.out.println(i);
			i--;
			}
	}
		
	public static void prn02() {
		
		int i = 1;
		
		while(i <= 100) {
			
			if(i % 2 == 0) {
				System.out.println(i);	
			}
			
			i++;
			}
		
		
		/*	int k =2;
		 * while(k <= 100){
		 * System.out.println(k);
		 * k += 2;
		 */
			
	}
		
	
	public static void prn03() {
	 int i = 1;
	 int sum = 0;
	 int mul = 0;
	 
		while(i<=100) {
			 
			if(i % 7 == 0) {
			sum += i;
			mul ++;
			}
			
			i++;
			
			}
		System.out.println("7의 배수 갯수: " + mul + " 총합: " + sum);
		}
	}
