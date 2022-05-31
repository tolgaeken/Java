package mmc.lab.lab021ArmstrongNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayiyi giriniz : ");
        int sayi = scanner.nextInt();
        System.out.print("Basamak sayisi : ");
        int basamakSayisi = scanner.nextInt();
        int geciciSayi = sayi;
        int toplam = 0;

        do {
            int basamakDegeri = geciciSayi % 10;
            geciciSayi /= 10;

            toplam += Math.pow(basamakDegeri, basamakSayisi);

        } while (geciciSayi > 0);

        if (sayi == toplam) {
            System.out.println("Bu sari bir Armstrong sayisidir");
        } else {
            System.out.println("Bu sayi bir Armstrong sayisi degildir");
        }
    }
}
