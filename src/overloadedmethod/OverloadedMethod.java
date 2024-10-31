package overloadedmethod;

public class OverloadedMethod {
    
    class Test {
        public void m1() {
            System.out.println("No Argument");
        }
        
        public void m1(int i) {
            System.out.println("Int Argument");
        }
        
        public void m1(double d) {
            System.out.println("Double Argument");
        }
    }
    
    public static void main(String[] args) {
        OverloadedMethod instance = new OverloadedMethod(); // Create an instance of the outer class
        Test t = instance.new Test(); // Create an instance of the inner class
        
        t.m1();       // Calls the no-argument version
        t.m1(10);     // Calls the int argument version
        t.m1(10.5);   // Calls the double argument version
    }
}
