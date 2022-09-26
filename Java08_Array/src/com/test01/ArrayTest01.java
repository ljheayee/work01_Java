package com.test01;
import java.util.Scanner;


public class ArrayTest01 {
	public void TestArray(){
		//배열을 사용하지 않았을 때
		/*
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		int sum = 0;
		
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		*/
		
		int[] arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
		//값 대입할 때 반복문 사용
		for(int i =0; i<arr.length; i++) {
			arr[i] = i+5;
		}
		
		int sum = 0;
		
		for(int i =1; i<=arr.length;i++) {
			sum += arr[i-1];
			
		}
		
		System.out.println(sum);
	
	}
	public void testArray2() {
		//배열 선언
		//자료형[] 변수명:
		//자료형 변수명[];
		//int[] iarr;
		//char carr[];
		
		//선언한 참조형변수(레퍼런스변수)에 배열을 할당하여 대입
		//new 연산자는 heap 영역에 공간 할당하고 주소값을 반환하는 연산자이다.
		// iarr = new int[]; 크기 지정을 해주지 않으면에러 발생
		//iarr = new int[5];
		//carr = new char[10];
		
		int[]iarr = new int[5];
		char carr[] = new char[10];
		
		
		System.out.println(carr);
		System.out.println(iarr);
		System.out.println(carr.hashCode());
		System.out.println(iarr.hashCode());
		
		System.out.println("iarr의 길이: "+ iarr.length);
		
		//스캐너 활용
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 길이 입력: ");
		int size = sc.nextInt();
		
		double[] darr = new double[size];
		System.out.println(darr.hashCode());
		System.out.println(darr.length);
		
		//해시코드가 다르다
		// 한번 지정한 배열의 크기는 변경 불가
		//사이즈 변경이 아닌 새로운 배열을 생성하여 그 주소값을 레퍼런스 변수에 엎어 쓴것
		darr = new double[30];
		System.out.println(darr.hashCode());
		System.out.println(darr.length);
		
		//darr = null;
		//System.out.println(darr.length);
		
	}
	
	public void testArray3() {
		int[] iarr = new int[5];
		
		for(int i = 0; i<iarr.length; i++) {
			System.out.println("iarr["+i+"]의 값:"+ iarr[i]);
		}
	
		//블럭을 통해 초기화 가능
		int[]iarr2 = {11,22,33,44,55};
		int[]iarr3 = new int[]{11,22,33,44,55};
	}
}
