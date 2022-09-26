package com.test01;
import java.util.Scanner;

public class IfTest01 {
	
	//if문
	//조건식의 결과 값이 true이면 { }안에 있는 코드 실행,
	//조건식의 결과 값이 false이면 { }안에 있는 코드 무시하고 넘어감
	public void testIf() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 한개 입력");
		int num = sc.nextInt();
		
		//짝수인지 조건을 확인 
		 if (num == 0) {
			System.out.println("0입니다");
		}
		else if(num % 2 == 0) {
			//참일 때 수행
			System.out.println("짝");
		}
		else if(num % 2 != 0) {
			//참일 때 수행
			System.out.println("홀");
		}
		 
		System.out.println("프로그램 종료");
	}
		
}
