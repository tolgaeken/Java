package lab03Loops.S02WhileLoop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int i = 10;
        while (i < 100) {
            System.out.println(i);
            i+=3;
        }*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;
        while (sayi > 0) {
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println(faktoriyel);
    }
}
