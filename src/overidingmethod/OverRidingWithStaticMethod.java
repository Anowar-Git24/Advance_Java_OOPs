package overidingmethod;

public class OverRidingWithStaticMethod {
    // Inner classes need to be static to access from static main method
    static class P {
        public static void m1() {
            System.out.println("Static method in Parent class");
        }
    }

    static class C extends P {
        public static void m1() { // Hides the static method from Parent class
            System.out.println("Static method in Child class");
        }
    }

    public static void main(String[] args) {
        // No need to create outer instance since classes are now static
        P p = new P();
        P p1 = new C();
        C c = new C();

        System.out.println("--- Calling static methods using class names ---");
        P.m1(); // Calls Parent class's m1
        C.m1(); // Calls Child class's m1

        System.out.println("\n--- Calling static methods using references ---");
        p.m1();  // Warning: should access static method via class name
        p1.m1(); // Warning: should access static method via class name
        c.m1();  // Warning: should access static method via class name
    }
}