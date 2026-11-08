package core_java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class OddEvenSemaphore {
    static void main(String[] args) {
        Semaphore oddSemaphore = new Semaphore(1);
        Semaphore evenSemaphore = new Semaphore(0);

        try (ExecutorService executor = Executors.newFixedThreadPool(2)) {
            executor.execute(
                    () -> {
                        for (int i = 1; i < 10; i += 2) {
                            try {
                                oddSemaphore.acquire();
                                System.out.println(Thread.currentThread().getName() + ": " + i);
                                evenSemaphore.release();
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
            );

            executor.execute(
                    () -> {
                        for (int i = 2; i <= 10; i += 2) {
                            try {
                                evenSemaphore.acquire();
                                System.out.println(Thread.currentThread().getName() + ": " + i);
                                oddSemaphore.release();
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
            );
        }
    }
}
