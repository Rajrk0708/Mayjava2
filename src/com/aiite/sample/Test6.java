package com.aiite.sample;

public class Test6 extends Test5 {
	
	@Override
	public void studentDetails(int age, long mobileNo) {
		System.out.println("Updated Entry");
		System.out.println("Student Age: " +age);
		System.out.println("Student Mobile No: " +mobileNo);
	}
	
	public static void main(String[] args) {
		Test5 tt = new Test6();
		tt.studentDetails("Vimal Kumar");
		tt.studentDetails(24, 9842624955l);
		tt.studentDetails("O+", "Male");
		
	}

}
