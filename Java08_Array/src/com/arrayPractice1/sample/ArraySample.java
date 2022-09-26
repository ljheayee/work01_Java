package com.arrayPractice1.sample;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {
	public void test1() {
		
	int[] arr = new int[10];
	int sum = 0;
	
		for(int i =0; i<arr.length; i++) {
			int num = (int) new Random().nextInt(100) +1;
			arr[i] = num;
			sum += arr[i];
			System.out.print(arr[i]+ " + ");
		}
		System.out.println("합계: " + sum);
	}
	
	public void test2() {
		int[] arr = new int[10];
		
		
		for(int i=0; i<arr.length; i++) {
			int num = (int) new Random().nextInt(100) +1;
			arr[i] = num;
			
		
		
			System.out.print(num + " ");
		}
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("최대: " + max +"최소: "+  min);
		
	}
	
	public void test3() {
		byte arr[] = new byte[10];
		new Random().nextBytes(arr);
		int sum = 0;
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			if(arr[i] % 2==0) {
				sum += arr[i];
			}
		}
		
		System.out.println("합계" + sum);
		
	}
	
	public void test4() {
		System.out.print("숫자 문자열 입력: ");
		String str = new Scanner(System.in).next();
		int []strToNum = new int[str.length()];
		int sum = 0;
		
		for(int i = 0; i<str.length(); i++) {
			System.out.print(str.substring(i,i+1)+ " ");
			strToNum[i] = Integer.parseInt(str.substring(i,i+1));
			sum += strToNum[i];
		}
		System.out.println();
		System.out.println("합계:" + sum);
	}
	
	public void test5() {
		System.out.print("숫자 문자열 입력: ");
		String str = new Scanner(System.in).next();
		int []strToNum = new int[str.length()];
		int sum = 0;
		
		for(int i = 0; i<str.length(); i++) {
			
			sum += (str.charAt(i) - '0');
		}
		System.out.println();
		System.out.println("합계:" + sum);
	}
}