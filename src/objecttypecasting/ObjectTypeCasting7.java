package objecttypecasting;

public class ObjectTypeCasting7 {
	
	static class A {
		public static void m1() {
			System.out.println("A");
		}
	}
	
	static class B extends A {
		public static void m1() {
			System.out.println("B");
		}
	}
	
	static class C extends A {
		public static void m1() {
			System.out.println("C");
		}
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.m1();       // Calls the static m1() in C, output: "C"

		// The cast ((A) c) here is irrelevant for static methods,
		// as the method is resolved at compile time.
		((A) c).m1();  // Still calls C.m1(), output: "C"

		// Attempting to cast to B will throw a ClassCastException at runtime.
		try {
			//((B) c).m1(); // This line will cause an exception if uncommented
		} catch (ClassCastException e) {
			System.out.println("Cannot cast C to B");
		}
	}
}
