package overloadedmethod;

public class AutomaticPromotionOverloadedMethod {

    class Test {
        public void m1(int i) {
            System.out.println("Int Argument Method");
        }

        public void m1(float f) {
            System.out.println("Float Argument Method");
        }

        public void m1(byte b) {
            System.out.println("String Argument Method");
        }
    }

    public static void main(String[] args) {
        // Since Test is an inner class, we need an instance of AutomaticPromotionOverloadedMethod
        AutomaticPromotionOverloadedMethod instance = new AutomaticPromotionOverloadedMethod();
        Test t = instance.new Test(); // Create an instance of the inner class

        // Method calls with different arguments
        t.m1(10);        // Calls the int version
        t.m1(10.5f);     // Calls the float version
        t.m1('A');       // 'A' is promoted to int, calls the int version
        t.m1(10L);       // 10L (long) is promoted to float, calls the float version

        // Uncommenting this line will cause a compilation error since there's no method for double
        // t.m1(10.5);    // No method with double argument, and no automatic promotion
    }
}
