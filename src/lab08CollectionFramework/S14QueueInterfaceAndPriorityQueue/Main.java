package lab08CollectionFramework.S14QueueInterfaceAndPriorityQueue;

import java.util.*;

public class Main {

     /*
    Queue Interface ve PriorityQueue Sınıfı

    PriorityQueue normal Queue mantığı gibi davranmaz. Elemanlar öncelik sıralarına göre yüksek öncelik kazanıp
    (
    Integerlarda en yüksek öncelik en küçük sayıda, en düşük öncelik  en büyük sayıdadır.
    Stringlerde en yüksek öncelik alfabetik olarak sözlükte en önce gelen stringte,
    en düşük öncelik  alfabetik olarak sözlükte en son gelen stringtedir.

    )

    kuyrukta önlere geçer (Tıpkı Hastanedeki Acil Servisler Gibi).

    add veya offer() metodları --------> Kuyruğa eleman ekler.(Önceden gördüğümüz özellikleri taşırlar.)
    clear() metodu --------> Kuyruğu Temizler.
    contains(Object o) ------> o objesi kuyruğun içindeyse true, değilse false döner.
    peek() ------> Kuyruğun başındaki elemanı döner.Eğer kuyruk boşsa null referans döner.
    poll() -----> Kuyruğun başındaki elemanı çıkartır ve değer olarak döner. Eğer kuyruk boşsa null referans döner.
    size()------> Kuyruğun içindeki eleman sayısını döner.
    */

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