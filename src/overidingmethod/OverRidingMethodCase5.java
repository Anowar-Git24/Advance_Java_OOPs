package overidingmethod;

public class OverRidingMethodCase5 {
	
	class P {
		// Final method in parent class (cannot be overridden)
		public final void m1() {
			System.out.println("Parent method");
		}
	}
	
	class C extends P {
		// No m1() method here because overriding is not allowed
	}

	public static void main(String[] args) {
		OverRidingMethodCase5 test = new OverRidingMethodCase5();
		
		// Creating instances
		P parent = test.new P();
		C child = test.new C();
		
		// Calling the method
		parent.m1(); // Calls parent method
		child.m1();  // Calls parent method as well, since m1() is inherited and not overridden
	}
}


