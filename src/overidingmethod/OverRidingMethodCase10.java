package overidingmethod;

public class OverRidingMethodCase10 {
	// Case 1: Parent method is public, child can be public only
	class Parent1 {
	    public void method1(String message) {
			System.out.println("Parent1 - public method: " + message);
		}
	}
	class Child1 extends Parent1 {
		public void method1(String message) {  // same level
			System.out.println("Child1 - public method: " + message);
		}
	}

	// Case 2: Parent method is protected, child can be protected or public
	class Parent2 {
		protected void method2(String message) {
			System.out.println("Parent2 - protected method: " + message);
		}
	}
	class Child2 extends Parent2 {
		protected void method2(String message) {  // same level
			System.out.println("Child2 - protected method: " + message);
		}
	}
	
	class Child3 extends Parent2 {
		public void method2(String message) {  // less restrictive
			System.out.println("Child3 - public method: " + message);
		}
	}

	// Case 3: Parent method is default (no modifier), child can be default, protected, or public
	class Parent3 {
		void method3(String message) {  // default access level
			System.out.println("Parent3 - default method: " + message);
		}
	}
	class Child4 extends Parent3 {
		void method3(String message) {  // same level
			System.out.println("Child4 - default method: " + message);
		}
	}
	
	class Child5 extends Parent3 {
		protected void method3(String message) {  // less restrictive
			System.out.println("Child5 - protected method: " + message);
		}
	}
	
	class Child6 extends Parent3 {
		public void method3(String message) {  // less restrictive
			System.out.println("Child6 - public method: " + message);
		}
	}
	
	// Testing the methods
	public static void main(String[] args) {
		OverRidingMethodCase10 examples = new OverRidingMethodCase10();

		Parent1 p1 = examples.new Child1();
		p1.method1("Hello from Child1");
		
		Parent2 p2 = examples.new Child2();
		p2.method2("Hello from Child2");

		p2 = examples.new Child3();
		p2.method2("Hello from Child3");

		Parent3 p3 = examples.new Child4();
		p3.method3("Hello from Child4");

		p3 = examples.new Child5();
		p3.method3("Hello from Child5");

		p3 = examples.new Child6();
		p3.method3("Hello from Child6");
	}
}
