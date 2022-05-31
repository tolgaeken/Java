package mmc.lab.lab012FindMaxNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz : ");
        int birinciSayi = scanner.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        int ikinciSayi = scanner.nextInt();
        System.out.print("Ucuncu sayiyi giriniz : ");
        int ucuncuSayi = scanner.nextInt();

        int max = -1;

        if (birinciSayi >= ikinciSayi && birinciSayi >= ucuncuSayi) {
            max = birinciSayi;
        } else if (ikinciSayi >= birinciSayi && ikinciSayi >= ucuncuSayi) {
            max = ikinciSayi;
        } else if (ucuncuSayi >= birinciSayi && ucuncuSayi >= ikinciSayi) {
            max = ucuncuSayi;
        }

        System.out.println("En buyuk sayi : " + max);
    }
}
