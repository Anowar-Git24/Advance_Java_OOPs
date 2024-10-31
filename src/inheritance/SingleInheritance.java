package inheritance;

public class SingleInheritance {

    // Parent class A
    class A {
        public void displayA() {
            System.out.println("Inside class A");
        }
    }

    // Child class B extending A
    class B extends A {
        public void displayB() {
            System.out.println("Inside class B");
        }
    }

    public static void main(String[] args) {
        // Since A and B are inner classes, we need an instance of SingleInheritance
        SingleInheritance example = new SingleInheritance();

        // Creating an instance of class B, which extends A
        B bInstance = example.new B();
        bInstance.displayA(); // Method from class A (inherited by B)
        bInstance.displayB(); // Method from class B
    }
}
