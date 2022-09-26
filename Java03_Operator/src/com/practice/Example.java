package com.practice;
import java.util.Scanner;

public class Example {
	public void sample() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요:");
		int score1 = sc.nextInt();
		System.out.println("영어 점수를 입력하세요:");
		int score2 = sc.nextInt();
		System.out.println("수학 점수를 입력하세요:");
		int score3 = sc.nextInt();
		
		int allScore = score1 + score2 + score3;
		double avg = allScore/3;
		
		
		String str = (score1 >=40 && score2 >=40 && score3 >=40) ? (avg >=60) ? "합격":"불합격" : "불합격";
		System.out.println(str);
	
		
		
		
	}
	public void sample2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생이름:");
		String name = sc.next();
		
		System.out.println("학년:");
		int grade = sc.nextInt();
		
		System.out.println("반:");
		int cls = sc.nextInt();
		
		System.out.println("번호:");
		int num = sc.nextInt();
		
		System.out.println("성별(M/F):");
		String gender = (sc.next().charAt(0) == 'M') ? "남학생": "여학생";
		
		System.out.println("성적:");
		float score = sc.nextFloat();
		
		System.out.printf("%s학년 %d반 %d번 %s %s은 성적이 %.2f이다",grade, cls, num, gender, name, score);
		
	}
	public void sample3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 한개 입력:");
		int num = sc.nextInt();
		String str = (num>0) ? "양수다":"양수가 아니다";
		System.out.println(str);
	}
	public void sample4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 한개 입력:");
		int num = sc.nextInt();
		
		String str = (num%2 ==0) ? "짝수다" : "홀수다";
		System.out.println(str);
		
	}
}
