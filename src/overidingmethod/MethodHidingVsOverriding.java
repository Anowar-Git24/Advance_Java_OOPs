package overidingmethod;

public class MethodHidingVsOverriding {
    static class Parent {
        // Static method (can be hidden, not overridden)
        public static void staticMethod() {
            System.out.println("Static method in Parent class");
        }
        
        // Instance method (can be overridden)
        public void instanceMethod() {
            System.out.println("Instance method in Parent class");
        }
    }

    static class Child extends Parent {
        // Hides the static method from Parent
        public static void staticMethod() {
            System.out.println("Static method in Child class");
        }
        
        // Overrides the instance method from Parent
        @Override
        public void instanceMethod() {
            System.out.println("Instance method in Child class");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Static Method Hiding Demo ---");
        // Static method calls (method hiding)
        Parent.staticMethod();  // Calls Parent's static method
        Child.staticMethod();   // Calls Child's static method
        
        System.out.println("\n--- Method Overriding Demo ---");
        // Creating objects with different reference types
        Parent parent = new Parent();
        Parent childAsParent = new Child();  // Polymorphic reference
        Child child = new Child();

        // Calling instance methods
        parent.instanceMethod();        // Calls Parent's instance method
        childAsParent.instanceMethod(); // Calls Child's instance method (polymorphism)
        child.instanceMethod();         // Calls Child's instance method
        
        System.out.println("\n--- Key Difference Demo ---");
        // Demonstrate the difference using an array and loop
        Parent[] family = {new Parent(), new Child()};
        for (Parent member : family) {
            // This will show polymorphic behavior (calls appropriate overridden method)
            member.instanceMethod();
            
            // This will always call Parent's static method because it uses the reference type
            Parent.staticMethod();
        }
        
        System.out.println("\n--- Reference Type vs Object Type Demo ---");
        Parent anotherChild = new Child();
        // Static method - called based on reference type (Parent)
        Parent.staticMethod();  // Warning: static method should be called from class
        // Instance method - called based on object type (Child)
        anotherChild.instanceMethod();
    }
}