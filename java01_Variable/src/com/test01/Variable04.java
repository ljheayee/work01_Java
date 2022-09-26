package com.test01;

public class Variable04 {
	/*
	 *	컴퓨터에서 값 처리 원
	 *	1. 같은 자료형 끼리만 대입 가능 => 다른 자료형의 값을 대입할 때는 형변환 필요
	 *	2. 같은 자료형 끼리만 계산 가능, 계산의 결과도 같은 자료형
	 *	3. 기본적으로는 정수형은 실수형으로 자동 형변환 가능, 실수형은 정수형으로 강제 형변환 해야한다.
	 */
	
	// 형변환: 자동형변환, 강제형변환(명시적 형변환)
	public static void main(String[] args) {
	//준
	 Variable04 test = new Variable04();
	 
	 //실
	 //test.test1();
	 //test.test2();
	 test.test3();
	 
	}
	
	public void test1() {
		boolean flag = true; //boolean은 무조건 true와 false만 가능
		
		//자동형변환(upcasting)
		
		int num = 'A';
		System.out.println("num" + num);
		
		char ch = 97;
		System.out.println("ch:" +ch);
		
		char ch2 = (char)num;
		System.out.println("ch2:" + ch2);
		
		num = -97;
		ch2 = (char)num;
		System.out.println("ch2" + ch2);
	}
	
	public void test2() {
		int inum = 10;
		long lnum = 100;
		
		// 다른 자료형끼리의 여산은 큰 자료형으로 자동 형변환 후 연산 처리
		
		//에러 발생
		//int isum = inum +lnum
		
		//1.
		int isum =(int)(inum +lnum); 
		System.out.println("isum: "+isum);
		
		//2.long타입 값을 int로 강제 형변환
		int isum2 = inum +(int)lnum;
		System.out.println("isum2: "+ isum2);
		
		//3.long타입 변수에 저장
		long lsum = inum + lnum;
		System.out.println("lsum:"+ lsum);
	}
	public void test3() {
		long lnum = 100;
		float fnum = lnum; // 정수는 실수로 자동 형변환 된다.
		System.out.println("fnum: "+fnum);
		
		double dnum = 10.5;
		int inum = (int)dnum;
		System.out.println("inum:"+inum); // 10.5 -> 10 데이터 손실 발
		
	}
}
