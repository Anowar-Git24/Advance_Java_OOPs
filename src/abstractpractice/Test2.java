package abstractpractice;

// Abstract class Test2
abstract public class Test2 {
    public void m2() {
        System.out.println("Method m2 called.");
    }

    public void m3() {
        // Implementation of m3, if needed
    }

    public void m4() {
        // Implementation of m4, if needed
    }

    public void m5() {
        // Implementation of m5, if needed
    }
}

// Concrete class Test2Impl that extends Test2
class Test2Impl extends Test2 {

    public static void main(String[] args) {
        // Creating an instance of Test2Impl
        Test2 test2 = new Test2Impl();
        test2.m2();  // Calls the m2 method
    }
}
