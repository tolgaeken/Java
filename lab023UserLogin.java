package mmc.lab;

import java.util.Scanner;

public class lab023UserLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int girisHakki = 3;
        String sysKullaniciAdi = "Tolga";
        String sysParola = "12345";

        System.out.println("*********************");
        System.out.println("Kullanici girisine hosgeldiniz");
        System.out.println("*********************");

        while (true) {
            System.out.print("Kullanici adi : ");
            String kullaniciAdi = scanner.nextLine();
            System.out.print("Parola : ");
            String parola = scanner.nextLine();

            if (kullaniciAdi.equals(sysKullaniciAdi) && parola.equals(sysParola)) {
                System.out.println("Hosgeldiniz " + kullaniciAdi);
                break;
            } else if (kullaniciAdi.equals(sysKullaniciAdi) && !parola.equals(sysParola)) {
                System.out.println("Parola yanlis");
                girisHakki -= 1;
                System.out.println("Kalan giris hakki : " + girisHakki);
            } else if (!kullaniciAdi.equals(sysKullaniciAdi) && parola.equals(sysParola)) {
                System.out.println("Kullanici adi yanlis");
                girisHakki -= 1;
                System.out.println("Kalan giris hakki : " + girisHakki);

            } else {
                System.out.println("Kullanici adi ve parola yanlis");
                girisHakki -= 1;
                System.out.println("Kalan giris hakki : " + girisHakki);

            }

            if (girisHakki == 0) {
                System.out.println("Giris hakkiniz bitmistir. Tekrar deneyiniz...");
                break;
            }


        }
    }
}
