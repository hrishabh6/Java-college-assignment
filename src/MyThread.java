package src;

public class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " - " + i);
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread A");
        MyThread t2 = new MyThread("Thread B");
        MyThread t3 = new MyThread("Thread C");

        t1.start();
        t2.start();
        t3.start();
    }
}

