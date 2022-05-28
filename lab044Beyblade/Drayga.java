package mmc.lab.lab044Beyblade;

public class Drayga extends Beyblade{
    private String kutsalCanavar;

    public Drayga(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    public String getKutsalCanavar() {
        return kutsalCanavar;
    }

    public void setKutsalCanavar(String kutsalCanavar) {
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ortaya cikariyor");
        System.out.println(getBeybladeci()+ " saldirisi : Kaplan pencesi");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adi : " + kutsalCanavar);
    }
}
