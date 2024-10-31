package inheritance;

// Demonstrating parent-child inheritance and polymorphism
public class ParentsChildRelation {

    // Parent class P
    class P {
        public void m1() {
            System.out.println("Parent");
        }
    }

    // Child class C extending P
    class C extends P {
        public void m2() {
            System.out.println("Child");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of Parent class P
        ParentsChildRelation relation = new ParentsChildRelation();
        P p = relation.new P(); // Since P is an inner class, instantiate it via outer class
        p.m1(); // This will call m1() from the parent class

        // Creating an instance of Child class C
        C c = relation.new C();
        c.m1(); // Inherited from parent class P
        c.m2(); // Defined in child class C

        // Polymorphism: Parent reference, child object
        P p2 = relation.new C(); // Parent reference, child object
        p2.m1(); // Calls m1() from parent class P
        // p2.m2(); // Error: Cannot call m2() because reference type is P
    }
}
