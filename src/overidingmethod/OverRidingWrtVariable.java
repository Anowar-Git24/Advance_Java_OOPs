package overidingmethod;

public class OverRidingWrtVariable {

	class P {
		String s = "Parent";
	}
	
	class C extends P {
		String s = "Child";
	}


// External Test class
class Test {
	public static void main(String[] args) {
		OverRidingWrtVariable outer = new OverRidingWrtVariable();

		OverRidingWrtVariable.P p = outer.new P();
		System.out.println("p.s: " + p.s); // Accesses Parent's 's'

		OverRidingWrtVariable.C c = outer.new C();
		System.out.println("c.s: " + c.s); // Accesses Child's 's'

		OverRidingWrtVariable.P p1 = outer.new C();
		System.out.println("p1.s: " + p1.s); // Accesses Parent's 's' due to reference type
	}
}
}