package com.aiite.sample;

public class Test4 extends Test1 {
	
	protected void childThree() {
		System.out.println("Child Three");
	}
	
	public static void main(String[] args) {
		Test4 tt = new Test4();
		tt.parent();
		tt.childThree();
	}

}
