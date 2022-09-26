package com.home.controller;
import java.util.Scanner;

public class Function {
	Scanner sc = new Scanner(System.in);
	
	public void calculator() { // 계산기
		System.out.println("***계산기 실행***");
		System.out.println("==============\n");
		System.out.print("첫번째 정수: ");
		int n1 = sc.nextInt();
		System.out.print("두번째 정수: ");
		int n2 = sc.nextInt();
		System.out.print("연산 문자: ");
		String str = sc.next();
		char ch = str.charAt(0);
		int ans = 0;
		
		switch(ch) {
		case '+':
			ans =n1 + n2;
			break;
		
		case '-':
			ans =n1 - n2;
			break;
		case 'x':
			ans =n1 * n2;
			break;
		case 'X':
			ans =n1 * n2;
			break;
		case '/':
			if(n2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				ans = 0;
				break;
			}
			ans =n1 / n2;
			break;
		}
		System.out.printf("%d %c %d = %d \n", n1,ch,n2,ans);
		System.out.println("==============");
		
	}
	
	public void totalCalculator() { // 합계 구하기
		System.out.println("***합계 구하기***");
		System.out.println("==============\n");
		System.out.print("첫번째 정수: ");
		int n1 = sc.nextInt();
		System.out.print("두번째 정수: ");
		int n2 = sc.nextInt();
		int sum = 0;
		
		if (n1>n2) {
			for(int i = n2; i <= n1; i ++) {
				sum += i;
			}
			System.out.printf("%d부터 %d까지 정수들의 합계: %d",n2,n1,sum);
		}
		if (n1<n2) {
			for(int i = n1; i <= n2; i ++) {
				sum += i;
			}
			System.out.printf("%d부터 %d까지 정수들의 합계: %d",n1,n2,sum);
		}
		System.out.println("\n==============");
	}
	
	public void profile() { // 신상정보 확인
		System.out.println("***신상정보 확인***");
		System.out.println("==============\n");
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("성별: ");
		String gender = sc.next();
		System.out.print("성격: ");
		String pers = sc.next();
		
		System.out.printf("\n이름: %s \n나이: %d세",name,age);
		System.out.printf("\n성별: %s \n성격: %s",gender,pers);
		System.out.println("\n==============");
	}
	
	public void sungjuk() { // 학생정보 확인
		System.out.println("***학생정보 확인***");
		System.out.println("==============\n");
		
		System.out.print("학생 이름: ");
		String name = sc.next();
		System.out.print("학년: ");
		int	grade = sc.nextInt();
		System.out.print("반: ");
		int	cls = sc.nextInt();
		System.out.print("번호: ");
		int num = sc.nextInt();
		System.out.print("성별(M/F): ");
		String gen = sc.next();
		char genCh = gen.charAt(0);
		String gender = (genCh == 'M') ? "남학생":(genCh == 'F') ? "여학생":"X";
		System.out.print("성적: ");
		double record = sc.nextDouble();//소수점 둘 째자리 까지
		char unit = ' '; //학점
		
		if(record <= 100 && record >=90) {
			unit = 'A';	
		}
		else if(record < 90 && record >=80) {
			unit = 'B';	
		}
		else if(record < 80 && record >=70) {
			unit = 'C';	
		}
		else if(record < 70 && record >=60) {
			unit = 'D';	
		}
		else if(record < 60 && record >=0) {
			unit = 'F';	
		}
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고, %c학점입니다.",
			grade,cls,num,gender,name,record,unit);
		System.out.println("\n==============");
	}
	
	public void printStarNumber() { //별과 숫자 출력
		System.out.println("***별과 숫자 출력***");
		System.out.println("==============\n");
		
		System.out.print("정수 입력: ");
		int	num = sc.nextInt();
		
		if(num > 0) {
			for(int i = 0; i < num; i++) {
				for(int j = 0; j < num; j++) {
					if(i ==j) {
						System.out.print(i+1);
					}
					else if(i>j) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
			
		}
		else {
			System.out.println("양수가 아닙니다.");
		}
		System.out.println("\n==============");
	}
	
	public void sumRandomNumber() { // 난수까지의 합계
		System.out.println("***난수 합계***");
		System.out.println("==============\n");
		int sum = 0;
		int random = (int)(Math.random()*100)+1;
		for(int i = 1; i<=random; i++) {
			sum += i;
		}
		System.out.printf("발생한 난수: %d 난수까지의 합계: %d", random,sum);
		System.out.println("\n==============");
		
		
	}
	
	public void continueGugudan() { //구구단
		System.out.println("***구구단***");
		System.out.println("==============\n");
		
		System.out.print("단 입력: ");
		int	num = sc.nextInt();
		System.out.print("제외할 배수 입력: ");
		int	exp = sc.nextInt();
		
		
		if(num>0){
			for(int i = 1; i<10; i++){
					if(i==exp) {
						continue;
					}
			System.out.printf("%d * %d = %d\n",num,i,num*i);
			}
		
		}
		else {
			System.out.println("양수가 아닙니다.");
		}
		System.out.println("\n==============");
	}
	
	public void shutNumber() { // 주사위 숫자 알아 맞추기
		System.out.println("***주사위 숫자 맞추기***");
		System.out.println("==============\n");
		String ans = "";
		
		do {
		int dice1 = (int)(Math.random()*6) +1;
		int dice2 = (int)(Math.random()*6) +1;
		System.out.printf("dice1: %d, dice2: %d\n",dice1,dice2);
		
		if(dice1 == dice2) {
			System.out.println("맞췄습니다.");
		}
		else {
			System.out.println("틀렸습니다.");
		}
		
		System.out.print("계속하시겠습니까?(y/n):");
		ans = sc.next();
		
		}while(!ans.equals("n") && !ans.equals("N"));
		System.out.println("반복 종료!");
		System.out.println("\n==============");
	}
}