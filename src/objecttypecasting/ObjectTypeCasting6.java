package objecttypecasting;

public class ObjectTypeCasting6 {
	
	class A {
		public void m1() {
			System.out.println("A");
		}
	}
	
	class B extends A {
		@Override
		public void m1() {
			System.out.println("B");
		}
	}
	
	class C extends A {
		@Override
		public void m1() {
			System.out.println("C");
		}
	}
	
	public static void main(String[] args) {
		ObjectTypeCasting6 outer = new ObjectTypeCasting6();
		C c = outer.new C();
		c.m1();        // Calls the m1() method in C, output: "C"

		// This cast will cause a ClassCastException at runtime
		// because C is not an instance of B.
		try {
			//((B) c).m1();
		} catch (ClassCastException e) {
			System.out.println("Cannot cast C to B");
		}
		
		((A) c).m1();  // Casts c to A, but still calls m1() in C due to polymorphism, output: "C"
	
	        // This would also throw ClassCastException if reached
	        // ((A)(B)c).m1();
	    }
	}
