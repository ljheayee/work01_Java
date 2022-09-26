package com.test01;

import java.util.Scanner;

public class Variable02 {
	//키보드 입력 테스트
	
	public static void main(String[] args) {
		
		// 준비 =-> 클래스명 변수명 = new 클래스명();		
		Variable02 test = new Variable02();
		
		// 실행 =-> 변수명.메소드();
		
		test.inputTest();
		
	}
	
	// static 차이 일반 메서드는 준비하고 실행해야 한다
	public void inputTest() {
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.println("이름을 입력하세요:");
		name = sc.next();
		//next line의 경우 띄어쓰기 등과 상관없이 그냥 읽어버림 next의 경우는 띄어쓰기를 할 경우 오류 날 수도 있음
		
		
		
		System.out.println("나이 입력하세요:");
		int age = sc.nextInt();

		System.out.println("키를  입력하세요(소수점 첫째자리):");
		double height = sc.nextDouble();
		
	
		System.out.println(name + " 님은 " + age + "살이고, 키는 " + height +"cm 입니다.");
	}
	
	
}
