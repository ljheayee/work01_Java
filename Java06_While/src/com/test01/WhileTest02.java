package com.test01;
import java.util.Scanner;

public class WhileTest02 {
	public static void main(String[] args) {
		//WhileTest02.testDoWhile();
		WhileTest02.testDoWhile2();
	}
	public static void testDoWhile() {
		int i =1;
		
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		
		
		}
	private static void testDoWhile2() {
		// 문자열 입력받아 출력해본다.
		//"exit" 입력하면 while문 종료
		
		String str = "";
		
		do {
			System.out.println("문자열 입력");
			str = new Scanner(System.in).next();
			System.out.println("str:" + str);
			
		}while(!str.equals("exit"));
		
		do {
			System.out.println("문자열 입력");
			str = new Scanner(System.in).next();
			System.out.println("str:" + str);
			if(str.equals("exit")) {
				break;
			}
			
			System.out.println("str:" + str);
			}while(true);
	
	}
	}

