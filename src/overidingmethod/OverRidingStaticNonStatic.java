package overidingmethod;

public class OverRidingStaticNonStatic {
	
	static class P {
		String s = "Parent";  // Non-static variable in the Parent class
	}

	class C extends P {
		String s = "Child";   // Non-static variable in the Child class
	}


// External Test class

	public static void main(String[] args) {
		OverRidingStaticNonStatic outer = new OverRidingStaticNonStatic();

		OverRidingStaticNonStatic.P p = new OverRidingStaticNonStatic.P();
		System.out.println("p.s: " + p.s); // Accesses Parent's 's', prints "Parent"

		OverRidingStaticNonStatic.C c = outer.new C();
		System.out.println("c.s: " + c.s); // Accesses Child's 's', prints "Child"

		OverRidingStaticNonStatic.P p1 = outer.new C();
		System.out.println("p1.s: " + p1.s); // Accesses Parent's 's' due to reference type, prints "Parent"
	}
}
