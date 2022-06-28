package lab08CollectionFramework.S13QueueApp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ramazan pidesi uygulamasi");
        Random random = new Random();
        Queue<String> pideKuyrugu = new LinkedList<String>();

        pideKuyrugu.offer("Tolga");
        pideKuyrugu.offer("Hasan");
        pideKuyrugu.offer("Okan");
        pideKuyrugu.offer("Ayse");
        pideKuyrugu.offer("Merve");
        pideKuyrugu.offer("Ezgi");
        pideKuyrugu.offer("Gizem");
        pideKuyrugu.offer("Mehmet");
        pideKuyrugu.offer("Oguz");
        pideKuyrugu.offer("Azer");

        int pideSayisi = 1 + random.nextInt(10);

        System.out.println("Pideler cikiyor");
        System.out.println("Cikan pide sayisi : " + pideSayisi);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        while (pideSayisi!=0){
            System.out.println(pideKuyrugu.poll() + " pideyi aldi");
            pideSayisi--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }
        System.out.println("Pide kalmadi");






    }
}
