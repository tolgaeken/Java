package mmc.lab.lab035OOPATM;

public class Hesap {
    private String kullaniciAdi;
    private String parola;
    private int bakiye;

    public Hesap(String kullaniciAdi, String parola, int bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public void paraYatir(int tutar) {
        bakiye += tutar;
        System.out.println(tutar + "TL yatirdikten sonra bakiyeniz : " + bakiye);
    }

    public void paraCek(int tutar) {
        if (tutar > bakiye) {
            System.out.println("Yeterli bakiye mevcut degil");
        } else {
            bakiye -= tutar;
            System.out.println(tutar + "TL cektikten sonra bakiyeniz : " + bakiye);
        }
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
}
