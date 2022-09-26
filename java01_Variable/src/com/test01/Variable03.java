package com.test01;

public class Variable03 {
	public static void main(String[] args) {
		//준비 클래스명 변수명 = new 클래스명();
		Variable03 test = new Variable03();
		//실행 변수명.메소드();
		test.finalTest();
		//test.overflowTest(); 하나의 클래스안에 메소드가 여러개 있다면 이것도 가능
		
		Variable03 test2 = new Variable03();
		test2.overflowTest();
	}
	
	//상수테스트
	public void finalTest() {
		
		int age;
		final int AGE;
		
		age = 20;
		AGE = 20;
		
		
		System.out.println("age: "+age);
		System.out.println("AGE: "+AGE);

		age = 30;
		//AGE = 30;변경 불가 
		System.out.println("변경 후 age: "+age);
		System.out.println("변경 후 AGE: "+AGE+" (*상수이기 때문에 변경 불가)");
		
	}
	public void overflowTest() {
		//byte bnum = 128;
		//에러 범위 벗어난 
		byte bnum = 127;
		bnum = (byte)(bnum+1); // byte + int --> int   bnum = (byte)(bnum+1);로 형변환 해줘야 한다
		System.out.println(bnum);
	}
}
