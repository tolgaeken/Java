package lab07ObjectOrientedProgramming2.S07SimpleProblems;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik ve Fizik problemleri programina hosgeldiniz");
        String islemler = "Islemler\n1 - Daire alan hesapla\n2 - Ucgen cevresi hesapla\n3 - Iki vektorun ic carpimini hesaplama\n4 - Cikis";

        while (true) {
            System.out.println(islemler);
            System.out.print("Islemi seciniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("4")) {
                System.out.println("Programdan cikiliyor");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Dairenin yaricapi : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();

                Problem.Matematik.daireAlan(yaricap);
            } else if (islem.equals("2")) {
                System.out.print("Kenar-1 : ");
                int kenar1 = scanner.nextInt();
                System.out.print("Kenar-2 : ");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar-3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();

                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
            } else if (islem.equals("3")) {
                Vec vec1 = new Vec("Vector1");
                Vec vec2 = new Vec("Vector2");

                Problem.Fizik.icCarpim(vec1, vec2);
            } else {
                System.out.println("Gecersiz Islem");
            }
        }
    }
}
