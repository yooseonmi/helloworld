package com.greedy.section5.typecasting;

public class Application4 {
	
	public static void main(String[] args) {
		
		// 1. 의도하니 않은 데이터 손실 
		int inum = 290;
		byte bnum = (byte)inum;
		
		System.out.println("inum: " + inum);
		System.out.println("bnum: " + bnum); 
		
		double height = 178.8;
		int floorHeight = (int)height; //height의 소수점이하를 버림!
		System.out.println("floorHeight: " + floorHeight); 
		
		
		
		
		
		
		
	}

}
