package com.greedy.section5.typecasting;

public class Application3 {
	
	public static void main(String[] args) {
		
		/* 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산 */
		
		
		int inum = 10;		 
		long lnum = 100;
		
		//자바에서는 같은 자료형끼리만 연산이 가능하다.
		
		// 방법1. 두 수의 연산 결과를 int 형으로 변환 후 int 자료형 변수에 리턴받는다. = 계산 다하고 나서 형변
		// int isum = inum + lnum;
		
		int isum = (int)(inum + lnum);
		System.out.println("isum: " + isum);
		
		//방법2. long형 값을 int로 강제 형변환한다. = 계산 전에 필요한 애만 형변
		
		int isum2 = inum + (int)lnum;
		System.out.println("isum: " + isum2);
		
		//방법3. 결과 값을 long형 자료형으로 받는다(자동형변환) = isum 자체를 long으로 해주는거
		
		long isum3 = inum + (int)lnum;
		System.out.println("isum: " + isum3);
				
		// int 미만의 연산의 처리 결과는 int형이다.
		
		byte byteNum1 = 1;
		byte byteNum2 = 2;
		short shortNum1 = 3;
		short shortNum2 = 4;
		
		int result1 = byteNum1 + byteNum2;
		int result2 = byteNum1 + shortNum1;
		
		System.out.println("result1: " + result1 +" , "+ "result2: " + result2); 
		
		
		
		
	}

}
