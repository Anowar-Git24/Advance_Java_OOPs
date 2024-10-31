package inheritance;

public class MultiLebelInheritance {

    interface A {
        default void displayA() {
            System.out.println("Interface A");
        }
    }

    interface B {
        default void displayB() {
            System.out.println("Interface B");
        }
    }

    // Class C implements both interfaces A and B
    class C implements A, B {

        // C can use methods from both A and B
        public void displayBoth() {
            displayA();
            displayB();
        }
    }

    public static void main(String[] args) {
        MultiLebelInheritance example = new MultiLebelInheritance();
        C c = example.new C();
        c.displayBoth(); // Calls methods from both A and B
    }
}
