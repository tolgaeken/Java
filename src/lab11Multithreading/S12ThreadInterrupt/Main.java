package lab11Multithreading.S12ThreadInterrupt;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<Integer>();



        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread calisiyor");

                for (int i = 0;i<10000000;i++){
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("Kesintiye ugradi");
                        return;
                    }

                    list.add(i);
                }

                System.out.println("Thread kesintiye ugramadan isini bitirdi");

                /*for (int i = 1; i <= 10; i++) {
                    System.out.println("Thread yaziyor : " + i);
                    try {
                        Thread.sleep(1000);
                        System.out.println("Thread : " + i + ". saniyesinde");
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupt edildi");
                    }
                }
                System.out.println("Thread kesintiye ugramadan isini bitirdi");*/
            }
        });

        t.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t.interrupt();
    }
}
