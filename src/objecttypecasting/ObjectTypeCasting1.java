package objecttypecasting;

public class ObjectTypeCasting1 {

    // Base classes
    static class Base1 {
        void displayBase1() {
            System.out.println("Inside Base1 class");
        }
    }
    
    static class Base2 {
        void displayBase2() {
            System.out.println("Inside Base2 class");
        }
    }

    // Derived classes extending Base1
    static class Der1 extends Base1 {
        void displayDer1() {
            System.out.println("Inside Der1 class, extending Base1");
        }
    }

    static class Der2 extends Base1 {
        void displayDer2() {
            System.out.println("Inside Der2 class, extending Base1");
        }
    }

    // Derived classes extending Base2
    static class Der3 extends Base2 {
        void displayDer3() {
            System.out.println("Inside Der3 class, extending Base2");
        }
    }

    static class Der4 extends Base2 {
        void displayDer4() {
            System.out.println("Inside Der4 class, extending Base2");
        }
    }

    // Main class to test object type casting
    public static void main(String[] args) {
        // Upcasting: Creating an instance of Der4 and assigning it to a Base2 reference
        Base2 b = new Der4(); // Upcasting
        b.displayBase2(); // Accessing method from Base2 through upcasted reference

        // Downcasting: Ensure type safety with instanceof
        if (b instanceof Der4) {
            Der4 d = (Der4) b; // Safe downcast to Der4
            d.displayDer4(); // Now able to call Der4-specific method
        } else {
            System.out.println("b is not an instance of Der4.");
        }

        // Safe casting using instanceof with Der3
        if (b instanceof Der3) {
            Der3 d3 = (Der3) b; // Would throw ClassCastException if attempted
            d3.displayDer3();
        } else {
            System.out.println("b is not an instance of Der3.");
        }
    }
}
