package inheritance;

// Demonstrating hierarchical inheritance in Java
public class HierarchecalInheritance {

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

    // Class C extending A
    class C extends A {
        public void displayC() {
            System.out.println("Inside class C");
        }
    }

    // Class D extending A
    class D extends A {
        public void displayD() {
            System.out.println("Inside class D");
        }
    }

    public static void main(String[] args) {
        // Since A, B, C, and D are inner classes, we need an instance of HierarchicalInheritance
        HierarchecalInheritance example = new HierarchecalInheritance();

        // Creating instances of class B, C, and D
        B bInstance = example.new B();
        C cInstance = example.new C();
        D dInstance = example.new D();

        // Calling methods from the base class A, and the respective class methods
        bInstance.displayA(); // Inherited from class A
        bInstance.displayB(); // Method from class B

        cInstance.displayA(); // Inherited from class A
        cInstance.displayC(); // Method from class C

        dInstance.displayA(); // Inherited from class A
        dInstance.displayD(); // Method from class D
    }
}
