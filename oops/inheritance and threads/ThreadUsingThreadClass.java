class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

public class ThreadUsingThreadClass {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
