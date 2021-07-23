package com.greedy.section04.overflow;

public class Application1 {
	

	public static void main (String[] args) {
		
		
		byte num1 = 127;
		byte num2;
		
		System.out.println("num1: " + num1);
		
		num1++;
		num2=num1;
		
		System.out.println("num2 overflow check: " + num2);
		
		byte num3 = -128;
		byte num4;
		
//		언더 플로우, 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.
		System.out.println("num3: " + num3);
		
		num3--;
		num4=num3;
		
		System.out.println("num4 underflow check: " + num3);
		
		int firstNum = 1000000; //100만
		int secondNum = 700000; //70만
		
		int multi = firstNum * secondNum;
		
		System.out.println("fristNum * secondNum: " + multi);
		
		long longmulti=firstNum * secondNum;
		System.out.println("fristNum * secondNum: " + longmulti);
		
		long result = (long)firstNum * secondNum;
		System.out.println("fristNum * secondNum: " + result);

		
	}
	
	
	

}
