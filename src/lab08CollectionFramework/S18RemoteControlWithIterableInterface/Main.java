package lab08CollectionFramework.S18RemoteControlWithIterableInterface;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kumanda programina hosgeldiniz");
        Scanner scanner = new Scanner(System.in);
        String islemler = "Islemler\n1 - Kanallari goster\n2 - Kanal ekle\n3 - Kanal sil\n4 - Kanal sayisi ogren\n5 - Cikis";
        Kumanda kumanda = new Kumanda();

        while (true) {
            System.out.println(islemler);
            System.out.print("Islemi giriniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("5")) {
                System.out.println("Programdan cikiliyor...");
                break;
            } else if (islem.equals("1")) {
                kanallariGoster(kumanda);
            } else if (islem.equals("2")) {
                System.out.print("Eklenecek kanal : ");
                String kanalIsmi = scanner.nextLine();
                kumanda.kanalEkle(kanalIsmi);
            } else if (islem.equals("3")) {
                System.out.print("Silinecek kanal : ");
                String kanalIsmi = scanner.nextLine();
                kumanda.kanalSil(kanalIsmi);
            } else if (islem.equals("4")) {
                System.out.println("Kanal sayisi : " + kumanda.kanalSayisi());
            } else {
                System.out.println("Gecersiz islem");
            }

        }
    }

    public static void kanallariGoster(Kumanda kumanda) {
        if (kumanda.kanalSayisi() == 0) {
            System.out.println("Su anda hicbir kanal bulunmamaktadir");
        } else {
            for (String kanal : kumanda) {
                System.out.println("Kanal : " + kanal);
            }
        }
    }
}
