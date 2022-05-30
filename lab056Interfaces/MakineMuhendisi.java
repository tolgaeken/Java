package mmc.lab.lab056Interfaces;

public class MakineMuhendisi implements IMuhendis,ICalismaSekli {

    private boolean askerlik;
    private boolean adliSicil;

    public MakineMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }


    @Override
    public void askerlikDurumuSorgula() {
        if (askerlik) {
            System.out.println("Askerligimi yaptim");
        } else {
            System.out.println("Askerligimi henuz yapmadim");
        }
    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "Ortalamam : " + derece;
    }

    @Override
    public void adliSicilSorgula() {
        if (adliSicil) {
            System.out.println("Adli sicil kaydim bulunuyor");
        } else {
            System.out.println("Adli sicil kaydim bulunmuyor");
        }
    }

    @Override
    public void isTecrubesi(String[] array) {
        if (array.length == 0) {
            System.out.println("Herhangi bir is tecrubem bulunmuyor");
        } else {
            System.out.println("Makine muhendisi olarak su sirketlerde calistim");

            for (String s : array) {
                System.out.println(s);
            }
        }
    }

    public void referansGetir (String[] array){
        if (array.length == 0){
            System.out.println("herhangi bir referansim bulunmuyor");
        } else {
            System.out.println("Referanslarim");

            for (String s : array) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void calis() {
        System.out.println("Calisiyor");
    }
}
