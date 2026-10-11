package core_java.concurrency;

public class ThreeThreadsPrinter {
    private static int counter = 0;
    private static final int N = 10;
    private static final int THREADS = 3;
    private static final Object lock = new Object();

    static class PrintTask implements Runnable {
        private final int remainder;

        PrintTask(int remainder) {
            this.remainder = remainder;
        }

        @Override
        public void run() {
            while (counter < N) {
                synchronized (lock) {
                    if (counter % THREADS == remainder) {
                        System.out.print(Thread.currentThread().getName() + " : " + counter + "\n");
                        counter++;
                        lock.notifyAll();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        }
    }

    static void main(String[] args) {
        Thread thread0 = new Thread(new PrintTask(0), "printer 0");
        Thread thread1 = new Thread(new PrintTask(1), "printer 1");
        Thread thread2 = new Thread(new PrintTask(2), "printer 2");

        thread0.start();
        thread1.start();
        thread2.start();
    }
}
