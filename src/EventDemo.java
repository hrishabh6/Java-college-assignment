package src;

import java.util.Scanner;

public class EventDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 to trigger an event or 0 to exit.");

        while (true) {
            int input = sc.nextInt();

            if (input == 1) {
                triggerEvent();
            } else if (input == 0) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid input, please press 1 or 0.");
            }
        }

        sc.close();
    }

    // Simulate an event being triggered
    public static void triggerEvent() {
        System.out.println("Event triggered: Hello, the event was successfully handled!");
    }
}
