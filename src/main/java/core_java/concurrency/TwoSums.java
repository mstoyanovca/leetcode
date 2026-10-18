package core_java.concurrency;

import java.util.concurrent.CompletableFuture;

public class TwoSums {
    static void main(String[] args) {
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {10, 20, 30};

        CompletableFuture<Integer> f0 = CompletableFuture.supplyAsync(() -> {
            int sum = 0;
            for (int i : array2) sum += i;
            return sum;
        });
        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> {
            int sum = 0;
            for (int i : array3) sum += i;
            return sum;
        });
        CompletableFuture<Integer> result = f0.thenCombine(f1, (sum0, sum1) -> sum0 * sum1);
        System.out.println(result.join());
    }
}
