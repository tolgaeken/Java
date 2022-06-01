package lab08CollectionFramework.S15EmergencyAppWithPriorityQueue;

public class Hasta implements Comparable<Hasta> {
    private String isim;
    private String sikayet;
    private int oncelik;

    public Hasta(String isim, String sikayet) {
        this.isim = isim;
        this.sikayet = sikayet;

        if (sikayet.equals("apandisit")) {
            this.oncelik = 3;
        } else if (sikayet.equals("yanik")) {
            this.oncelik = 2;
        } else {
            this.oncelik = 1;
        }
    }

    @Override
    public String toString() {
        String bilgiler = "Hasta adi : " + isim + "\nSikayet : " + sikayet + "\nOncelik : " + oncelik;

        return bilgiler;
    }

    @Override
    public int compareTo(Hasta hasta) {
        if (this.oncelik > hasta.oncelik){
            return -1;
        } else if (this.oncelik < hasta.oncelik){
            return 1;
        } else {
            return 0;
        }
    }
}
