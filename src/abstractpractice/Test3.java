package abstractpractice;

// Base abstract class Test3
abstract public class Test3 {
    public abstract void m1();
    public abstract void m2();
}

// Subclass of Test3 that partially implements m1
abstract class SubTest3 extends Test3 {
    @Override
    public void m1() {
        System.out.println("m1 implemented in SubTest3");
    }
}

// Subclass of Test3 that partially implements m2
abstract class SubSubTest3 extends Test3 {
    @Override
    public void m2() {
        System.out.println("m2 implemented in SubSubTest3");
    }
}

// Concrete class that implements both methods
class FinalTest3 extends SubTest3 {
    @Override
    public void m2() {
        System.out.println("m2 implemented in FinalTest3");
    }
    
    public static void main(String[] args) {
        FinalTest3 obj = new FinalTest3();
        obj.m1(); // Calls the m1 method from SubTest3
        obj.m2(); // Calls the m2 method from FinalTest3
    }
}
