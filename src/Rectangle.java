package src;

import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    void Input() {
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        breadth = sc.nextInt();
    }

    void Output() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }

    int CalcArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.Input();
        r.Output();
        int area = r.CalcArea();
        System.out.println("Area: " + area);
    }
}
