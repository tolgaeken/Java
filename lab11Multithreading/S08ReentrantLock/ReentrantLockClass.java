package lab11Multithreading.S08ReentrantLock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockClass {
    private int say = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void arttir() {
        for (int i = 0; i < 10000; i++) {
            say++;
        }
    }

    public void thread1Fonksiyonu() {
        lock.lock();
        System.out.println("Thread1 calisiyor");
        System.out.println("Thread1 uyandirilmayi bekliyor");
        try {
            condition.await();
        } catch (InterruptedException e) {
        }
        System.out.println("Thread1 uyandirildi ve islemine devam ediyor");
        arttir();
        lock.unlock();

    }

    public void thread2Fonksiyonu() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        Scanner scanner = new Scanner(System.in);
        lock.lock();
        System.out.println("Thread2 calisiyor");
        arttir();
        System.out.println("Devam etmek icin bir tusa basin");
        scanner.nextLine();
        condition.signal();
        System.out.println("Thread1 i uyandirdim. Ben gidiyorum");
        lock.unlock();

    }

    public void threadOver() {
        System.out.println("Say degiskeninin degeri : " + say);
    }
}
