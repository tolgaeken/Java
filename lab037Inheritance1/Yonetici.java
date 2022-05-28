package mmc.lab.lab037Inheritance1;

public class Yonetici extends Calisan {
    private int sorumluKisiSayisi;

    public Yonetici(String isim, int maas, String departman, int sorumluKisiSayisi) {
        /*this.isim = isim;
        this.maas = maas;
        this.departman = departman;*/

        super(isim, maas, departman);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }

    public void zamYap(int zamMiktari) {
        System.out.println("Calisanlara zam yapildi");
    }

    public void bilgileriGoster() {
        /*System.out.println("Isim : " + getIsim());
        System.out.println("Maas : " + getMaas());
        System.out.println("Departman : " + getDepartman());*/
        super.bilgileriGoster();
        System.out.println("Sorumlu kisi sayisi : " + this.sorumluKisiSayisi);
    }
}
