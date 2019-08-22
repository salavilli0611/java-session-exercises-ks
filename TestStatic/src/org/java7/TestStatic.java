package org.java7;

public class TestStatic {
	
	int var1;
	static int var2 = 99;
	
	public TestStatic(int a) {
		var1 = a;
	}
	
	public void nonStaticMethod() {
		System.out.println("Non-static method");
	}
	
	public static void staticMethod() {
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		TestStatic ts1 = new TestStatic(100);
		System.out.println("Instance Var = " + ts1.var1); 			 	// accessing instance variable by creating Object
		ts1.nonStaticMethod();											// calling a non-static method using Object
		System.out.println("Static Var = " + TestStatic.var2); 		// accessing static variable directly from classname 
		TestStatic.staticMethod();										// calling a static method with classname direcctly
		
	}

}
