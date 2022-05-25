package mmc.lab;

import java.util.Scanner;

public class lab031AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************");
        String islemler = "1 - Toplama\n2 - Cikarma\n3 - Carpma\n4 - Bolme\n5 - Cikis";
        System.out.println("************************");

        while (true) {
            System.out.println(islemler);
            System.out.print("Islem seciniz : ");
            int islemNo = scanner.nextInt();
            switch (islemNo) {
                case 1:
                    System.out.println("1 - 2 sayi topla\n2 - 3 sayi topla");
                    System.out.print("Kac sayi toplanacak : ");
                    int toplamaTerimSayisi = scanner.nextInt();
                    switch (toplamaTerimSayisi) {
                        case 1:
                            System.out.print("Birinci sayiyi giriniz : ");
                            int ikiliToplamaBirinciSayi = scanner.nextInt();
                            System.out.print("Ikinci sayiyi giriniz : ");
                            int ikiliToplamaIkinciSayi = scanner.nextInt();
                            System.out.println(ikiliToplamaBirinciSayi + " ve " + ikiliToplamaIkinciSayi + " sayilarinin toplami = " + toplama(ikiliToplamaBirinciSayi, ikiliToplamaIkinciSayi));
                            break;
                        case 2:
                            System.out.print("Birinci sayiyi giriniz : ");
                            int ucluToplamaBirinciSayi = scanner.nextInt();
                            System.out.print("Ikinci sayiyi giriniz : ");
                            int ucluToplamaIkinciSayi = scanner.nextInt();
                            System.out.print("Ikinci sayiyi giriniz : ");
                            int ucluToplamaUcuncuSayi = scanner.nextInt();
                            System.out.println(ucluToplamaBirinciSayi + " ," + ucluToplamaIkinciSayi + " ve " + ucluToplamaUcuncuSayi + " sayilarinin toplami = " + toplama(ucluToplamaBirinciSayi, ucluToplamaIkinciSayi, ucluToplamaUcuncuSayi));
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Birinci sayiyi giriniz : ");
                    int cikarmaBirinciSayi = scanner.nextInt();
                    System.out.print("Ikinci sayiyi giriniz : ");
                    int cikarmaIkinciSayi = scanner.nextInt();
                    System.out.println(cikarmaBirinciSayi + " ve " + cikarmaIkinciSayi + " sayilarinin farki : " + cikarma(cikarmaBirinciSayi, cikarmaIkinciSayi));
                    break;
                case 3:
                    System.out.println("1 - 2 sayi carp\n2 - 3 sayi carp");
                    System.out.print("Kac sayi carpilacak : ");
                    int carpmaTerimSayisi = scanner.nextInt();
                    switch (carpmaTerimSayisi) {
                        case 1:
                            System.out.print("Birinci sayiyi giriniz : ");
                            int ikiliCarpmaBirinciSayi = scanner.nextInt();
                            System.out.print("Ikinci sayiyi giriniz : ");
                            int ikiliCarpmaIkinciSayi = scanner.nextInt();
                            System.out.println(ikiliCarpmaBirinciSayi + " ve " + ikiliCarpmaIkinciSayi + " sayilarinin carpimi = " + carpma(ikiliCarpmaBirinciSayi, ikiliCarpmaIkinciSayi));
                            break;
                        case 2:
                            System.out.print("Birinci sayiyi giriniz : ");
                            int ucluCarpmaBirinciSayi = scanner.nextInt();
                            System.out.print("Ikinci sayiyi giriniz : ");
                            int ucluCarpmaIkinciSayi = scanner.nextInt();
                            System.out.print("Ikinci sayiyi giriniz : ");
                            int ucluCarpmaUcuncuSayi = scanner.nextInt();
                            System.out.println(ucluCarpmaBirinciSayi + " ," + ucluCarpmaIkinciSayi + " ve " + ucluCarpmaUcuncuSayi + " sayilarinin carpimi = " + carpma(ucluCarpmaBirinciSayi, ucluCarpmaIkinciSayi, ucluCarpmaUcuncuSayi));
                            break;
                    }
                    break;

                case 4:
                    System.out.print("Birinci sayiyi giriniz : ");
                    int bolmeBirinciSayi = scanner.nextInt();
                    System.out.print("Ikinci sayiyi giriniz : ");
                    int bolmeIkinciSayi = scanner.nextInt();
                    System.out.println(bolmeBirinciSayi + " ve " + bolmeIkinciSayi + " sayilarinin bolumu : " + bolme(bolmeBirinciSayi, bolmeIkinciSayi));
                    break;
            }
            if (islemNo == 5) {
                System.out.println("Cikis yapiliyor");
                break;
            }
        }
    }

    public static int cikarma(int a, int b) {
        return (a - b);
    }

    public static double bolme(int a, int b) {
        return ((double) a / b);
    }

    public static int toplama(int a, int b) {
        return (a + b);
    }

    public static int toplama(int a, int b, int c) {
        return (a + b + c);
    }

    public static int carpma(int a, int b) {
        return (a * b);
    }

    public static int carpma(int a, int b, int c) {
        return (a * b * c);
    }

}
