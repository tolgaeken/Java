package lab07ObjectOrientedProgramming2.S01Interfaces;

public class Main {
    public static void main(String[] args) {
        /*PcMuhendisi muhendis1 = new PcMuhendisi(false, false);
        muhendis1.askerlikDurumuSorgula();
        muhendis1.adliSicilSorgula();
        System.out.println("Muhendis-1 Mezuniyet ortalamasi : " + muhendis1.mezuniyetOrtalamasi(3.04));
        String[] tecrube = {"Vestel", "Havelsan", "Turksat"};
        muhendis1.isTecrubesi(tecrube);*/

        MakineMuhendisi muhendis2 = new MakineMuhendisi(true,false);
        String[] tecrube2 = {};
        String[] referans = {"Tolga","Can","Murat"};
        muhendis2.adliSicilSorgula();
        muhendis2.askerlikDurumuSorgula();
        System.out.println("Muhendis-2 Mezuniyet ortalamasi : " + muhendis2.mezuniyetOrtalamasi(2.7));
        muhendis2.isTecrubesi(tecrube2);
        muhendis2.referansGetir(referans);
        muhendis2.calis();

        /*IMuhendis muhendis3 = new MakineMuhendisi(true,false);
        ((MakineMuhendisi)muhendis3).referansGetir(referans);*/

    }
}
