package tightlyencapsulation;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class A {
    private int x = 10;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class B extends A {
    int y = 20;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class C extends A {
    private int z = 30;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}

class MainClass {
    public static void main(String[] args) {
        // Testing Account class
        Account account = new Account(1000);
        System.out.println("Initial balance: " + account.getBalance());
        account.setBalance(1500);
        System.out.println("Updated balance: " + account.getBalance());

        // Testing inheritance from class A
        B b = new B();
        System.out.println("Value of x in B: " + b.getX());
        System.out.println("Value of y in B: " + b.getY());

        C c = new C();
        System.out.println("Value of x in C: " + c.getX());
        System.out.println("Value of z in C: " + c.getZ());
    }
}
