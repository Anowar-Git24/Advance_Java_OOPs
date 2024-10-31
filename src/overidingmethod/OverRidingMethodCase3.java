package overidingmethod;

public class OverRidingMethodCase3 {
	
	class P {
		// Parent class method returning an Object
		public Object m1() {
			System.out.println("Parent method");
			return null;
		}
	}
	
	class C extends P {
		// Child class overriding the parent method with a more specific return type (String)
		@Override
		public String m1() {
			System.out.println("Child method");
			return null;  // You can return a string here if needed
		}
	}

	public static void main(String[] args) {
		OverRidingMethodCase3 test = new OverRidingMethodCase3();
		
		// Creating instances of parent and child classes
		P parent = test.new P();
		C child = test.new C();
		
		// Calling the method
		parent.m1(); // Calls parent method
		child.m1();  // Calls overridden child method
	}
}
