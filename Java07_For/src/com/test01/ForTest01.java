package com.test01;

public class ForTest01 {
	public static void main(String[] args) {
		//testFor();
		//testFor2();
		testFor3();
	}
	
	public static void testFor() {
		//1~10 출력
		for (int i =1; i<=10; i++) {
			System.out.println("i = " + i);
		}
		//1~100 역순으로 출력
		for (int i = 100; i>0; i--) {
			System.out.println("i = " + i);
		}
		
		//for(int i = 1;;i++) {
		//	System.out.println(i);
		//}
	}
	
	public static void testFor2() {
		//증감식은 반드시 1씩 증감할 필요가 없다.
		for(int i=1; i<=10; i+=2) {
			System.out.println("i = " + i);
		}
		
		// 초기식과 증감식은 1개 이상 기입 가능
		for(int i =0, j = 10;i<10; i++,j-=2) {
			System.out.println("i = " + i);
			System.out.println("j = " + j);
		}
		
	}
	public static void testFor3() {
		//1~100사이의 임의의 난수를 구하고
		//부터 난수까지의 함계를 구하여 출력
		int sum = 0;
		int random = (int)(Math.random()*100) + 1;
		
		for(int i =1; i <=random; i++) {
			sum += i;
	
		}
		System.out.println("난수: " + random +" 합계 = " + sum);
	}
}
