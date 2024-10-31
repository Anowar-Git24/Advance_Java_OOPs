package modifier;

public class Examples1 {

    // Inner class A
    public class A { 
        public void m1() {
            System.out.println("A class method");
        }
    }

    public static void main(String[] args) {
        // Create an instance of Examples1
        Examples1 outer = new Examples1();
        
        // Create an instance of the inner class A
        Examples1.A a = outer.new A();
        
        // Call the m1 method of the A class
        a.m1();  // Output: A class method
    }
}
