// Without Thread
class WithoutThread {
    void print() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

// Using Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

// Using Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class Program9_Threads {
    public static void main(String[] args) {

        System.out.println("Without Thread:");
        WithoutThread obj = new WithoutThread();
        obj.print();
        obj.print();
        obj.print();

        System.out.println("\nUsing Thread class:");
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {}

        System.out.println("\nUsing Runnable:");
        Thread r1 = new Thread(new MyRunnable());
        Thread r2 = new Thread(new MyRunnable());
        Thread r3 = new Thread(new MyRunnable());

        r1.start();
        r2.start();
        r3.start();
    }
}