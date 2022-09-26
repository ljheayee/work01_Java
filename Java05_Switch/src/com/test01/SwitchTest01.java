package com.test01;

public class SwitchTest01 {
	public void test() {
		int i = 1;
		
		//break를 안걸어주면 멈추지 않고 다음 케이스들이 전부 실행 됨// 케이 순서에 상관없이 실행 가
		switch(i) {
		case 1:
			System.out.println("1입니다");
			break;
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
		default:
			System.out.println("1,2,3도 아닙니다");
		}
	}
	
	public void test2() {
		char ch = 'c';
		switch(ch) {
		case'a':
			System.out.println("a입니다.");
			break;
		case'b':
			System.out.println("b입니다.");
			break;
		case'c':
			System.out.println("c입니다.");
			break;
		}
		
		System.out.println("-------------");
		int i = 5;
		switch(i) {
		case 1:
		case 3:
			System.out.println("홀수입니다.");
			break;
		case 2:
		case 4:
			System.out.println("짝수입니다.");
			break;
		default:
		System.out.println("아닙니다!");
		}
		
	}
}
