package mmc.lab;

import java.util.Scanner;

public class lab005CalculateBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilo Giriniz : ");
        int kilo = scanner.nextInt();
        System.out.print("Boy Giriniz : ");
        double boy = scanner.nextDouble();
        double bki = (kilo / (boy * boy)) * 10000;
        System.out.println("Bki : " + bki);
    }
}
