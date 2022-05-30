package mmc.lab.lab059ShapeAreaCalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String islemler = "Islemler\n" +
                "1 - Kare alan hesapla\n" +
                "2 - Ucgen alan hesapla\n" +
                "3 - Daire alan hesapla\n" +
                "4 - Cikis";

        while (true) {
            System.out.println(islemler);
            System.out.print("Hangi seklin alanini hesaplamak istiyorsunuz : ");
            String sekilTuru = scanner.nextLine();
            Sekil sekil = null;

            if (sekilTuru.equals("4")) {
                System.out.println("Programdan cikiliyor");
                break;
            } else if (sekilTuru.equals("1")) {
                System.out.print("Karenin kenari : ");
                int kenar = scanner.nextInt();
                scanner.nextLine();

                sekil = new Kare("Kare1", kenar);
                sekil.alanHesapla();
            } else if (sekilTuru.equals("2")) {
                System.out.print("Ucken Kenar-1 : ");
                int kenar1 = scanner.nextInt();
                System.out.print("Ucken Kenar-2 : ");
                int kenar2 = scanner.nextInt();
                System.out.print("Ucken Kenar-3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();

                sekil = new Ucgen("Ucgen1", kenar1, kenar2, kenar3);
                sekil.alanHesapla();
            } else if (sekilTuru.equals("3")) {
                System.out.print("Dairenin yaricapi : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();

                sekil = new Daire("Daire1", yaricap);
                sekil.alanHesapla();
            } else {
                System.out.println("Gecersiz islem");
            }
        }
    }
}
