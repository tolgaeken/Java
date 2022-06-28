package lab09Exceptions.S06AbroadControlWithExceptions;

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

            try {
                yolcu.yurtdisiHarciKontrol();
            } catch (HarcException e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("Siyasi yasak kontrol ediliyor");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }

            try {
                yolcu.siyasiYasakKontrol();
            } catch (SiyasiException e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("Vize durumu kontrol ediliyor");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }

            try {
                yolcu.vizeDurumuKontrol();
            } catch (VizeException e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("Islemleriniz tamamlandi. Yurtdisina cikabilirsiniz");
            break;

        }

    }
}
