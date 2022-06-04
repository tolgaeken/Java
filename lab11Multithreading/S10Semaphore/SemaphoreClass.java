package lab11Multithreading.S10Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreClass {

    private Semaphore sem = new Semaphore(3);

    public void threadFonksiyonu (int id){
        try {
            sem.acquire();
        } catch (InterruptedException e) {
        }

        System.out.println("Thread basliyor - ID : " +  id);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        System.out.println("Thread cikiyor - ID : " + id);

        sem.release();

    }

}
