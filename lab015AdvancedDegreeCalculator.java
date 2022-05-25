package mmc.lab;

import java.util.Scanner;

public class lab015AdvancedDegreeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize - 1 : ");
        int vize1 = scanner.nextInt();
        System.out.print("Vize - 2 : ");
        int vize2 = scanner.nextInt();
        System.out.print("Final : ");
        int finalnot = scanner.nextInt();
        System.out.print("Ortalama : ");
        double ortalama = scanner.nextDouble();

        double not = (vize1 * 0.3) + (vize2 * 0.3) + (finalnot * 0.4);

        if (not >= 90) {
            System.out.println("AA");
        } else if (not >= 85) {
            System.out.println("BA");
        } else if (not >= 80) {
            System.out.println("BB");
        } else if (not >= 75) {
            System.out.println("CB");
        } else if (not >= 70) {
            System.out.println("CC");
        } else if (not >= 65) {
            if (ortalama > 2) {
                System.out.println("DC ve Ortalama ile gectiniz");
            } else {
                System.out.println("DC ve Ortalama ile kaldiniz");
            }
        } else if (not >= 60) {
            if (ortalama > 2) {
                System.out.println("DD ve Ortalama ile gectiniz");
            } else {
                System.out.println("DD ve Ortalama ile kaldiniz");
            }
        } else if (not < 60) {
            System.out.println("FF");
        }
    }
}
