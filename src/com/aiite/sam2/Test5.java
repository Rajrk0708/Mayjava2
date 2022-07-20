package com.aiite.sam2;

import java.util.Scanner;

public class Test5 {
	
	public static int customerVerification() {
		
		int epin = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your Name");
		String nextLine = sc.nextLine();
		
		String c1 = "Raj Kumar";
		
		if (c1.equals(nextLine)) {
			System.out.println("enter your Pin");
			int nextInt = sc.nextInt();
			epin = nextInt;
			
		} else {
			System.out.println("incorrect name you are not our bank customer");
		}
		return epin;
	}
	
	public static void main(String[] args) throws Exception {
		int sp = 1234;
		int customerVerification = customerVerification();
		
		if (sp==customerVerification) {
			System.out.println("Enter Amount");
		} else {
			throw new Test6();
		}
		
	}
}
