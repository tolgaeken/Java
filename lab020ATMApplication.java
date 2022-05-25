package mmc.lab;

import java.util.Scanner;

public class lab020ATMApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1 - Bakiye Ogrenmme\n2 - ParaCekme\n3 - Para Yatirma\n4 - Cikis";
        System.out.println("*********************");
        System.out.println(islemler);
        System.out.println("*********************");

        while (true) {
            System.out.println("Islem seciniz");
            String islem = scanner.nextLine();
            if (islem.equals("4")) {
                System.out.println("Programdan cikiliyor");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiye : " + bakiye);
            } else if (islem.equals("2")) {
                System.out.print("Cekmek istediginiz tutari giriniz : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                if (bakiye - tutar < 0) {
                    System.out.println("Yeterli bakiye mevcut degildir");
                    System.out.println("Bakiyeniz : " + bakiye);
                } else {
                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz : " + bakiye);
                }
            } else if (islem.equals("3")) {
                System.out.print("Yatirmak istediginiz tutari giriniz : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz : " + bakiye);
            } else {
                System.out.println("Gecersiz Islem");
            }
        }


    }
}
