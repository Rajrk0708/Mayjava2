package com.aiite.sam2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) throws IOException {
	
		File f1 = new File("D:\\sample\\sample1\\Java Task 1.txt"); 
		
		Scanner sc = new Scanner(f1);
		
		String nextLine = sc.nextLine();
		System.out.println(nextLine);
		
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
	
}
