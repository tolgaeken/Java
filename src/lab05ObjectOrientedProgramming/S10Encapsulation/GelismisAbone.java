package lab05ObjectOrientedProgramming.S10Encapsulation;

public class GelismisAbone {
    private String isim;
    private int bakiye = 120;
    private String sehir;

    public GelismisAbone(String isim, int bakiye, String sehir) {
        this.isim = isim;

        if (bakiye>=0 && bakiye<=120){
            this.bakiye = bakiye;
        }

        this.sehir = sehir;
    }

    public void dogalgazKullan(int miktar){
        if (miktar >= this.bakiye){
            System.out.println("Yeterli bakiye bulunmamaktadir");
        } else {
            this.bakiye -= miktar;

            if (miktar >= this.bakiye){
                System.out.println("Bakiyeniz 0 olmustur\nLutfen en yakin abone merkezine girip kredi yukleyiniz\nKredi limiti = 120 TL");
            } else {
                System.out.println("Yeni bakiye : " + bakiye);
            }
        }
    }

    public void bakiyeOgren(){
        System.out.println("Bakiyeniz : " + bakiye);
    }
}
