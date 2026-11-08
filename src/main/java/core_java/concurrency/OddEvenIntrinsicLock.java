package core_java.concurrency;

/*
 * synchronized(this) - Intrinsic lock
 * ReentrantLock
 * ReentrantReadWriteLock
 * StampedLock
 */
public class OddEvenIntrinsicLock {
    private static final int N = 10;
    private static int counter;

    public void printOdd() {
        synchronized (this) {
            while (counter < N) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }

                System.out.println(Thread.currentThread().getName() + " : " + counter);
                counter++;
                notify();
            }
        }
    }

    public void printEven() {
        synchronized (this) {
            while (counter < N) {
                while (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }

                System.out.println(Thread.currentThread().getName() + " : " + counter);
                counter++;
                notify();
            }
        }
    }

    static void main(String[] args) {
        OddEvenIntrinsicLock printer = new OddEvenIntrinsicLock();

        Thread oddPrinterThread = new Thread(printer::printOdd);
        Thread evenPrinterThread = new Thread(printer::printEven);

        oddPrinterThread.start();
        evenPrinterThread.start();
    }
}
