package concurrency;

import java.util.UUID;
import java.util.concurrent.Semaphore;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ProducerConsumer {
    private static String temp;
    private static final Semaphore supplierSemaphore = new Semaphore(1);
    private static final Semaphore producerSemaphore = new Semaphore(0);

    static void main(String[] args) {
        Thread supplierThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    supplierSemaphore.acquire();
                    Supplier<String> producer = () -> UUID.randomUUID().toString();
                    temp = producer.get();
                    System.out.println("UUID from producer: " + temp);
                    producerSemaphore.release();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    producerSemaphore.acquire();
                    Consumer<String> consumer = str -> System.out.println("UUID from consumer: " + str);
                    consumer.accept(temp);
                    supplierSemaphore.release();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        supplierThread.start();
        consumerThread.start();
    }
}
