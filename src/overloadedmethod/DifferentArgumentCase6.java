package overloadedmethod;

public class DifferentArgumentCase6 {
	class Animal {
	}

	class Monkey extends Animal {
	}

	class Test {
		public void m1(Animal a) {
			System.out.println("Animal Version");
		}

		public void m1(Monkey m) {
			System.out.println("Monkey Version");
		}
	}

	public static void main(String[] args) {
		// Instantiate the outer class
		DifferentArgumentCase6 outer = new DifferentArgumentCase6();
		
		// Use the outer class instance to create the inner class instance
		Test t = outer.new Test();
		
		Animal a = outer.new Animal();   // Create an instance of Animal
		t.m1(a);                        // Calls m1(Animal a)

		Monkey m = outer.new Monkey();   // Create an instance of Monkey
		t.m1(m);                        // Calls m1(Monkey m)

		Animal a1 = outer.new Monkey();  // Polymorphic behavior, Monkey instance assigned to Animal
		t.m1(a1);                       // Calls m1(Animal a) because the reference type is Animal
	}
}
