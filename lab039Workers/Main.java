package mmc.lab.lab039Workers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calisanlar programina hosgeldiniz");
        String islemler = "Islemler\n1 - Yazilimci islemleri\n2 - Yonetici islemleri\n3 - Cikis";
        String yazilimciIslem = "1 - Format at\n2 - Bilgileri goster\n3 - Cikis";
        String yoneticiIslem = "Yonetici Islemleri\n1 - Zam yap\n2 - Bilgileri goster\n3 - Cikis";


        while (true){
            System.out.println("***************");
            System.out.println(islemler);
            System.out.println("***************");
            System.out.print("Islem seciniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("3")){
                System.out.println("Programdan cikiliyor");
                break;
            } else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Tolga","E",22,"Python, Java");
                while (true){
                    System.out.println("***************");
                    System.out.println(yazilimciIslem);
                    System.out.println("***************");
                    System.out.print("Islemi seciniz : ");
                    String yazIslem = scanner.nextLine();
                    if (yazIslem.equals("3")){
                        System.out.println("Yazilimci islemlerinden cikiliyor");
                        break;
                    } else if (yazIslem.equals("1")){
                        System.out.print("Isletim sistemi : ");
                        String isletimSistemi = scanner.nextLine();
                        yazilimci.formatAt(isletimSistemi);
                    } else if (yazIslem.equals("2")){
                        yazilimci.bilgileriGoster();
                    } else {
                        System.out.println("Gecersiz yazilimci islemi");
                    }
                }
            } else if (islem.equals("2")){
                Yonetici yonetici = new Yonetici("Ahmet","B",123,10);
                while (true){
                    System.out.println("***************");
                    System.out.println(yoneticiIslem);
                    System.out.println("***************");
                    System.out.print("Islemi seciniz : ");
                    String yonIslem = scanner.nextLine();
                    if (yonIslem.equals("3")){
                        System.out.println("Yonetici islemlerinden cikiliyor");
                        break;
                    } else if (yonIslem.equals("1")){
                        System.out.print("Yoneticinin ne kadar zam yapmasini istiyorsunuz : ");
                        int zamMiktar = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktar);
                    } else if (yonIslem.equals("2")){
                        yonetici.bilgileriGoster();
                    } else {
                        System.out.println("Gecersiz yonetici islemi");
                    }
                }
            } else {
                System.out.println("Gecersiz islem");
            }


        }
    }
}
