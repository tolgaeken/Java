package mmc.lab;

import java.util.Scanner;

public class lab007SwapTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birinciSayi;
        int ikinciSayi;

        System.out.print("Birinci Sayi : ");
        birinciSayi = scanner.nextInt();


        System.out.print("Ikinci Sayi : ");
        ikinciSayi = scanner.nextInt();

        System.out.println("Degistirilmeden once");
        System.out.println("Birinci : " + birinciSayi + ", Ikinci: " + ikinciSayi);

        int temp;
        temp = birinciSayi;
        birinciSayi = ikinciSayi;
        ikinciSayi = temp;

        System.out.println("Degistirildikten sonra");
        System.out.println("Birinci : " + birinciSayi + ", Ikinci: " + ikinciSayi);
    }
}
