package overidingmethod;

public class OverRidingMethodCase4 {
	
	class P {
		// Parent method with protected access modifier
		protected void m1() {
			System.out.println("Parent method");
		}
	}
	
	class C extends P {
		// Child class overriding the parent method
		@Override
		protected void m1() {
			System.out.println("Child method");
		}
	}
	
	public static void main(String[] args) {
		OverRidingMethodCase4 test = new OverRidingMethodCase4();
		
		// Creating instances
		P parent = test.new P();
		C child = test.new C();
		
		// Calling the methods
		parent.m1(); // Calls parent method
		child.m1();  // Calls overridden child method
	}
}
