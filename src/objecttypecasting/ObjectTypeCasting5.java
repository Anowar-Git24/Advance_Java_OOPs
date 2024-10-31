package objecttypecasting;

public class ObjectTypeCasting5 {
    
	class P {
		public void m1() {
			System.out.println("Parent");
		}
	}
	
	class C extends P {
		@Override
		public void m1() {
			System.out.println("Child");
		}
	}
	
	public static void main(String[] args) {
		ObjectTypeCasting5 outer = new ObjectTypeCasting5();
		C c = outer.new C();
		c.m1();           // Calls the m1() method in C, output: "Child"
		((P) c).m1(); // Casts c to P, but calls the overridden m1() in C, output: "Child"
		//((P) c).m2(); // Removed Undefined m2() Calls: Since m2() does not exist, I removed those calls to avoid compilation errors.
	}
}
