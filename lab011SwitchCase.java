package mmc.lab;

import java.util.Scanner;

public class lab011SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        int sayi = scanner.nextInt();

        switch (sayi) {
            case 1:
                System.out.println("Sayi = 1");
                break;
            case 2:
                System.out.println("Sayi = 2");
                break;
            case 3:
            case 4:
                System.out.println("Sayi = 3 yada 4");
                break;
            default:
                System.out.println("Sayi 1 2 3 ya da 4 degil");
                break;
        }
    }
}
