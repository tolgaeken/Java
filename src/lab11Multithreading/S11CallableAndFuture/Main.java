package lab11Multithreading.S11CallableAndFuture;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        /*executor.submit(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                System.out.println("Thread calisiyor");
                int sure = random.nextInt(1000) + 2000;

                try {
                    Thread.sleep(sure);
                } catch (InterruptedException e) {
                }

                System.out.println("Thread cikiyor");
            }
        });*/


        Future<?> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                System.out.println("Thread calisiyor");
                int sure = random.nextInt(1000) + 2000;

                if (sure>2500){
                    throw new IOException("Thread cok uzun sure uyudu");
                }

                try {
                    Thread.sleep(sure);
                } catch (InterruptedException e) {
                }

                System.out.println("Thread cikiyor");

                return sure;
            }
        });

        executor.shutdown();
        //executor.awaitTermination();

        try {
            System.out.println("Donen deger : " + future.get());
        } catch (InterruptedException e) {
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
