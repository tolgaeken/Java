package lab05ObjectOrientedProgramming.S10Encapsulation;

public class Main {
    public static void main(String[] args) {
        /*Abone abone = new Abone();
        abone.isim = "Tolga";
        abone.bakiye = 200;
        abone.sehir = "Ankara";

        abone.dogalgazKullan(200);*/

        GelismisAbone abone = new GelismisAbone("Tolga", 200, "Ankara");
        abone.bakiyeOgren();
    }
}
