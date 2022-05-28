//BU CLASS ?Ç?NDE ENCAPSULATION UYGULANMAMI?TIR

package mmc.lab.lab041Encapsulation;

public class Abone {
    public String isim;
    public int bakiye;
    public String sehir;

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
