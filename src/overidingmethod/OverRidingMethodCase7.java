package overidingmethod;

public class OverRidingMethodCase7 {

	// Abstract parent class
	abstract class P {
		// Abstract method to be implemented by subclasses
		public abstract void m1();
	}

	// Concrete child class implementing the abstract method
	class C extends P {
		@Override
		public void m1() {
			System.out.println("Child method implemented");
		}
	}

	// Main method to test the classes
	public static void main(String[] args) {
		OverRidingMethodCase7 test = new OverRidingMethodCase7();

		// Creating an instance of the concrete class C
		P instance = test.new C();

		// Calling the method
		instance.m1(); // Calls the implemented method in class C
	}
}
