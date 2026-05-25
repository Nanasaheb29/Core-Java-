package com.java.addition_program;

public class ConditionStatment {

	public void m1() {
		System.out.println("this is true");
	}

	public void m2() {
		System.out.println("this is false");
	}

	int num = 20;

	public void calling() {

		ConditionStatment cs = new ConditionStatment();

		if (num >= 30) {
			cs.m1();
		} else {
			cs.m2();
		}
	}

	public static void main(String[] args) {
		ConditionStatment cs = new ConditionStatment();
		cs.calling();
	}
}
