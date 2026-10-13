package core_java.concurrency;

import java.util.concurrent.*;

public class ExecutorPlayground {
    static void main(String[] args) throws InterruptedException, ExecutionException {
        try (ExecutorService executor = Executors.newFixedThreadPool(3)) {
            for (int i = 1; i <= 6; i++) {
                final int taskId = i;
                executor.submit(() -> {
                    String threadName = Thread.currentThread().getName();
                    System.out.println("Task " + taskId + " is running on " + threadName);
                });
            }
            executor.shutdown();
        }

        try (ExecutorService executor = Executors.newFixedThreadPool(2)) {
            executor.execute(() -> System.out.println("Task running via execute()"));
            Future<Integer> future = executor.submit(() -> {
                Thread.sleep(10000);
                System.out.println("Task running via submit()");
                return 42;
            });
            Integer result = future.get();
            System.out.println("result = " + result);
            executor.shutdown();
        } catch (ExecutionException e) {
            Thread.currentThread().interrupt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        CompletableFuture<String> booking = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Booked reservation 1024... " + Thread.currentThread().getName());
            return "1024";
        });
        CompletableFuture<String> confirmation = booking.thenApply(reservation -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Reservation " + reservation + " Confirmation 1048 " + Thread.currentThread().getName());
            return "Confirmation 1048";
        });
        System.out.println(confirmation.get() + " " + Thread.currentThread().getName());
    }
}
