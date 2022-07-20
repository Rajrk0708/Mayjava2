package com.aiite.sample;

public class Test8 extends Test7 {

	@Override
	public void empName(String Name) {
		System.out.println(Name);
	}

	@Override
	public void empId(int id) {
		System.out.println(id);
	}

	@Override
	public void empMobileNo(long no) {
		System.out.println(no);
	}

	public static void main(String[] args) {
		Test8 tt = new Test8();
		tt.companyName();
		tt.empName("Raj Kumar");
		tt.empId(16116);
		tt.empMobileNo(8189978448l);
	}

}
