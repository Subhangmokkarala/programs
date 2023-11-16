class MyThread extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().threadId() + " is running.");
    }
}

public class JoinExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();

        try {
            thread1.join(); // Wait for thread1 to complete
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        thread2.start();
    }
}
