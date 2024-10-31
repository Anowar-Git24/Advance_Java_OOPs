package overidingmethod;

public class OverRidingCarVarOrg {

	// First example: Method Overloading with varargs and single int parameter
	class P {
		public void m1(int... i) {
			System.out.println("Parent's m1 method with int... i");
		}
	}

	class C extends P {
		// Overloaded, not overridden
		public void m1(int i) {
			System.out.println("Child's m1 method with single int i");
		}
	}

	// Second example: Method Overriding with varargs in both parent and child
	class Parent {
		public void m1(int... i) {
			System.out.println("Parent's m1 method with int... i");
		}
	}

	class Child extends Parent {
		// Overriding method with varargs
		@Override
		public void m1(int... i) {
			System.out.println("Child's m1 method with int... i");
		}
	}

	class Test {

	public static void main(String[] args) {
		OverRidingCarVarOrg outer = new OverRidingCarVarOrg();

		// First example: Method overloading
		P p = outer.new P();
		p.m1(10); // Calls Parent's m1(int... i)

		C c = outer.new C();
		c.m1(10); // Calls Child's m1(int i) - overloaded, not overridden

		P p1 = outer.new C();
		p1.m1(10); // Calls Parent's m1(int... i) due to reference type

		// Second example: Method overriding
		Parent parent = outer.new Parent();
		parent.m1(10); // Calls Parent's m1(int... i)

		Parent childAsParent = outer.new Child();
		childAsParent.m1(10); // Calls Child's m1(int... i) - overridden method

		Child child = outer.new Child();
		child.m1(10); // Calls Child's m1(int... i) - overridden method
	}
}
}
