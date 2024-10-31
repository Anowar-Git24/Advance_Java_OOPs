package abstractpractice;

// Abstract class Test
abstract public class Test {
    public abstract void m1();
}

// Concrete class TestImpl that implements the abstract method from Test
class TestImpl extends Test {
    @Override
    public void m1() {
        System.out.println("Method m1 implemented.");
    }
}