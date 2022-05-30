package mmc.lab;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class lab054LinkedList {

    public static void main(String[] args) {
        LinkedList<String> gidilecekYerler = new LinkedList<String>();

        /*gidilecekYerler.add("Postane");
        gidilecekYerler.add("Market");
        gidilecekYerler.add("Okul");
        gidilecekYerler.add("Kutuphane");
        gidilecekYerler.add("Spor Salonu");
        gidilecekYerler.add("Ev");

        listeyiBastir(gidilecekYerler);

        System.out.println("-----------");*/

        //gidilecekYerler.add(4,"AVM");
        //gidilecekYerler.remove(3);




        siraliEkle(gidilecekYerler,"Postane");
        siraliEkle(gidilecekYerler,"Market");
        siraliEkle(gidilecekYerler,"Ev");
        listeyiBastir(gidilecekYerler);

    }

    public static void listeyiBastir(LinkedList<String> gidilecekYerler) {
        /*for (String s : gidilecekYerler) {
            System.out.println(s);
        }*/

        ListIterator<String> iterator = gidilecekYerler.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void siraliEkle(LinkedList<String> gidilecekYerler, String yeni) {
        ListIterator<String> iterator = gidilecekYerler.listIterator();

        while (iterator.hasNext()) {
            int karsilastir = iterator.next().compareTo(yeni);

            if (karsilastir == 0) {
                // Iki deger esittir
                System.out.println("Listenizde bu eleman zaten mevcuttur");
                return;
            } else if (karsilastir < 0) {
                // Yeni deger iterator den.next den daha buyuk

            } else if (karsilastir > 0){
                iterator.previous();
                iterator.add(yeni);
                return;
            }
        }

        iterator.add(yeni);
    }

    public static void ornekArraylist() {
        ArrayList<String> diller = new ArrayList<String>();

        diller.add("Java");
        diller.add("Python");
        diller.add("C#");
        diller.add("Kotlin");

        /*for (int i=0;i<diller.size();i++){
            System.out.println(diller.get(i));
        }*/


        diller.add(1, "C++");

        for (String s : diller) {
            System.out.println(s);
        }
    }
}
