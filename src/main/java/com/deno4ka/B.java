package com.deno4ka;

public class B extends C {

	static {
		{
			System.out.println("static B");
		}
	}

	{
		System.out.println("non-static B");
	}

	public B() {
		System.out.println("constructor B");
	}

	static void statMethod() {
		System.out.println("statMethod B");
	}

	@Override
	void statMethod(Number n) {
		System.out.println("statMethod B(Number)");
	}
}
