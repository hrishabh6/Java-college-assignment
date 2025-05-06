package src;

abstract class Shape {
    Shape() {
        System.out.println("Shape constructor called");
    }

    final void showType() {
        System.out.println("This is a shape");
    }

    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.showType();
        c.draw();
    }
}
