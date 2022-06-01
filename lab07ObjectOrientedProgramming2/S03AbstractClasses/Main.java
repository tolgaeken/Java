package lab07ObjectOrientedProgramming2.S03AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Kare kare = new Kare("Kare1",5);
        Daire daire = new Daire("Daire1",3);

        kare.alanHesapla();
        daire.alanHesapla();
        kare.cevreHesapla();

        Sekil sekil;
        sekil = new Kare("Kare2",6);
        sekil.alanHesapla();
        //sekil.cevreHesapla();
    }
}
