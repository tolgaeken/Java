package mmc.lab.lab039Workers;

public class Yonetici extends Calisan {
    private int sorumluKisiSayisi;

    public Yonetici(String ad, String soyad, int id, int sorumluKisiSayisi) {
        super(ad, soyad, id);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yoneticinin sorumlu oldugu kisi sayisi : " + sorumluKisiSayisi);
    }

    public void zamYap(int zamMiktari) {
        System.out.println(getAd() + " calisanlara " + zamMiktari + " kadar zam yapiyor");
    }
}
