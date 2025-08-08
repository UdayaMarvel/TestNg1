package com.Application;

public class ClassA {
	public static ClassA b = null;
	private ClassA() {}
	
	public static ClassA method() {
		if(b == null) {
			b = new ClassA();
		}
		return b;
	}
	
	public static void main(String[] args) {
		ClassA a = method();
		ClassA a1 = method();
		ClassA b = method();
		System.out.println(System.identityHashCode(a1));
		System.out.println(System.identityHashCode(a));
	}
}
