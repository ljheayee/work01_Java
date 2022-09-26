package com.test01;
import java.util.Scanner;

public class IfTest03 {
	//else if
	
	public void test() {
		int i =10;
		int j =20;
		
		if(i>j) {
			System.out.println(i+"은" +j+ "보다 큽니다.");
		}else if(i==j) {
			System.out.println(i+"은" +j+ "보다 같습니다.");
		}else {
			System.out.println(i+"은" +j+ "보다 작습니다.");
		}
	}
	public void test2() {
		//점수 하나 입력받아 등급 나누어 점수와 등급을 출력
		//90점 이상 A, 90~80 B, 80~70 C, 70~60 D, 60 F
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력: ");
		
		String score = "";
		
		int grade = sc.nextInt();
		
		if(grade >=90 && grade <= 100) {
			score = "A";
		}
		else if(grade < 90 && grade >=80) {
			score = "B";
		}
		else if(grade < 80 && grade >=70) {
			score = "C";
		}
		else if(grade < 70 && grade >=60) {
			score = "D";
		}
		else if(grade < 60 && grade >=0) {
			score = "F";
		}
		
		if(grade >100 || grade <0) {
			System.out.println("올바른 점수를 입력해주세요");
		}
		else {
			System.out.printf("당신의 점수는 %d 이고 등급은 %s입니다.",grade,score);
		}
	}
}
