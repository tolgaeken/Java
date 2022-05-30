package mmc.lab.lab067Scope;

public class KapsamSinifi2 {

    private int privateDegisken = 30;

    public KapsamSinifi2() {
    }

    public void dahiliSinifKontrol() {
        DahiliSinif d = new DahiliSinif();
        System.out.println("Kontrol ediliyor" + d.a);
    }

    public class DahiliSinif {

        private int privateDegisken = 20;
        private int a = 3;

        public void onIleCarp() {
            int privateDegisken = 10;
            for (int i = 1; i < 6; i++) {
                System.out.println(i + "*" + privateDegisken + " = " + (i * privateDegisken));
            }

            System.out.println("***************************");

            for (int i = 1; i < 6; i++) {
                System.out.println(i + "*" + KapsamSinifi2.this.privateDegisken + " = " + (i * KapsamSinifi2.this.privateDegisken));
            }
        }
    }
}
