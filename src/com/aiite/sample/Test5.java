package com.aiite.sample;

public class Test5 {

	public void studentDetails(String name) {
		System.out.println("Student Name: " + name);
	}
	
	public void studentDetails(int age, long mobileNo) {
		System.out.println("New Entry");
		System.out.println("Student Age: " +age);
		System.out.println("Student Mobile No: " +mobileNo);
	}
	
	public void studentDetails(String bg, String gender) {
		System.out.println("Student Blood Group: " +bg);
		System.out.println("Student Gender: " +gender);
	}

}
