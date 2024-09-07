package Lesson_18;

public class AlternatingWords {
    private static final String[] sentence = "This is a sample sentence for demonstrating alternating threads".split(" ");
    private static int index = 0;

    public static void main(String[] args) {
        Object lock = new Object();

        Runnable printTask = () -> {
            while (true) {
                synchronized (lock) {
                    if (index >= sentence.length) {
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + sentence[index]);
                    index++;
                    lock.notify();
                    try {
                        if (index < sentence.length) {
                            lock.wait();
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        };

        Thread thread1 = new Thread(printTask, "Thread 1");
        Thread thread2 = new Thread(printTask, "Thread 2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

