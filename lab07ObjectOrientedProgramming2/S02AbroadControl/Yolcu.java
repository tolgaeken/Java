package lab07ObjectOrientedProgramming2.S02AbroadControl;

import java.util.Scanner;

public class Yolcu implements IYurtDisiKurallari {
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yatirdiginiz harc bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Herhangi bir siyasi yasaginiz bulunuyor mu : ");
        String siyasiCevap = scanner.nextLine();
        if (siyasiCevap.equals("evet")) {
            this.siyasiYasak = true;
        } else {
            this.siyasiYasak = false;
        }

        System.out.print("Vizeniz bulunuyor mu : ");
        String vizeCevap = scanner.nextLine();
        if (vizeCevap.equals("evet")) {
            this.vizeDurumu = true;
        } else {
            this.vizeDurumu = false;
        }


    }

    @Override
    public boolean yurtdisiHarciKontrol() {
        if (this.harc < 15) {
            System.out.println("Lutfen yurtdisi cikis harcini tam yatiriniz");
            return false;
        } else {
            System.out.println("Yurtdisi harci islemi tamamlandi");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak == true) {
            System.out.println("Siyasi yasaginiz bulunuyor. Yurtdisina cikamazsiniz");
            return false;
        } else {
            System.out.println("Siyasi yasaginiz bulunmamaktadir.");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurumu == true) {
            System.out.println("Vize islemleri tammalandi");
            return true;
        } else {
            System.out.println("Vizeniz gideceginiz ulkeye bulunmamaktadir");
            return false;
        }
    }
}
