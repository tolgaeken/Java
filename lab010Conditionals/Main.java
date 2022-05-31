package mmc.lab.lab010Conditionals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yasinizi giriniz : ");
        int yas = scanner.nextInt();
        if (yas > 18 && yas < 61) {
            System.out.println("Hosgeldiniz");
        } else if (yas > 90) {
            System.out.println("Hatali yas bilgisi");
        } else {
            System.out.println("Resit degilsiniz");
        }
    }
}
