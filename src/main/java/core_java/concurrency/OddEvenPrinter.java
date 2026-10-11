package core_java.concurrency;

// synchronized(this) - Intrinsic lock
// ReentrantLock
// ReentrantReadWriteLock
// StampedLock
public class OddEvenPrinter {
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

                System.out.print(Thread.currentThread().getName() + " : " + counter + "\n");
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

                System.out.print(Thread.currentThread().getName() + " : " + counter + "\n");
                counter++;
                notify();
            }
        }
    }

    static void main(String[] args) {
        OddEvenPrinter printer = new OddEvenPrinter();

        Thread oddPrinterThread = new Thread(printer::printOdd);
        Thread evenPrinterThread = new Thread(printer::printEven);

        oddPrinterThread.start();
        evenPrinterThread.start();
    }
}
