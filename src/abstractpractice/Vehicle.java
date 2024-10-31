package abstractpractice;

abstract public class Vehicle {
    public abstract int getNuOfWheels();
}

class Bus extends Vehicle {
    public int getNuOfWheels() {
        return 6;
    }
}

class Auto extends Vehicle {
    public int getNuOfWheels() {
        return 3;
    }
}

class Test4 {
    public static void main(String[] args) {
        Bus b = new Bus();
        System.out.println(b.getNuOfWheels());  // Output: 6

        Auto a = new Auto();
        System.out.println(a.getNuOfWheels());  // Output: 3
    }
}
