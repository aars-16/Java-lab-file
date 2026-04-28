class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class Program10_JoinThreads {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        try {
            t1.start();
            t1.join();   // wait for t1 to finish

            t2.start();
            t2.join();   // wait for t2

            t3.start();
            t3.join();   // wait for t3

        } catch (Exception e) {}

        System.out.println("Threads executed in sequence using join()");
    }
}