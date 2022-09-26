package com.test01;

public class ArrayTest02 {
	public void shallowCopy() {
		//얕은 복사는 배열의 주소만 복사한다.
		int[] oArr = {1,2,3,4,5};
		int [] cArr = oArr;
		
		String str = "";
		
		for(int i =0; i<oArr.length; i++){
		str += oArr[i] + " ";
		}
	
		System.out.println("1.oArr: " + str);
		
		str ="";
		for(int i=0; i <cArr.length; i++) {
			str +=cArr[i] + " ";
			
		}
		System.out.println("2.cArr: " + str);
		
		//oArr의 인덱스 0인 방의 값을 99로 변경
		oArr[0] = 99;
		
		str = "";
		
		for(int i =0; i<oArr.length; i++){
		str += oArr[i] + " ";
		}
	
		System.out.println("1.oArr: " + str);
		
		str ="";
		for(int i=0; i <cArr.length; i++) {
			str +=cArr[i] + " ";
			
		}
		System.out.println("2.cArr: " + str);
		
		System.out.println("oArr의 hashCode: " + oArr.hashCode());
		System.out.println("cArr의 hashCode: " + cArr.hashCode());
		
	}
	
	public void deepCopy1() {
		//깊은 복사: 동일한 새로운 배열을 하나 생성하여 값을 복사
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[oArr.length]; // == new int[5]		
		
		//for문을 이용하여 1:1로 값 복사
		for(int i =0;i<oArr.length;i++) {
			cArr[i] = oArr[i];
		}
		//oArr 저장 된 값 확인
		String str = "";
		
		for(int i =0; i<oArr.length; i++){
		str += oArr[i] + " ";
		}
	
		System.out.println("1.oArr: " + str);
		
		//cArr 저장 된 값 확
		str ="";
		for(int i=0; i <cArr.length; i++) {
			str +=cArr[i] + " ";
			
	}
		System.out.println("2.cArr: " + str);
		
		//배열의 인덱스 0의 값을 99로 변경
		oArr[0] = 99;
		str = "";
		
		for(int i =0; i<oArr.length; i++){
		str += oArr[i] + " ";
		}
	
		System.out.println("3.oArr: " + str);
		
		//cArr 저장 된 값 확
		str ="";
		for(int i=0; i <cArr.length; i++) {
			str +=cArr[i] + " ";
			
	}
		System.out.println("4.cArr: " + str);
		
		System.out.println("oArr hascode: " + oArr.hashCode());
		System.out.println("cArr hascode: " + cArr.hashCode());

		
		
	}
	public void deepCopy2() {
	int[] oArr = {1,2,3,4,5};
	int[] cArr = new int[10];
	
	
	//2.arraycopy()
	//arraycopy(src, srcPos, dest, destPost, length);
	//src: 원본배열, srcPos: 복사시작위치
	//dest: 카피배열, 	destPos: 붙여넣기시작위치
	//length: 복사될 길이
	
	//System.arraycopy(oArr, 0, cArr, 3, oArr.length);
	
	//3.clone()
	System.out.println("준비된 배열 주소: " + cArr.hashCode());
	
	cArr = oArr.clone();
	
	System.out.println("준비된 배열 주소: " + cArr.hashCode());
	System.out.println("준비된 배열 주소: " + oArr.hashCode());
	
	
	//oArr 저장 된 값 확인
			String str = "";
			
			for(int i =0; i<oArr.length; i++){
			str += oArr[i] + " ";
			}
		
			System.out.println("1.oArr: " + str);
			
			//cArr 저장 된 값 확
			str ="";
			for(int i=0; i <cArr.length; i++) {
				str +=cArr[i] + " ";
				
		}
			System.out.println("2.cArr: " + str);
	}
}
