package com.home.view;
import com.home.controller.Function;
import java.util.Scanner;

public class Menu {
	
	public static void displayMenu() {
		Function fu = new Function();
		
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println("*** 지역변수/연산자/제어문 연습 프로그램 ***");
			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은수에서 큰수까지 합계구하기");
			System.out.println("3. 신상정보 확인하기");
			System.out.println("4. 학생정보 확인하기");
			System.out.println("5. 별과 숫자 출력하기");
			System.out.println("6. 난수까지의 합계 구하기");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아맞추기");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴번호 입력: ");
			choice = sc.nextInt();
			System.out.println("==============");
			
			
			switch(choice){
			case 1:
				fu.calculator();
				break;
			case 2:
				fu.totalCalculator();
				break;
			case 3:
				fu.profile();
				break;
			case 4:
				fu.sungjuk();
				break;
			case 5:
				fu.printStarNumber();;
				break;
			case 6:
				fu.sumRandomNumber();
				break;
			case 7:
				fu.continueGugudan();
				break;
			case 8:
				fu.shutNumber();;
				break;
			case 9:
				System.out.println("프로그램 종료!");
				System.out.println("==============");
				break;
				
				
				
			}
			
		}while(choice != 9);
		
		
		
		}
	}

