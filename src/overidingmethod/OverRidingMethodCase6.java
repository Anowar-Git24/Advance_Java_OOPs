package overidingmethod;

public class OverRidingMethodCase6 {

	// Parent class with a non-abstract method
	class P {
		public void m1() {
			System.out.println("Parent method");
		}
	}

	// Abstract class that extends P and makes the method abstract
	abstract class C extends P {
		@Override
		public abstract void m1(); // Abstract method must be implemented by subclasses
	}

	// Concrete subclass that implements the abstract method
	class Subc extends C {
		@Override
		public void m1() {
			System.out.println("Child method");
		}
	}

	// Main method to test the classes
	public static void main(String[] args) {
		OverRidingMethodCase6 test = new OverRidingMethodCase6();

		// Creating instances
		P parent = test.new P();
		Subc child = test.new Subc();

		// Calling methods
		parent.m1(); // Calls the parent method
		child.m1();  // Calls the overridden child method
	}
}

