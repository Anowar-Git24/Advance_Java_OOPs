package inheritance;

public class BuiltLabelInheritance {

    // Base class A
    class A {
        public void displayA() {
            System.out.println("Inside class A");
        }
    }

    // Class B extending A
    class B extends A {
        public void displayB() {
            System.out.println("Inside class B");
        }
    }

    // Class C extending B (and indirectly A)
    class C extends B {
        public void displayC() {
            System.out.println("Inside class C");
        }
    }

    public static void main(String[] args) {
        // Since A, B, and C are inner classes, we need an instance of BuiltLabelInheritance
        BuiltLabelInheritance example = new BuiltLabelInheritance();

        // Creating an instance of class C, which inherits from B and A
        C cInstance = example.new C();
        
        // Calling methods from C, B, and A
        cInstance.displayA(); // Method from class A
        cInstance.displayB(); // Method from class B
        cInstance.displayC(); // Method from class C
    }
}
