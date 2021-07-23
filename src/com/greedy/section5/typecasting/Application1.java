package com.greedy.section5.typecasting;

public class Application1 {

	public static void main (String[] args) {
		
		/* 데이터 형변환
		 * 
		 * 데이터 형변환이 필요한 이유
		 * -자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다.
		 *  즉, 같은 데이터 타입끼리만 연살할 수 있다. (int는 int형 끼리만 연산할 수 있다.)
		 *  */
		
		
		/* 
		 * 형변환의 종류와 규칙 
		 * 1. 자동형변환(묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입변화 
		 * 	1-1. 작은 자료형에서 큰 자료형으로 자동 형변환 된다.
		 *  1-2. 정수는 실수로 자동 형변환이 된다.
		 *  1-3. 문자형은 int형으로 자동 형변환이 된다.
		 *  1-4. 논리형은 형변환 규칙에서 제외된다.
		 *  
		 *  2. 강제형변환(명시적 형변환) : 형변환(cast) 연산자를 이용한 강제적으로 수행하는 형변환
		 *   2-1. 자동형변환이 적용되지 않는 경우 강제 형변환이 필요하다.	
		 *  */
		
		
		// 1. 자동현변환 규칙 테스트
		// 1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환 된다.
		// 1-1-1. 정수끼리의 자동 형변
		
		byte bnum = 1;
		short snum = bnum;
		int inum = snum;
		long lnum = inum;
		
//		연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산한다.
		
		int num1 = 10;
		long num2 = 20;
		
//		int result = num1 + num2; //자동으로 큰 쪽 자료형인 long으로 변경 후 계산하기 때문에 int형 변수에 값을 담을 수 없다.
		
		long result = num1 + num2; // int + lon은 서로 다른 자료형이라 데이터 손실이 발생하지 않는다.
								   // int -> long 변환을 자동 수행 후 연산한다.
		System.out.println("result: " + result);
		
		// 1-1-1. 실수끼리의 자동 형변
		float fnum = 4.0f;
		double dnum = fnum;
		
		//연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산된다.
		
		double result2 = fnum + dnum;
		System.out.println("result2: " + result2);
		
		/* 1-2. 정수는 실수로 자동 형변환 된다. */
//		long eight = 888888888; //자동으로 형변환 된 것 (int 범위 벗어나면 에러 발생)
		long eight = 8;
		float four = eight;
			
		System.out.println("four: " + four);
		
		float result3 = eight + four;
		
		System.out.println("reslut3: " + result3);
		
		/* 1-3. 문자형은 int형으로 자동 형변환된다. */
		char ch1 = 'a';
		int charNumber = ch1;
		
		System.out.println("charNumber: " + charNumber);
		
		//int로 type이 정해지지 않는 리터럴 형태의 정수는 char 형 변수에 기록 가능하다.
		char ch2 = 65;				//65의 아스키코드 값을 직접 입력하지 않고 직접 숫자를 리터럴 형태로 대입해도 그 숫자에 해당하는 아스키코드 값을 보여
		System.out.println("ch2: " + ch2);

		/* 1-4. 논리형은 형변환 규칙에서 제외된다.
		 * 어느 자료형이든 boolean을 형변환 해서 담을 수 없다.
		 * */
		
		boolean isTrue = true;
//		byte b = isTrue;     //오류가 난다.
		
				
	
		
		
		
		
	}
	
}
