package src;

class StaticDemo {
    static int count;

    static {
        count = 10;
        System.out.println("Static block executed");
    }

    static void showCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        StaticDemo.showCount();
        count += 5;
        StaticDemo.showCount();
    }
}
