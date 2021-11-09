package com.deno4ka;

public class C {

	static {
		{
			System.out.println("static C");
//			if (true) {
//				throw new ThreadDeath();
//			}
		}
	}

	{
		System.out.println("non-static C");
//		if (true) {
//			throw new ThreadDeath();
//		}
	}

	private NestInn nestInn;
	private NestOut nestOut;
	private String s = "this is C";
	public static Long l = 1L;
	private final float f = 0.1f;

	public C() {
		System.out.println("constructor C");
	}

	void statMethod(Number n) throws NumberFormatException {
		System.out.println("statMethod C(Number)");
		throw new NumberFormatException("NFE");
	}

	void statMethod(Long l) {
		System.out.println("statMethod C(Long)");
	}

	static void statMethod() {
		System.out.println("statMethod C");
	}

	static void statMethod(String s) {
		System.out.println("statMethod C" + s);
	}

	public void testNest() {
		class NestTest {
			int x = 1;
			String nis = s;
			float fl = f;
		}
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	class NestInn {
		int x = 1;
		String nis = s;
		float f = C.this.f;
	}

	static class StaticNestInn {
		int x = 1;
		Long num = l;
	}

}

class NestOut {
	int y = 1;
	String nos = new C().getS();
}
