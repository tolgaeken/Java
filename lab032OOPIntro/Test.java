package mmc.lab.lab032OOPIntro;

public class Test {
    public static void main(String[] args) {
        Araba araba1 = new Araba();
        araba1.setModel("Renault");
        System.out.println("Arabanin model : " + araba1.getModel());
        araba1.setKapilar(-4);
        System.out.println(araba1.getKapilar());

        /*Araba araba2;
        araba2.setKapilar(3);*/

        /*Araba araba3;
        araba3.setModel("Renault");*/
    }
}
