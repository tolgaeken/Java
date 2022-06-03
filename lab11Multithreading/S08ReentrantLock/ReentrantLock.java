package lab11Multithreading.S08ReentrantLock;

public class ReentrantLock {
    private int say = 20;

    public void arttir() {
        for (int i = 0; i < 10000; i++) {
            say++;
        }
    }

    public void thread1Fonksiyonu() {
        arttir();
    }

    public void thread2Fonksiyonu() {
        arttir();
    }

    public void threadOver() {
        System.out.println("Say degiskeninin degeri : " + say);
    }
}
