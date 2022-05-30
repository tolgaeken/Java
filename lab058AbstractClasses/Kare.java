package mmc.lab.lab058AbstractClasses;

public class Kare extends Sekil {

    private int kenar;

    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim() + " alani : " + (kenar * kenar));
    }

    public void cevreHesapla() {
        System.out.println(getIsim() + " cevresi : " + (4 * kenar));
    }
}
