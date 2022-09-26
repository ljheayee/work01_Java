package com.silsub1.example;
import java.util.Scanner; 

public class Munjae {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요: ");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요: ");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요: ");
		int mth = sc.nextInt();
		
		int sum = kor + eng + mth;
		int avg = sum/3;
		
		if(kor>= 40 && eng>= 40 && mth >= 40 && avg >=60) {
			System.out.printf("국어: %d점, 영어: %d점, 수학: %d점, 합계: %d점, 평균: %d점",kor,eng,mth,sum,avg);
		}
		else {
			System.out.println("불합격 입니다");
		}
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**** 초기 메뉴 ****");
		System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료");
		System.out.println("메뉴번호 입력: ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("입력메뉴가 선택되었습니다.");
			break;
		case 2:
			System.out.println("수정메뉴가 선택되었습니다.");
			break;
		case 3:
			System.out.println("조회메뉴가 선택되었습니다.");
			break;
		case 4:
			System.out.println("삭제메뉴가 선택되었습니다.");
			break;
		case 5:
			System.out.println("번호가 잘못 입력되었습니다.\n 다시 입력하십시오.");
			break;
		case 6:
			System.out.println("번호가 잘못 입력되었습니다.\n 다시 입력하십시오.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		}
		
	}
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 한개 입력: ");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("양수다");
		}
		else {
			System.out.println("양수가 아니다");
		}
		
		}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 한개 입력: ");
		int num = sc.nextInt();
		String str = " ";
		if (num == 0) {
			str = "0이다.";
		}
		else if(num % 2 == 0) {
			str = "짝수다.";
		}
		else {
			str = "홀수다.";
		}
		System.out.println(str);
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력: ");
		String name = sc.next();
		System.out.println("나이 입력: ");
		int age = sc.nextInt();
		System.out.println("키 입력: ");
		double height = sc.nextDouble();
		if(name != null && name.length() >0 && age >0 && height >0) {
			System.out.printf("이름: %s \n나이: %d \n키: %.1f\n",name, age, height);
			System.out.printf("확인: %s의 나이는 %d세이고, 키는 %.1f cm 이다.",name, age, height);
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
	
	}
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하세요.");
		int n1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요.");
		int n2 = sc.nextInt();
		if(n1 >0 && n2 >0) {
			System.out.println("첫 번째 정수: " + n1);
			System.out.println("두 번째 정수: " + n2);
			System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
			System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
			System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
			System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
			System.out.println(n1 + " % " + n2 + " = " + (n1%n2));
		}
		else {
			System.out.println(" 두 정수 모두 양수일 때만 가능합니다.");
		}
	}
	public void test7() {
		Scanner sc = new Scanner(System.in);
		String grade = " ";
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		
		if(score >= 90 && score <=100) {
			grade = "A";
		}
		else if(score >= 80 && score <90) {
			grade = "B";
		}
		else if(score >= 70 && score <80) {
			grade = "C";
		}else if(score >= 60 && score <70) {
			grade = "D";
		}else if(score < 60 && score > 0) {
			grade = "F";
		}
		else{
			System.out.println("점수를 잘못입력하셨습니다.");
			grade = null;
		}
		
		System.out.printf("점수: %d 학점: %s", score, grade);
	}
}
