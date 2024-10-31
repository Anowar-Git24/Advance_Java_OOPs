package overidingmethod;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExceptionOverRiding {

	// Case 1: Parent method throws a checked exception, and child method throws the same or a subclass
	class Parent1 {
		public void method1() throws IOException {
			System.out.println("Parent1 - method1 with IOException");
		}
	}
	
	class Child1 extends Parent1 {
		@Override
		public void method1() throws IOException { // same exception as parent
			System.out.println("Child1 - method1 with IOException");
		}
	}
	
	class Child2 extends Parent1 {
		@Override
		public void method1() throws FileNotFoundException { // subclass of IOException
			System.out.println("Child2 - method1 with FileNotFoundException");
		}
	}

	// Case 2: Parent method throws a checked exception, and child method throws no exception
	class Parent2 {
		public void method2() throws Exception {
			System.out.println("Parent2 - method2 with Exception");
		}
	}
	
	class Child3 extends Parent2 {
		@Override
		public void method2() { // no exception thrown
			System.out.println("Child3 - method2 with no exception");
		}
	}

	// Case 3: Parent method does not throw checked exception, child cannot throw checked exceptions
	class Parent3 {
		public void method3() {
			System.out.println("Parent3 - method3 with no exception");
		}
	}
	
	class Child4 extends Parent3 {
		@Override
		public void method3() { // cannot add checked exception
			System.out.println("Child4 - method3 with no exception");
		}
	}

	// Case 4: Both methods can freely throw unchecked exceptions (optional)
	class Parent4 {
		public void method4() throws NullPointerException {
			System.out.println("Parent4 - method4 with NullPointerException");
		}
	}
	
	class Child5 extends Parent4 {
		@Override
		public void method4() throws IllegalArgumentException { // can replace or add unchecked exception
			System.out.println("Child5 - method4 with IllegalArgumentException");
		}
	}

	// Testing all cases
	public static void main(String[] args) {
		ThrowsExceptionOverRiding examples = new ThrowsExceptionOverRiding();

		Parent1 p1 = examples.new Child1();
		try {
			p1.method1();
		} catch (IOException e) {
			System.out.println("Caught IOException in main");
		}

		p1 = examples.new Child2();
		try {
			p1.method1();
		} catch (IOException e) {
			System.out.println("Caught IOException in main");
		}

		Parent2 p2 = examples.new Child3();
		try {
			p2.method2();
		} catch (Exception e) {
			System.out.println("Caught Exception in main");
		}

		Parent3 p3 = examples.new Child4();
		p3.method3(); // no exception handling needed

		Parent4 p4 = examples.new Child5();
		p4.method4(); // no exception handling needed for unchecked exceptions
	}
}
