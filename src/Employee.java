package src;

import java.util.Scanner;

class Employee {
    String name;
    int age;
    String address;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter Address: ");
        address = sc.nextLine();
    }

    void showdata() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getdata();
        emp.showdata();
    }
}
