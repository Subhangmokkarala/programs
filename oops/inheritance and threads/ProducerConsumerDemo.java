import java.util.LinkedList;

class Buffer {
    private LinkedList<Integer> list = new LinkedList<>();
    private int capacity = 2;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (list.size() == capacity)
                    wait();

                System.out.println("Producer produced: " + value);
                list.add(value++);
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (list.isEmpty())
                    wait();

                int value = list.removeFirst();
                System.out.println("Consumer consumed: " + value);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producerThread = new Thread(() -> {
            try {
                buffer.produce();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                buffer.consume();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
