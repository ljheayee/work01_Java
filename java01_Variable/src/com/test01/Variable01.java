package com.test01;

public class Variable01 {
	
	//main method 메소드 = 기능 -> 메소드 하나 = 기능 하나 
	public static void main(String[] args) {
		//기능실행 or 메소드 호출
		Variable01.declareVariable();
		Variable01.initVariable();
	}
	//method
	public static void declareVariable() {
		// 타입 변수명; 
		
		//숫자
		
		//정수
		byte bnum; //1byte
		short snum; // 2byte
		int inum; //4byte
		long lnum; //8byte
		
		//실수
		float fnum; //4byte
		double dnum; // 8byte
		
		//논리
		boolean isTrue; //1byte
		
		//문자
		char ch; //2byte
		
		//문자열(참조) 위치의 주소값이 저장되는 것이 참조형
		String str;
		
		// -------------------------------
		
		// 값 저장
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8;
		
		fnum = 4.0f; // 기본형이 더블이기 때문에 뒤에 f를 붙여줘야
		dnum = 8.0;
		isTrue = true; // or false
		ch = 'A'; //   홑따옴표는 문자 하
		str = "ABCD"; //  쌍따옴표는 문자"문자열"
		
		// 변수에 저장된 값을 출력하기
		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(inum);
		System.out.println(lnum);
		
		System.out.println(fnum);
		System.out.println(dnum);
		
		System.out.println(isTrue);
		
		System.out.println(ch);
		System.out.println(str);
		
		
	}
	
	
	public static void initVariable() {
		// 변수 선언과 동시에 초기화
		
		//숫자
		//정수
		byte bnum = 1;
		short snum = 2;
		int inum = 4;
		long lnum = 7;
		//실수
		float fnum = 0.4f;
		double dnum = 8.0;
		//논리
		boolean isTrue = true;
		//문자
		char ch = 'A';
		//문자열
		String str = "안녕하세요";
		
		// 변수에 저장된 값을 출력하기
		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(inum);
		System.out.println(lnum);
				
		System.out.println(fnum);
		System.out.println(dnum);
				
		System.out.println(isTrue);
				
		System.out.println(ch);
		System.out.println(str);
		
	}
}
