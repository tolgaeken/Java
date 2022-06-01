package lab08CollectionFramework.S09CollectionSortAndComparatorInterface;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Php");
        list.add("Go");

        Collections.sort(list, new BuyuktenKucugeString());

        for (String s : list) {
            System.out.println(s);
        }*/

        List<Player> listPLayer = new ArrayList<Player>();
        listPLayer.add(new Player("Tolga", 5));
        listPLayer.add(new Player("Emre", 1));
        listPLayer.add(new Player("Oguz", 10));
        listPLayer.add(new Player("Yusuf", 4));
        //Collections.sort(listPLayer,new KucuktenBuyugePlayer());
        //Collections.sort(listPLayer,new BuyuktenKucugePlayer());
        Collections.sort(listPLayer, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return -o1.getIsim().compareTo(o2.getIsim());
            }
        });

        for (Player p : listPLayer) {
            System.out.println(p);
        }

    }
}

class BuyuktenKucugeString implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}

class Player {
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
    public String toString() {
        return "||| ID : " + id + " - Isim : " + isim + " |||";
    }
}

class KucuktenBuyugePlayer implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() < o2.getId()) {
            return -1;
        } else if (o1.getId() > o2.getId()) {
            return 15;
        }
        return 0;
    }
}

class BuyuktenKucugePlayer implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() < o2.getId()) {
            return 1;
        } else if (o1.getId() > o2.getId()) {
            return -1000;
        }
        return 0;
    }
}

class KucuktenBuyugeStringPlayer implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getIsim().compareTo(o2.getIsim());
    }
}
