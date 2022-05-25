package mmc.lab.lab035OOPATM;

import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamiza hosgeldiniz");
        System.out.println("***************");
        System.out.println("Kullanici girisi");
        System.out.println("***************");
        int girisHakki = 3;
        while (true) {
            if (login.login(hesap)) {
                System.out.println("Giris basarili");
                break;
            } else {
                System.out.println("Giris basarisiz");
                girisHakki--;
                System.out.println("Kalan giris hakki : " + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("Giris hakkiniz kalmamistir");
                return;
            }

        }
        while (true) {
            System.out.println("***************");
            String islemler = "1 - Bakiye goruntule\n2 - Para yatir\n3 - Para cek\n4 - Cikis";
            System.out.println(islemler);
            System.out.print("Bir islem seciniz : ");
            int islem = scanner.nextInt();
            switch (islem) {
                case 1:
                    System.out.println("Bakiyeniz : " + hesap.getBakiye());
                    break;
                case 2:
                    System.out.print("Yatirmak istdiginiz tutari giriniz : ");
                    int yatirilacakTutar = scanner.nextInt();
                    scanner.nextLine();
                    hesap.paraYatir(yatirilacakTutar);
                    break;
                case 3:
                    System.out.print("Cekmek istediginiz tutar : ");
                    int cekilecekTutar = scanner.nextInt();
                    scanner.nextLine();
                    hesap.paraCek(cekilecekTutar);
                    break;
                case 4:
                    return;
            }

        }


    }
}
