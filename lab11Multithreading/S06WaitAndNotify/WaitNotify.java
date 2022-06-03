package lab11Multithreading.S06WaitAndNotify;

import java.util.Scanner;


public class WaitNotify {
    private Object lock = new Object();

    public void thread1Fonksiyonu() {

        synchronized(lock) {
            System.out.println("Thread 1 calisiyor....");
            System.out.println("Thread 1 Thread2'nin kendisini uyandirmasini bekliyor...");

            try {
                lock.wait();
            } catch (InterruptedException ex) {
            }

            System.out.println("Thread 1 uyandi. Devam Ediyor...");

        }

    }
    public void thread2Fonksiyonu() {
        Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
        }
        synchronized(lock) {
            System.out.println("Thread 2 calisiyor....");

            System.out.println("Devam etmek için bir tusa basin....");

            scanner.nextLine();


            lock.notify();
            System.out.println("Uyandirdim.Ben gidiyorum ama 2 saniye bekle...");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }

        }




    }
}
