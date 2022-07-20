package com.aiite.sample;

public class Test3 extends Test1 {
	
	public void childTwo() {
		System.out.println("Child Two");
	}
	
	public static void main(String[] args) {
		Test3 tt = new Test3();
		tt.parent();
		tt.childTwo();
	}
	

}
