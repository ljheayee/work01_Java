package com.test03;

public class Methodtest04 {
	public static void main(String[] args) {
	Methodtest04 mt04 = new Methodtest04();
	
	//실행 0.main 실행(프로그램 시작)
	//mt04.methodA(); //1. mtA실행 -> mtA종료
	//mt04.methodB(); //2. mtB실행 -> mtB종료
	//mt04.methodC(); //3. mtC실행 -> mtC종료 4.main 종료(프로그램 종료)
	
	mt04.methodA(); //mtA실행 -> mtB실행 -> mtC실행 -> mtC종료 -> mtB종료 -> mtA종료
	}
	
	public void methodA() {
		System.out.println("methodA() 호출...");
		methodB();
	}
	public void methodB() {
		System.out.println("methodB() 호출...");
		methodC();
	}
	public void methodC() {
		System.out.println("methodC() 호출...");
	}
}