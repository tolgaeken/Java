package mmc.lab;

import java.util.Scanner;

public class lab004Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String isim = scanner.nextLine();
        int yas = scanner.nextInt();
        System.out.println("Yas: " + yas);
        System.out.println("Isim: " + isim);
    }
}
