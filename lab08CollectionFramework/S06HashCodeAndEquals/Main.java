package lab08CollectionFramework.S06HashCodeAndEquals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Player> hashSet = new HashSet<Player>();

        Player player1 = new Player("Tolga",1);
        Player player2 = new Player("Mehmet",10);
        Player player3 = new Player("Emre",6);
        Player player4 = new Player("Tolga",1);

        hashSet.add(player1);
        hashSet.add(player2);
        hashSet.add(player3);
        hashSet.add(player4);

        for (Player p : hashSet){
            System.out.println(p);
        }
    }
}

class Player{
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (id != player.id) return false;
        return isim.equals(player.isim);
    }

    @Override
    public int hashCode() {
        int result = isim.hashCode();
        result = 31 * result + id;
        return result;
    }
}
