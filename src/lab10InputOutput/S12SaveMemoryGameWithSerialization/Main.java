package lab10InputOutput.S12SaveMemoryGameWithSerialization;

import java.io.File;
import java.util.Scanner;

public class Main {

    private static Kart[][] kartlar = new Kart[4][4];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        kayittanAl();

        while (oyunBittimi() == false) {
            oyunTahtasi();
            System.out.print("Cikis icin q ya, devam etmek için enter a basin : ");
            String cikis = scanner.nextLine();
            if (cikis.equals("q")){
                System.out.print("Oyunu kaydetmek istiyor musunuz ? (yes ya da no) : ");
                String kayit = scanner.nextLine();
                if (kayit.equals("yes")){
                    OyunKayit.oyunKaydet(kartlar);
                } else if (kayit.equals("no")) {
                    System.out.println("Oyun kaydedilmedi");
                }
                System.out.println("Programdan cikiliyor");
                break;
            }



            tahminEt();
        }
    }

    public static void oyunTahtasi() {
        System.out.println("_______________________");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTahmin()) {
                    System.out.print(" |" + kartlar[i][j].getDeger() + "| ");

                } else {
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
            System.out.println("_______________________");
        }
    }

    public static boolean oyunBittimi() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTahmin() == false) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void tahminEt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci tahmin (i ve j degerlerini bir boslukla giriniz) : ");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();


        kartlar[i1][j1].setTahmin(true);
        oyunTahtasi();

        System.out.print("Ikinci tahmin (i ve j degerlerini bir boslukla giriniz) : ");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();

        if (kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()) {
            System.out.println("Dogru tahmin");
            kartlar[i2][j2].setTahmin(true);
        } else {
            System.out.println("Yanlis tahmin");
            kartlar[i1][j1].setTahmin(false);
        }
    }

    public static void kayittanAl(){
        File file = new File(OyunKayit.filePath);
        Scanner scanner = new Scanner(System.in);
        if (file.exists()){
            System.out.print("Kaydedilmis bir oyununuz var. Kayittan devam etmek istermisiniz (yes)");
            String cevap = scanner.nextLine();
            if (cevap.equals("yes")){
                kartlar = OyunKayit.kayittanAl();
                return;
            }
        }

        kartlar[0][0] = new Kart('E');
        kartlar[0][1] = new Kart('A');
        kartlar[0][2] = new Kart('B');
        kartlar[0][3] = new Kart('F');
        kartlar[1][0] = new Kart('G');
        kartlar[1][1] = new Kart('A');
        kartlar[1][2] = new Kart('D');
        kartlar[1][3] = new Kart('H');
        kartlar[2][0] = new Kart('F');
        kartlar[2][1] = new Kart('C');
        kartlar[2][2] = new Kart('D');
        kartlar[2][3] = new Kart('H');
        kartlar[3][0] = new Kart('E');
        kartlar[3][1] = new Kart('G');
        kartlar[3][2] = new Kart('B');
        kartlar[3][3] = new Kart('C');
    }
}
