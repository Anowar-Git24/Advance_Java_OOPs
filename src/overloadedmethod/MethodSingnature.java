package overloadedmethod;

public class MethodSingnature {

    class Test {
        // Method with an integer parameter
        public void m1(int i) {
            System.out.println("Method m1 with int: " + i);
        }

        // Method with a string parameter
        public void m2(String s) {
            System.out.println("Method m2 with String: " + s);
        }
    }

    public static void main(String[] args) {
        MethodSingnature instance = new MethodSingnature(); // Create an instance of the outer class
        Test t = instance.new Test(); // Create an instance of the inner class
        
        t.m1(10); // Calls m1 with an integer
        t.m2("david"); // Calls m2 with a string
    }
}
