package com.test03;

public class Methodtest05 {
	public static void main(String[] args) {
	Methodtest05 mt05 = new Methodtest05();
	int num = mt05.test();
	System.out.println(num);
	
	System.out.println(mt05.test3());
	
	System.out.println(mt05.test4(3)); // 매개변수의 경우 값을 꼭 넣어줘야 
	
	
	}
	
	//리턴 타입
	public int test() {
		int no = 10 + 20;
		System.out.println("test() 실행...");
		
		return no +1;
	}
	public double test2() {
		return 10.1;
	}
	public String test3() {
		return "반미";
	}
	
	//int i: 매개변수
	public	int test4(int i) {
		
		return 11+i;
	}
}
