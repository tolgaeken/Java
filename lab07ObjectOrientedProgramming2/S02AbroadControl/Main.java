package lab07ObjectOrientedProgramming2.S02AbroadControl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sabiha Gokcen havalimanina hosgeldiniz");
        String sartlar = "Yurtdisi cikis kurallari\n"
                + "Herhangi bir siyasi yasaginizin bulunmamasi gerekiyor\n"
                + "15 TL harc bedelini tam olarak yatirmaniz gerekiyor\n"
                + "Gideceginiz ulkye vizenizin bulunmasi gerekiyor";

        String message = "Yurtdisi sartlarindan hepsini saglamaniz gerekiyor";

        while (true) {
            System.out.println("************");
            System.out.println(sartlar);
            System.out.println("************");

            Yolcu yolcu = new Yolcu();

            System.out.println("Harc bedeli kontrol ediliyor");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            if (yolcu.yurtdisiHarciKontrol() == false) {
                System.out.println(message);
                continue;
            }

            System.out.println("Siyasi yasak kontrol ediliyor");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            if (yolcu.siyasiYasakKontrol() == false) {
                System.out.println(message);
                continue;
            }

            System.out.println("Vize durumu kontrol ediliyor");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            if (yolcu.vizeDurumuKontrol() == false) {
                System.out.println(message);
                continue;
            }

            System.out.println("Islemleriniz tamamlandi. Yurtdisina cikabilirsiniz");
            break;

        }

    }
}
