package lab07ObjectOrientedProgramming2.S06InnerClasses.S1NonStaticInnerClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matematik.Factorial factorial = new Matematik().new Factorial();
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan alan = new Matematik().new Alan();
        Matematik.Alan.DaireAlan daireAlan = new Matematik().new Alan().new DaireAlan();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        if (asal.asalMi(sayi)) {
            System.out.println("Bu sayi asaldir");
        } else {
            System.out.println("Bu sayi asal degildir");
        }

        factorial.faktoriyel();

        daireAlan.daireAlan(5);
    }
}
