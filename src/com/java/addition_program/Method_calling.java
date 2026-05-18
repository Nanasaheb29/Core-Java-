package com.java.addition_program;

public class Method_calling {

  public void M1() {
	  System.out.println("this is from m1 method");
  }
  
  public void M2 () {
	  System.out.println("this is from m2 method");
  }
  
  public static void main(String[] args) {
	Method_calling obj = new Method_calling();
	
	obj.M1();
	obj.M2();
	
}
  
}
