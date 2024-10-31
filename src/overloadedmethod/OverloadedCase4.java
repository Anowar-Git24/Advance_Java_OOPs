package overloadedmethod;

public class OverloadedCase4 {

    class Test {
        // Method for a single integer
        public void m1(int i) {
            System.out.println("General Method with single int: " + i);
        }

        // Var-args method for multiple integers (including zero)
        public void m1(int... i) {
            System.out.println("Var-arg Method with int...: " + java.util.Arrays.toString(i));
        }
    }

    public static void main(String[] args) {
        Test t = new OverloadedCase4().new Test();
        t.m1();           // Calls the var-arg method (no argument passed)
        t.m1(10, 20);     // Calls the var-arg method (multiple integers)
        t.m1(10);         // Calls the single int method
    }
}
