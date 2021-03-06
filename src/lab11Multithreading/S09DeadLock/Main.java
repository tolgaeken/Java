package lab11Multithreading.S09DeadLock;

public class Main {
    public static void main(String[] args) {
        DeadLockClass deadlock  = new DeadLockClass();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.thread1Fonksiyonu();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.thread2Fonksiyonu();
            }
        });
        thread1.start();

        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
        }

        deadlock.threadOver();
    }
}
