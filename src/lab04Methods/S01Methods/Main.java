package lab04Methods.S01Methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        selamlama();
        faktoriyel();
    }

    public static void selamlama() {
        System.out.println("Merhaba");
        System.out.println("Hosgeldiniz");
    }

    public static void faktoriyel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }

        System.out.println(faktoriyel);
    }
}
