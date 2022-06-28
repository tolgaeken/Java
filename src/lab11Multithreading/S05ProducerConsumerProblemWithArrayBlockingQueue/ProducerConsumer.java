package lab11Multithreading.S05ProducerConsumerProblemWithArrayBlockingQueue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumer {
    Random random = new Random();

    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);


    public void produce() {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }



            try {
                Integer value =  random.nextInt(100);

                queue.put(value);

                System.out.println("Producer Uretiyor : " + value);
            } catch (InterruptedException ex) {
            }

        }

    }
    public void consume(){

        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
            }

            try {
                Integer value =  queue.take();
                System.out.println("Consumer tuketiyor : " + value);

                System.out.println("Queue Size : " + queue.size());

            } catch (InterruptedException ex) {
            }





        }
    }
}
