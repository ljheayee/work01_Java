package com.test01;
import java.util.Scanner;

public class ForTest02 {
	public static void main(String[] args) {
		//testFor1();
		//testFor2();
		//testFor3();
		testFor4();
		
	}
	public static void testFor1() {
		for(int i =0; i<10; i++) {
			for(int j =0; j<5; j++) {
				System.out.println("j = " + j);
				
			}
			System.out.println("i = " + i);
		}
	}
	public static void testFor2() {
		//구구단 2단 부터 9단까지 출력
		
		for(int i = 2; i<10;i++) {
			for(int j = 1; j<10;j++) {
				System.out.printf("%d * %d = %d\n", i,j,(i*j));
			}
			System.out.println();
		}
		
		}
	public static void testFor3() {
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<= 5; j++) {
				System.out.print("*");
				//print 줄바꾸지 않음 | println 출력후 줄바꿈
			}
			
			System.out.println();
		
		}
		
	}
	public static void testFor4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 칸? : ");
		int row = sc.nextInt();
		System.out.print("몇 줄? : ");
		int col = sc.nextInt();
		
		System.out.println("-----------");
		
		for(int j=0; j<col; j++) {
			for(int i = 0; i< row; i++) {
			
				if (i == j) {
					System.out.print(i+1);	
				}
				else {
				System.out.print("😄");
				}
			}
				System.out.println();
		}
	}
}
