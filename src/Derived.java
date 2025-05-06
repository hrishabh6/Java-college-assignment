package src;

class Base {
    Base() {
        System.out.println("Base class constructor");
    }
}

class Derived extends Base {
    Derived() {
        super();
        System.out.println("Derived class constructor");
    }

    public static void main(String[] args) {
        Derived d = new Derived();
    }
}
