package mmc.lab.lab024InterestCalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamiza Hosgeldiniz. Faiz Orani %6 olarak belirlenmistir.");
        int anapara, vade;
        System.out.print("Yatirmak istediginiz tutari giriniz : ");
        anapara = scanner.nextInt();
        System.out.print("Paranizi kac yil vadeli yatirmak istiyorsunuz? ");
        vade = scanner.nextInt();

        double toplamPara = anapara;
        double faizOrani = 0.06;

        for (int i = 1; i <= vade; i++) {
            toplamPara = (toplamPara * faizOrani) + toplamPara;

            System.out.println(i + " yilin sonunda toplam para : " + toplamPara);
        }


    }
}
