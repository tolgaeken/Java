package lab08CollectionFramework.S15EmergencyAppWithPriorityQueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Hasta> acilServis = new PriorityQueue<Hasta>();

        acilServis.offer(new Hasta("Tolga Bey", "yanik"));
        acilServis.offer(new Hasta("Okan Bey", "bas agrisi"));
        acilServis.offer(new Hasta("Elif Hanim", "apandisit"));
        acilServis.offer(new Hasta("Oguz Bey", "yanik"));
        acilServis.offer(new Hasta("Merve Hanim", "yanik"));
        acilServis.offer(new Hasta("Gizem Hanim", "apandisit"));

        int i = 1;
        while (!acilServis.isEmpty()){
            System.out.println("************");
            System.out.println(i + ". sirada");
            System.out.println(acilServis.poll());
            System.out.println("************");
            i++;
        }

    }
}
