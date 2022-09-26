package com.test02;

import com.test01.MethodTest01;

public class MethodTest03 {
	public static void main(String[] args) {
		MethodTest01.publicMethod();
		//com.test01.MethodTest01.protectedMethod();
		//com.test01.MethodTest01.defaultMethod();
		//MethodTest01.privateMethod();
		MethodTest01 test = new MethodTest01();
		test.NonStaticMethod();
		new MethodTest01().NonStaticMethod();
		}
	}
