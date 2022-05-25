package mmc.lab;

import java.util.Scanner;

public class lab006FuelConsumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Araciniz km de kac kurus yakiyor");
        double kurus = scanner.nextDouble();
        System.out.println("Kac km yol gidildi");
        int km = scanner.nextInt();

        System.out.println("Toplam odenecek tutar : " + (kurus * km / 100) + "TL'dir.");
    }
}
