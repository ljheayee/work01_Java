package com.test01;


public class ArrayTest03 {
	public static void main(String[] args) {
		//배열하나 만들고, 데이터 입력
		char[] ch = new char[26];
		
		
		
		for(int i= 0; i<26; i++) {
			ch[i] = (char)(97 + i);
		}
		
		//1.a~z 배열 출력
		prn(ch);
		
		//2.ch 배열을 거꾸로 출력(원본은 그대로)
		reverse(ch);
		
		//3.ch 배열을 대문자로 바꾸어 출력(원본 변경)
		upper(ch);
		
		
	}
	
	public static void prn(char[] ch) {
		for(int i =0; i<ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println("\n");
		
		
	}

	public static void reverse(char[] ch) {
//1.		
//		
//		for(int i = ch.length - 1; i>=0; i--) {
//			System.out.print(ch[i] + " ");
//		}
//2.	
		char[]re= new char[ch.length];
		for(int i = ch.length-1, j=0; i>=0; i--, j++) {
			re[j] =ch[i];
		}
		prn(re);
		
		
	}
	
	public static void upper(char[] uch) {
		
		for(int i= 0; i<uch.length; i++) {
		uch[i] = Character.toUpperCase(uch[i]);
		
		}
		
		prn(uch);
	}
	
}
