package src;

class DemoThis {
    int x;
    DemoThis(int x) {
        this.x = x;
    }

    void display() {
        System.out.println("Value of x: " + this.x);
    }

    public static void main(String[] args) {
        DemoThis obj = new DemoThis(10);
        obj.display();
    }
}

