package src;

class AreaCalc {
    int area(int side) {
        return side * side;
    }

    int area(int l, int b) {
        return l * b;
    }

    double area(double b, double h) {
        return 0.5 * b * h;
    }

    public static void main(String[] args) {
        AreaCalc a = new AreaCalc();
        System.out.println("Square Area: " + a.area(5));
        System.out.println("src.Rectangle Area: " + a.area(4, 6));
        System.out.println("Triangle Area: " + a.area(5.0, 3.0));
    }
}
