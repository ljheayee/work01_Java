package com.silsub1.example;
import java.util.Scanner;
import java.util.regex.Pattern;



public class Forwhile {
	Scanner sc = new Scanner(System.in);
	
	public void printStar1() {
		System.out.println("정수 한개 입력: ");
		int row = sc.nextInt();
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < row; j++) {
				if(i==j && row > 0) {
					System.out.print(i+1);
				}
				else if (i >j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	/* public void printstar(){
	 * int row = sc.nextInt();
	 * for(int i = 1; i <=row;, i++;){
	 * for(int j=1,j<=i;j++){
	 * if(i ==j){
	 * 	System.out.print(i);
	 * }else{
	 * System.out.print("*");
	 * }
	 * }
	 * System.out.println();
	 * }
	 * }
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void printStar2() {
		
		System.out.println("정수 입력: ");
		int row = sc.nextInt();
		
		
		if(row>0) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < row; j++) {
				if(i >=j) {
					System.out.print("*");
				}
			
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		}

		else if(row < 0) {
		for(int i = row; i < 0;  i++) {
			for(int j = 0; j > i ; j--) {
				if(i <=j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
			
		}
		else {
			System.out.println("출력 기능이 없습니다.");
		}
		
	}
	/*
	 * public void printstar2() {
	 
		System.out.println("정수 입력: ");
		int row = sc.nextInt();
		
		if(row >0) {
		for(int i =1; i<=row; i++) {
			for(int j=1; j<= i; j++) {
				System.out.println("*");
			}
			System.out.println();
			}
		}else if(row < 0){
			for(int i =(-row); i > 0; i--) {
				for(int j=1; j<= i; j++) {
					System.out.print("*");
				}
				System.out.println("출력 기능이 없습니다.");
				}
		}
		else {
			System.out.println();
		}
	}*/
	
		public void countInputCharacter() {
			System.out.println("문자열 입력");
			String str = sc.next();
			System.out.println("문자 입력");
			String ch = sc.next();
			
			char ch_r = ch.charAt(0);
			int same_num = 0;
			
			for(int i=0;i<str.length();i++) {
				char str_ch = str.charAt(i);
				if(str_ch == ch_r) {
					same_num++;
				}
			}
				if(Pattern.matches("[a-zA-Z]*$", str ) != true) {
					System.out.println("영문자만 입력해주세요.");
				}	
				else{
					System.out.println("포함된 갯수: "+ same_num);
				}
			
		}
		/*public void cIC() {
			System.out.println("문자열 입력:");
			String str = sc.nextLine();
			
			for(int i = 0; i<str.length(); i++){
			char tmp = str.charAt(i);
			
			if( !(tmp>='a' && tmp <='z' || tmp >=='A" && tmp <="Z")){
				System.out.println("영어 문자가 아닙니다.");
				return; //해당 메서드가 종료
			}
			
		}	
			
			
			System.out.println("문자 입력:");
			char ch =sc.nextLine().charAt(0);
			int count = 0;
			
			for(int i =0; i<str.length(); i ++) {
				if(ch == str.charAt(i)) {
					count++;
				}
			}
			System.out.println("포함된 갯수: " + count);
		}*/
		
		//못 풀었음
		public static void excercise1() {
			int cnt = 1;
			int sum =0;
			
			for(int i =0;i<5;i++) {
				for(int j=0;j<5;j++) {
					// i와 j가 같을 때 or i+j ==4
					if(i ==j || i+j==4) {
						sum +=cnt;
					}
					System.out.print(cnt++ +" ");
				}
				
				System.out.println(" ");
			}
			System.out.println(sum);
		}
		
	}
