package lab08CollectionFramework.S14QueueInterfaceAndPriorityQueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Queue<Integer> queue = new PriorityQueue<Integer>();


        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(100);

        System.out.println("Peek : " + queue.peek());
        System.out.println("Queue contains 10 : " + queue.contains(10));
        while (!queue.isEmpty()){
            System.out.println("Eleman cikariliyor : " + queue.poll());
        }

        System.out.println("****************");
        queue.clear();
        for (Integer i : queue){
            System.out.println(i);
        }*/


        Queue<Player> queue = new PriorityQueue<Player>();
        queue.offer(new Player("Tolga",5));
        queue.offer(new Player("Mhmet",1));
        queue.offer(new Player("Oguz",100));

        while (!queue.isEmpty()){
            System.out.println("Eleman cikariliyor : " + queue.poll());
        }

    }
}

class Player implements Comparable<Player>{
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Player player) {
        if (this.id < player.id){
            return -1;
        } else if (this.id > player.id){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Id : " + this.id + " - Isim : " + this.isim;
    }

}