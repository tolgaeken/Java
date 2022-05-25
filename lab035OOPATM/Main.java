package mmc.lab.lab035OOPATM;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Tolga", "12345", 2000);
        atm.calis(hesap);
        System.out.println("Programdan Cikiliyor");
    }
}
