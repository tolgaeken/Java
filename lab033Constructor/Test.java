package mmc.lab.lab033Constructor;

public class Test {
    public static void main(String[] args) {
        /*Account account1 = new Account();*/

        /*Account account2 = new Account("114131", 1000.0, "Tolga", "tolga@tolga.com", "05542185");
        System.out.println("Ilk bakiyeniz : " + account2.getBakiye());
        account2.paraYatir(500);
        account2.paraCekme(700);*/

        /*Account account1 = new Account();
        System.out.println(account1.getEmail());*/

        Account account2 = new Account("Ahmet", "example.gmail.com", "054651");
        System.out.println(account2.getEmail());
        System.out.println(account2.getBakiye());
        System.out.println("****************");
        account2.bilgileriGoster();
    }
}