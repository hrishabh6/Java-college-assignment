package src;

interface A {
    int value = 10;
    void showA();
}

interface B {
    int value = 20;
    void showB();
}

class InterfaceDemo implements A, B {
    public void showA() {
        System.out.println("A's value: " + A.value);
    }

    public void showB() {
        System.out.println("B's value: " + B.value);
    }

    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.showA();
        obj.showB();
    }
}

