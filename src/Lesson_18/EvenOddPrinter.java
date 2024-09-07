package Lesson_18;

public class EvenOddPrinter {
    private static final int MAX = 10000;
    private int counter = 1;

    public static void main(String[] args) {
        EvenOddPrinter printer = new EvenOddPrinter();

        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printEven();
            }
        });

        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printOdd();
            }
        });

        evenThread.start();
        oddThread.start();
    }

    public synchronized void printEven() {
        while (counter <= MAX) {
            while (counter % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (counter <= MAX) {
                System.out.println(counter);
                counter++;
                notify();
            }
        }
    }

    public synchronized void printOdd() {
        while (counter <= MAX) {
            while (counter % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (counter <= MAX) {
                System.out.println(counter);
                counter++;
                notify();
            }
        }
    }
}

