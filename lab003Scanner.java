package mmc.lab;

import java.util.Scanner;

public class lab003Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Adinizi Giriniz :\n");
        String ad = scanner.nextLine();
        System.out.println("Adiniz : " + ad);

        System.out.println("Lutfen Yasinizi Giriniz :\n");

        if (scanner.hasNextInt()) {
            int yas = scanner.nextInt();
            System.out.println("Yasiniz : " + yas);
        } else {
            System.out.println("Lutfen bir sayi giriniz");
        }

    }
}
