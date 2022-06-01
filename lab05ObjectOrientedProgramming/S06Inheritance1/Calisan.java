package lab05ObjectOrientedProgramming.S06Inheritance1;

public class Calisan {

    private String isim;
    private int maas;
    private String departman;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public Calisan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }

    public void calis() {
        System.out.println("Calisan calisiyor");

    }

    public void bilgileriGoster() {
        System.out.println("Isim : " + isim);
        System.out.println("Maas : " + maas);
        System.out.println("Departman : " + departman);

    }

    public void departmanDegistir(String yeniDepartman) {
        System.out.println("Departman degistiriliyor...");
        this.departman = yeniDepartman;
        System.out.println("Yeni departman : " + this.departman);
    }
}
