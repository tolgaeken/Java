package lab07ObjectOrientedProgramming2.S12Scope;

public class KapsamSinifi {
    private int privateDegisken = 30;

    public KapsamSinifi() {
        System.out.println("privateDegisken : " + privateDegisken);
    }

    public void onIleCarp() {
        int privateDegisken = 10;
        for (int i = 1; i < 6; i++) {
            System.out.println(i + "*" + privateDegisken + " = " + (i * privateDegisken));
        }
        System.out.println("*****************");
        for (int i = 1; i < 6; i++) {
            System.out.println(i + "*" + this.privateDegisken + " = " + (i * this.privateDegisken));
        }
    }
}
