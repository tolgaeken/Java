package mmc.lab.lab036Exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Idman programina hosgeldiniz");
        String idmanlar = "Gecerli hareketler..\nBurpee\nPushup (Sinav)\nSitup (Mekik)\nSquad";
        System.out.println(idmanlar);
        System.out.println("Bir idman olusuturun");
        System.out.print("Burpee sayisi : ");
        int burpee = scanner.nextInt();
        System.out.print("Pushup sayisi : ");
        int pushup = scanner.nextInt();
        System.out.print("Situp sayisi : ");
        int situp = scanner.nextInt();
        System.out.print("Squad sayisi : ");
        int squad = scanner.nextInt();
        scanner.nextLine();

        Idman idman = new Idman(burpee, pushup, situp, squad);
        System.out.println("Idman basliyor...");

        while (idman.idmanBitiMi() == false) {
            System.out.print("Hareket Turu (Burpee, Pushup, Situp, Squad) : ");
            String tur = scanner.nextLine();
            System.out.print("Bu hareketten kac tane yapacaksiniz : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);
        }


    }
}
