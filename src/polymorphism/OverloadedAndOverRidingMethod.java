package polymorphism;

public class OverloadedAndOverRidingMethod {
    // Parent class
    static class Parent {
        // Overloaded methods m1 in Parent class with different parameters
        public void m1() {
            System.out.println("Parent's m1() - no parameters");
        }

        public void m1(int x) {
            System.out.println("Parent's m1(int x) - with int parameter: " + x);
        }

        // Method that will be overridden in the Child class
        public void m1(String message) {
            System.out.println("Parent's m1(String message) - with String parameter: " + message);
        }
    }

    // Child class
    static class Child extends Parent {
        // Overriding the m1(String message) method in the Child class
        @Override
        public void m1(String message) {
            System.out.println("Child's overridden m1(String message) - with String parameter: " + message);
        }

        // Overloaded methods in Child class
        public void m1(double y) {
            System.out.println("Child's m1(double y) - with double parameter: " + y);
        }
    }

    // Main method
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        // Calling overloaded methods from Parent class
        parent.m1();
        parent.m1(10);
        parent.m1("Hello from Parent");

        // Calling overridden method in Child class
        child.m1("Hello from Child");

        // Calling overloaded methods from Child class
        child.m1(5);
        child.m1(3.14);
    }
}