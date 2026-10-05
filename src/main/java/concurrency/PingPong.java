package concurrency;

import java.util.concurrent.Semaphore;

public class PingPong {
    private static final Semaphore pingSemaphore = new Semaphore(1);
    private static final Semaphore pongSemaphore = new Semaphore(0);

    static void main(String[] args) {
        Thread pingThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    pingSemaphore.acquire();
                    System.out.println("ping");
                    pongSemaphore.release();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread pongThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    pongSemaphore.acquire();
                    System.out.println("pong");
                    pingSemaphore.release();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        pingThread.start();
        pongThread.start();
    }
}
