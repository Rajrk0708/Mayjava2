package com.aiite.sample;

public class Test2 extends Test1 {
	
	public void childOne() {
		System.out.println("Child One");
	}
	
	public static void main(String[] args) {
		Test2 tt = new Test2();
		tt.childOne();
		tt.parent();
	}
		
}
