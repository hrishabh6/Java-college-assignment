package src;

class NameThread implements Runnable {
    public void run() {
        System.out.println("YourName");
    }
}

class HelloThread implements Runnable {
    public void run() {
        System.out.println("Hello Java");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NameThread());
        Thread t2 = new Thread(new HelloThread());

        t1.start();
        t2.start();
    }
}
