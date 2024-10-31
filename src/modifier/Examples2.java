package modifier;

public class Examples2 {

    public class B {
        // Inner class B can have additional functionality if needed
    }

    public static void main(String[] args) {
        // Create an instance of Examples1 (the outer class)
        Examples1 examples1 = new Examples1();

        // Access the inner class A of Examples1
        Examples1.A a = examples1.new A();  // Correct syntax for accessing an inner class
        
        // Call the m1 method of the A class
        a.m1();  // Output: A class method
    }
}
