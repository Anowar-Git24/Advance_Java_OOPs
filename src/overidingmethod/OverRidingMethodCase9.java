package overidingmethod;

public class OverRidingMethodCase9 {
	class P {
		public void m1 () {
			
		}
	}
	
	class C extends P {
		//protected void m1 () {
			
		}
	}

// In Java, method overriding requires that the access level of the overridden method 
//in the child class should not be more restrictive than that in the parent class.
//In your code, the parent class (P) defines m1() with public access, while the child class 
//(C) attempts to override it with protected access. This results in a compile-time error, 
//as it violates the access level rule.


