package lab09Exceptions.S06AbroadControlWithExceptions;


import java.util.Scanner;

public class Yolcu {
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

    public void yurtdisiHarciKontrol() throws HarcException{
        if (this.harc < 15) {
            throw new HarcException();
        } else {
            System.out.println("Yurtdisi harci islemi tamamlandi");
        }
    }

    public void siyasiYasakKontrol() throws SiyasiException{
        if (this.siyasiYasak == true) {
            throw new SiyasiException();
        } else {
            System.out.println("Siyasi yasaginiz bulunmamaktadir.");
        }
    }

    public void vizeDurumuKontrol() throws VizeException{
        if (this.vizeDurumu == true) {
            System.out.println("Vize islemleri tamamlandi");
        } else {
            throw new VizeException();
        }
    }
}

class SiyasiException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasaginiz bulunuyor");
    }
}

class VizeException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Gideceginiz ulkeye vizeniz bulunmamaktadir");
    }
}

class HarcException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Lutfen yurtdisi harcini tam yatiriniz");
    }
}
