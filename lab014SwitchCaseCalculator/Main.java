package mmc.lab.lab014SwitchCaseCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "1 - Toplama\n2 - Cikarma\n3 - Carpma\n4 - Bolme";
        System.out.println(islemler);
        int islem = scanner.nextInt();
        System.out.print("Birinci sayi : ");
        int a = scanner.nextInt();
        System.out.print("Ikinci sayi : ");
        int b = scanner.nextInt();
        switch (islem) {
            case 1:
                System.out.println("Toplam : " + (a + b));
                break;
            case 2:
                System.out.println("Fark : " + (a - b));
                break;
            case 3:
                System.out.println("Carpim : " + (a * b));
                break;
            case 4:
                System.out.println("Bolum : " + ((double) a / b));
        }
    }
}
