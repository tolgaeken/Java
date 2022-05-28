package mmc.lab.lab051Singer;

import java.util.Scanner;

public class Test {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\t Sarkici uygulamasina hosgeldiniz");
        islemleriBastir();

        boolean cikis = false;
        int islem;

        while (!cikis) {
            System.out.println("Bir islem seciniz : ");
            islem = scanner.nextInt();
            scanner.nextLine();

            switch (islem) {
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    goruntule();
                    break;
                case 2:
                    ekle();
                    break;
                case 3:
                    guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan cikiliyor");
                    break;
            }
        }
    }

    public static void islemleriBastir() {
        System.out.println("\t0 - Islemleri goruntule");
        System.out.println("\t1 - Sarkicileri goruntule");
        System.out.println("\t2 - Sarkici ekle");
        System.out.println("\t3 - Sarkici guncelle");
        System.out.println("\t4 - Sarkici sil");
        System.out.println("\t5 - Sarkici ara");
        System.out.println("\t6 - Uygulamadan cik");
    }

    public static void goruntule() {
        sarkicilar.sarkicilariBastir();
    }

    public static void ekle() {
        System.out.print("Eklemek istediginiz sarkici : ");
        String isim = scanner.nextLine();

        sarkicilar.sarkiciEkle(isim);
    }

    public static void guncelle() {
        System.out.print("Guncellemek istediginiz pozisyon : ");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();

        String yeniIsim = scanner.nextLine();
        sarkicilar.sarkiciGuncelle(yeniIsim, pozisyon - 1);
    }

    public static void sil() {
        System.out.print("Silmek istediginiz pozisyon : ");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        sarkicilar.sarkiciSil(pozisyon);
    }

    public static void ara() {
        System.out.println("Aramak istediginiz sarkici : ");
        String sarkiciIsmi = scanner.nextLine();

        sarkicilar.sarkiciAra(sarkiciIsmi);
    }
}
