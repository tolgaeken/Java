package lab11Multithreading.S01CreateThread.com.tolga.thread3;

public class Main {
    public static void main(String[] args) {
        /*Thread printer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread calisiyor");
                for (int i = 1;i<=10;i++){
                    System.out.println("Yaziyor : " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
            }
        });*/
        //printer1.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread calisiyor");
                for (int i = 1;i<=10;i++){
                    System.out.println("Yaziyor : " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
            }
        }).start();

        System.out.println("MainThread calisiyor");
    }
}
