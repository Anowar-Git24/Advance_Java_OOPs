package overidingmethod;

public class OverRidingMethodCase1 {

    // Parent class P
    class P {
        public void Property() {
            System.out.println("Cash + Gold + Land");
        }

        public void Marry() {
            System.out.println("Rahim/Rahima");
        }
    }

    // Child class C extends parent class P
    class C extends P {
        @Override
        public void Marry() {
            System.out.println("Katrina");
        }
    }

    // Test class to demonstrate method overriding
    public class Test {
        public static void main(String[] args) {
            // Parent reference holding a parent object
            P p = new OverRidingMethodCase1().new P();
            p.Marry();  // Output: Rahim/Rahima

            // Child reference holding a child object
            C c = new OverRidingMethodCase1().new C();
            c.Marry();  // Output: Katrina

            // Parent reference holding a child object (polymorphism)
            P p1 = new OverRidingMethodCase1().new C();
            p1.Marry();  // Output: Katrina (runtime polymorphism)
        }
    }
}
