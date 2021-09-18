package com.app.venkey4;

import com.app.venkey3.A;

public class B  extends A {
	
	public static void main(String[] args) {
		
		A a= new A();
		//a.m1();// compiletime eerror
		
		B b= new B();
		b.m1();
		
		A a1= new B();
		
		
		//b.m1();
	}

}
