package com.deno4ka;

public class A extends B {

	static {
		{
			System.out.println("static A");
		}
	}

	{
		System.out.println("non-static A");
	}

	public A() {
		System.out.println("constructor A");
	}

}
