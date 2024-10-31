package overidingmethod;

public class OverRidingMethodCase8 {

	// Parent class with a private method
	class P {
		private void m1() {
			System.out.println("Parent private method");
		}
		
		// Public method to call the private method (for testing)
		public void callParentMethod() {
			m1();
		}
	}

	// Child class with a private method of the same name
	class C extends P {
		private void m1() {
			System.out.println("Child private method");
		}
		
		// Public method to call the private method (for testing)
		public void callChildMethod() {
			m1();
		}
	}

	public static void main(String[] args) {
		OverRidingMethodCase8 test = new OverRidingMethodCase8();

		// Creating an instance of the child class
		C child = test.new C();

		// Calling the public methods which internally call the private methods
		child.callParentMethod();  // Calls the private method from class P (parent)
		child.callChildMethod();   // Calls the private method from class C (child)
	}
}
