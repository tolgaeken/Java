package lab10InputOutput.S06ExerciseLog;

public class Idman {
    private int burpeeSayisi;
    private int pushupSayisi;
    private int situpSayisi;
    private int squadSayisi;

    public Idman(int burpeeSayisi, int pushupSayisi, int situpSayisi, int squadSayisi) {
        this.burpeeSayisi = burpeeSayisi;
        this.pushupSayisi = pushupSayisi;
        this.situpSayisi = situpSayisi;
        this.squadSayisi = squadSayisi;
    }

    public int getBurpeeSayisi() {
        return burpeeSayisi;
    }

    public void setBurpeeSayisi(int burpeeSayisi) {
        this.burpeeSayisi = burpeeSayisi;
    }

    public int getPushupSayisi() {
        return pushupSayisi;
    }

    public void setPushupSayisi(int pushupSayisi) {
        this.pushupSayisi = pushupSayisi;
    }

    public int getSitupSayisi() {
        return situpSayisi;
    }

    public void setSitupSayisi(int situpSayisi) {
        this.situpSayisi = situpSayisi;
    }

    public int getSquadSayisi() {
        return squadSayisi;
    }

    public void setSquadSayisi(int squadSayisi) {
        this.squadSayisi = squadSayisi;
    }

    public void hareketYap(String hareketTuru, int sayi) {
        if (hareketTuru.equals("Burpee")) {
            burpeeYap(sayi);
        } else if (hareketTuru.equals("Pushup")) {
            pushupYap(sayi);
        } else if (hareketTuru.equals("Situp")) {
            situpYap(sayi);
        } else if (hareketTuru.equals("Squad")) {
            squadYap(sayi);
        } else {
            System.out.println("Gecersiz hareket turu");
        }
    }

    public void burpeeYap(int sayi) {
        if (burpeeSayisi == 0) {
            System.out.println("Yapacak burpee kalmadi");
        }
        if (sayi >= burpeeSayisi) {
            System.out.println("Hedeflenen burpee sayisini gectiniz tebrikler");
            burpeeSayisi = 0;
            System.out.println("Kalan burpee : " + burpeeSayisi);

        } else {
            burpeeSayisi -= sayi;
            System.out.println("Kalan burpee : " + burpeeSayisi);
        }
    }

    public void pushupYap(int sayi) {
        if (pushupSayisi == 0) {
            System.out.println("Yapacak pushup kalmadi");
        }
        if (sayi >= pushupSayisi) {
            System.out.println("Hedeflenen pushup sayisini gectiniz tebrikler");
            pushupSayisi = 0;
            System.out.println("Kalan pushup : " + pushupSayisi);

        } else {
            pushupSayisi -= sayi;
            System.out.println("Kalan pushup : " + pushupSayisi);
        }
    }

    public void situpYap(int sayi) {
        if (situpSayisi == 0) {
            System.out.println("Yapacak situp kalmadi");
        }
        if (sayi >= situpSayisi) {
            System.out.println("Hedeflenen situp sayisini gectiniz tebrikler");
            situpSayisi = 0;
            System.out.println("Kalan situp : " + situpSayisi);

        } else {
            situpSayisi -= sayi;
            System.out.println("Kalan situp : " + burpeeSayisi);
        }
    }

    public void squadYap(int sayi) {
        if (squadSayisi == 0) {
            System.out.println("Yapacak squad kalmadi");
        }
        if (sayi >= squadSayisi) {
            System.out.println("Hedeflenen squad sayisini gectiniz tebrikler");
            squadSayisi = 0;
            System.out.println("Kalan squad : " + squadSayisi);

        } else {
            squadSayisi -= sayi;
            System.out.println("Kalan squad : " + squadSayisi);
        }
    }

    public boolean idmanBitiMi() {
        return (burpeeSayisi == 0) && (pushupSayisi == 0) && (situpSayisi == 0) && (squadSayisi == 0);
    }
}
