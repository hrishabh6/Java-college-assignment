package src;

class Address {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}

public class Student {
    int id;
    String name;
    Address address;

    Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state);
    }

    public static void main(String[] args) {
        Address addr = new Address("Delhi", "Delhi");
        Student s = new Student(1, "Aman", addr);
        s.display();
    }
}

