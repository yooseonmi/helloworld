package com.greedy.section5.typecasting;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* 강제 형변환 */
		/*
		 * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
		 **/
		

		/*
		 * 자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
		 * 1. 강제 형변환 규칙 
		 * 1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
		 * 1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다.
		 * 1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
		 * 1-4. 논리형은 강제 형변환 규칙에서도 제외된다. 
		 * */
		
		/* 1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다. */
		/* 1-1-1. 정수끼리의 강제 형변환 */
		long lnum = 8;
//		int inum = lnum; //데이터 손실 가능성을 컴파일러가 알려준다. (에러남)
		
		int inum = (short)lnum; //변경하려는 자료형을 명시하여 강제 형변환을 해야한다. 
		
		System.out.println("inum: " + inum);
	
		short snum = (short)lnum;
		byte bnum = (byte)lnum;
		
		System.out.println("snum: " + snum);
		System.out.println("bnum: " + bnum);
		
		/* 1-1-2. 실수끼리의 강제 형변환 */
		double dnum = 8.0;
		//float fnum = dnum; // 데이터 손실 가능성을 컴파일러가 알려준다. (에러남)
		float fnum = (float)dnum;
		
		/* 1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다. */
		float fnum2 = 4.0f;  // 4->8byte 인 것 같지만 실수를 정수로 자동 형변환이 안된다.
		long lnum2 = (long)fnum2;
		
		System.out.println("lnum2: " + lnum2);
		
		/* 1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제 형변환이 필요하다. */
		
		char ch='a';
		byte bnum2 = (byte)ch;
		short snum2 = (short)ch; //부호 비트 데이터가 손실 될 수 있어서 byte크기가 같아도 강제 형변환이 필요하다.
		
		int num1 = 97;
		int num2 = -97;		// 음수도 강제 형변환 하면 대입할 수 있다.
		
		char ch2 = (char)num1; //정수가 그 정수값에 해당하는 문자로 변경된다.
		char ch3 = (char)num2;
		
		System.out.println("char2, char3:  " + ch2 + ch3);
		
			
		
		
		
		
		
			
			
		
	}

}
