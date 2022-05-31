package mmc.lab.lab055Travel;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> sehirler = new LinkedList<String>();

        sehirler.add("Ankara");
        sehirler.add("Eskisehir");
        sehirler.add("Bolu");

        sehirleriTurla(sehirler);

    }

    public static void sehirleriTurla(LinkedList<String> sehirler) {
        ListIterator<String> iterator = sehirler.listIterator();
        int islem;

        islemleriBastir();

        Scanner scanner = new Scanner(System.in);
        if (!iterator.hasNext()) {
            System.out.println("herhangi bir sehir bulunmuyor");
        }

        boolean cikis = false;
        boolean ileri = true;


        while (!cikis) {
            System.out.println("Bir islem seciniz");
            islem = scanner.nextInt();

            switch (islem) {
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    if (!ileri){
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Sehre gidiliyor : " + iterator.next());
                    } else {
                        System.out.println("Gidilecek sehir kalmadi");
                        ileri = true;
                    }
                    break;
                case 2:
                    if (ileri) {
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri = false;

                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("Sehre gidiliyor : " + iterator.previous());
                    } else {
                        System.out.println("Sehir turu basladi");
                    }
                    break;
                case 3:
                    cikis = true;
                    System.out.println("Uygulamadan cikiliyor");
                    break;
            }
        }
    }


    public static void islemleriBastir() {
        System.out.println("0 - Islemleri goruntule");
        System.out.println("1 - Bir sonraki sehre git");
        System.out.println("2 - Bir onceki sehre git");
        System.out.println("3 - Uygulamadan cik");
    }
}
