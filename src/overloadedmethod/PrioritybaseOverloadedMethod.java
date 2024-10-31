package overloadedmethod;

public class PrioritybaseOverloadedMethod {

    class Test {

        public void m1(Object o) {
            System.out.println("Object Version");
        }

        public void m1(String s) {
            System.out.println("String Version");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        PrioritybaseOverloadedMethod outer = new PrioritybaseOverloadedMethod();
        
        // Use the outer class instance to create an instance of the inner class
        Test t = outer.new Test();

        // Now you can call the overloaded methods
        t.m1(new Object());     // Calls m1(Object o)
        t.m1("Hossain");        // Calls m1(String s)
        t.m1(null);             // Calls m1(String s), because String is more specific than Object
    }
}
