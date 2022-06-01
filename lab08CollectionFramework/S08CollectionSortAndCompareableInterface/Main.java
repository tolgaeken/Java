package lab08CollectionFramework.S08CollectionSortAndCompareableInterface;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*List<String> listString = new ArrayList<String>();

        listString.add("Java");
        listString.add("C++");
        listString.add("Python");
        listString.add("Php");
        listString.add("Go");

        Collections.sort(listString);

        for (String s : listString){
            System.out.println(s);
        }*/

        List<Player> listPLayer = new ArrayList<Player>();
        listPLayer.add(new Player("Tolga",5));
        listPLayer.add(new Player("Emre",1));
        listPLayer.add(new Player("Oguz",10));
        listPLayer.add(new Player("Yusuf",4));

        /*Player p1 = new Player("Tolga",5);
        Player p2 = new Player("Yusuf",4);
        System.out.println(p1.compareTo(p2));*/

        /*Collections.sort(listPLayer);
        for (Player p : listPLayer){
            System.out.println(p);
        }*/

        Set<Player> treeSet = new TreeSet<Player>();

        treeSet.add(new Player("Tolga",5));
        treeSet.add(new Player("Emre",1));
        treeSet.add(new Player("Oguz",10));
        treeSet.add(new Player("Yusuf",4));

        for(Player p: treeSet){
            System.out.println(p);
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

    @Override
    public String toString() {
        return "||| ID : " + id + " - Isim : " + isim + " |||";
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
}
