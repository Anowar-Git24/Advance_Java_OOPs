package overloadedmethod;

public class DifferentArgumentCase5 {

    class Test {

        public void m1(int i, float f) {
            System.out.println("Int-Float Version");
        }

        public void m1(float f, int i) {
            System.out.println("Float-Int Version");
        }
    }

    public static void main(String[] args) {
        // Instantiate the outer class
        DifferentArgumentCase5 outer = new DifferentArgumentCase5();

        // Use the outer class instance to create the inner class instance
        Test t = outer.new Test();

        // Call the methods
        t.m1(10, 10.5f);           // Calls m1(int i, float f)
        // t.m1(10, 10);           // Ambiguity error, commented out
        t.m1(10.5f, 10);           // Calls m1(float f, int i)
       // t.m1(10.5f, 10.5f);        // Ambiguity error, commented out
    }
}
