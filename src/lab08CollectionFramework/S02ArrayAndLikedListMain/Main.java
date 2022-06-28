package lab08CollectionFramework.S02ArrayAndLikedListMain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();


        zamanHesapla("LinkedList", linkedList);
        zamanHesapla("ArrayList", arrayList);
    }

    public static void zamanHesapla(String veriTipi, List<Integer> list) {

        long baslangic;
        long bitis;

        baslangic = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
            //list.add(0,i);
        }
        bitis = System.currentTimeMillis();

        System.out.println(veriTipi + " bekleme suresi : " + (bitis-baslangic) + " ms");
    }
}
